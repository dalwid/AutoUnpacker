package app;

import java.io.IOException;
import java.util.Scanner;

public class Run {

    AutoUnpacker autoUnpacker = new AutoUnpacker();
    Scanner scanner = new Scanner(System.in);

    public void cli() throws IOException, InterruptedException {
        System.out.print("Digite o caminho da pasta a ser monitorada: ");
        String caminho = scanner.nextLine();

        autoUnpacker.setWatchDir(caminho);
        String myPath = autoUnpacker.getWatchDir();
        autoUnpacker.watchDir(myPath);
        //un.setWatchDir("/home/avraham/Área de Trabalho/PROJETOS/PROJECTS IN JAVA");
      //un.setWatchDir("E:\\unzip");
      //String myPath = un.getWatchDir();
      //un.watchDir(myPath);

    }
}
