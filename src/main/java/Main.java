import app.AutoUnpacker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        var un = new AutoUnpacker();

        un.setWatchDir("/home/avraham/Área de Trabalho/PROJETOS/PROJECTS IN JAVA");
        String myPath = un.getWatchDir();
        un.watchDir(myPath);


    }
}