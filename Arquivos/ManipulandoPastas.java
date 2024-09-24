package Arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um caminho de pasta: ");
        String strPath = sc.nextLine();

        File path =  new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);//armazena no vetor de Files apenas as pastas do path
        System.out.println("Pastas: ");

        for(File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);//armazena no vetor de Files apenas os arquivos do path
        System.out.println("Arquivos: ");
        for(File file : files) {
            System.out.println(file);
        }

        //criar nova pasta
        boolean sucesso = new File(strPath + "\\subdir").mkdir();
        System.out.println(sucesso);
        sc.close();
    }
}
