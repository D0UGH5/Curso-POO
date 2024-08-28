package exceções;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {
    public static void main(String[] args) {

        metodo1();
        System.out.println("Fim do programa");

    }

    public static void metodo1() {

        System.out.println("***** COMEÇO DO METODO1 *****");
        metodo2();
        System.out.println("***** FIM DO METODO2 *****");
    }

    public static void metodo2() {

        System.out.println("***** COMEÇO DO METODO2 *****");

        Scanner sc = new Scanner(System.in);

        System.out.println("digite quantos nomes desejar em uma mesma linha (separando cada um com espaço): ");
        try {
            String[] vetor = sc.nextLine().split(" ");
            System.out.println("Digite um número inteiro: ");
            int posicao = sc.nextInt();
            System.out.println(vetor[posicao]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida!!");
            e.printStackTrace();
            sc.next();
        }
        catch (InputMismatchException e) {
            System.out.println("Erro de input");
        }

        System.out.println("***** FIM DO METODO2 *****");

        sc.close();
    }
}
