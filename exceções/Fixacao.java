package exceções;

import model.entities.Account;
import model.exceptions.AccountException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fixacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entre com os dados da conta: ");
            System.out.print("Número: ");
            int numero = sc.nextInt();
            System.out.print("Titular: ");
            sc.nextLine();
            String titular = sc.nextLine();
            System.out.print("Valor inicial: ");
            double saldo = sc.nextDouble();
            System.out.print("Limite de saque: ");
            double limiteDeSaque = sc.nextDouble();
            Account conta = new Account(numero, titular, saldo, limiteDeSaque);
            System.out.println(conta);

            System.out.println();
            System.out.print("Entre com a quantidade a ser sacada: ");
            int valor = sc.nextInt();
            conta.saque(valor);
            System.out.println(conta);
        }
        catch (RuntimeException e) {
            System.out.println("Erro inesperado, verifique os dados da conta!");
        }
        catch (AccountException e) {
            System.out.println("Erro no cadastro de conta: " + e.getMessage());
        }

        sc.close();
    }
}
