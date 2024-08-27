package exceções;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

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
        }
        catch (InputMismatchException e) {
            System.out.println("Erro de input");
        }

        System.out.println("Fim do programa");
        sc.close();
    }
}
