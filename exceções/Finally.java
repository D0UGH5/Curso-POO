package exceções;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

       File file = new File("C:\\Users\\55139\\Documents\\fatec programação\\in.txt"); // criação de um objeto tipo File
       Scanner sc = null;

        try {
            sc = new Scanner(file); //instanciar o Scanner apontando para o arquivo, o Scanner pode também ler através de arquivos
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Erro na abertura do arquivo!! " + e.getMessage() );
        }
        finally { //o finally executa sempre, independente se ocorre a excessão ou não
            if (sc != null) {
                sc.close();
            }
        }
    }
}
