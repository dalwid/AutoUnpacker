package app;

import java.io.*;
import java.nio.file.*;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class AutoUnpacker {

    private String WATCH_DIR;

    public void watchDir(String varPaths) throws IOException, InterruptedException {
        Path dir = Paths.get(varPaths);
        this.WATCH_DIR = varPaths;

        WatchService watchService = FileSystems.getDefault().newWatchService();
        dir.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);

        System.out.println("Monitorando a pasta: " + this.WATCH_DIR);

        while (true) {
            WatchKey key = watchService.take();
            for (WatchEvent<?> event : key.pollEvents()) {
                WatchEvent.Kind<?> kind = event.kind();

                if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
                    WatchEvent<Path> ev = (WatchEvent<Path>) event; // Converte corretamente
                    Path filePath = dir.resolve(ev.context());
                    String fileName = filePath.getFileName().toString();

                    if (fileName.endsWith(".zip")) {
                        System.out.println("Arquivo ZIP detectado: " + fileName);
                        unZip(filePath.toString(), dir.toString());
                    }
                }
            }
            if (!key.reset()) {
                System.out.println("Monitoramento encerrado.");
                break;
            }
        }
    }

    private void unZip(String zipFilePath, String destDir) {
        try (ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry entry;
            while ((entry = zipIn.getNextEntry()) != null) {
                Path filePath = Paths.get(destDir, entry.getName());
                if (!entry.isDirectory()) {
                    extractFile(zipIn, filePath);
                } else {
                    Files.createDirectories(filePath);
                }
                zipIn.closeEntry();
            }
            System.out.println("Arquivo ZIP descompactado: " + zipFilePath);
        } catch (IOException e) {
            System.err.println("Erro ao descompactar o ZIP: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void extractFile(InputStream in, Path filePath) throws IOException {
        Files.createDirectories(filePath.getParent());
        try (OutputStream out = Files.newOutputStream(filePath)) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
        }
    }

    public void setWatchDir(String watchDir) {
        this.WATCH_DIR = watchDir;
    }

    public String getWatchDir() {
        return this.WATCH_DIR;
    }
}
