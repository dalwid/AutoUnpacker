package app;

import java.io.*;
import java.nio.file.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class AutoUnpacker {

    private String WATCH_DIR;

    private Path myPath(String varWatchDir){
        Path dir = Paths.get(varWatchDir);
        return dir;
    }

    public void watchDir(String varPaths) throws IOException, InterruptedException {
        var dir = this.myPath(varPaths);
        WatchService watchService = FileSystems.getDefault().newWatchService();

        dir.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
        System.out.println("Monitorando a pasta: " + this.getWatchDir());

        while (true){
            WatchKey key = watchService.take();
            for (WatchEvent<?>event : key.pollEvents()){
                WatchEvent.Kind<?> kind = event.kind();

                if(kind == StandardWatchEventKinds.ENTRY_CREATE){
                    Path filePath = dir.resolve((Path) event.context());
                    String fileName = filePath.getFileName().toString();

                    if(fileName.endsWith(".zip")){
                        unZip(filePath.toString(), dir.toString());
                    }
                }
            }
            key.reset();
        }

    }

    private void unZip(String zipFilePath, String destDir) {
        try (ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry entry = zipIn.getNextEntry();
            while (entry != null) {
                Path filePath = Paths.get(destDir, entry.getName());
                if (!entry.isDirectory()) {
                    extractFile(zipIn, filePath);
                } else {
                    Files.createDirectories(filePath);
                }
                zipIn.closeEntry();
                entry = zipIn.getNextEntry();
            }
            System.out.println("Arquivo ZIP descompactado: " + zipFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setWatchDir(String watchDir){ this.WATCH_DIR = watchDir; }
    public String getWatchDir(){ return this.WATCH_DIR; }

    private void extractFile(InputStream in, Path filePath) throws IOException {
        Files.createDirectories(filePath.getParent());
        try (OutputStream out = new FileOutputStream(filePath.toFile())) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
        }
    }


}
