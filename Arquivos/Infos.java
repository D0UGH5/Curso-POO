package Arquivos;

import java.io.File;
import java.util.Scanner;

public class Infos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho de um arquivo: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getPath: " + path.getPath());
        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());

        sc.close();
    }
}
