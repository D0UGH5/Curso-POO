package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class ContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount conta = null;
		
		System.out.print("ENTRE COM O NÚMERO DA CONTA: ");
		int n = sc.nextInt();
		System.out.print("ENTRE COM O NOME DO TITULAR DA CONTA: ");
		sc.nextLine();
		String t = sc.nextLine();
		System.out.print("EXISTE UM VALOR DE DEPÓSITO INICIAL? (s/n) ");
		char escolha = sc.nextLine().toLowerCase().charAt(0);
		
		if (escolha=='s') {
			System.out.print("DIGITE O VALOR DE DEPÓSITO INICIAL:");
			double valorInicial = sc.nextDouble();
			conta = new BankAccount(n, t, valorInicial);
		}
		else if (escolha=='n') {
			conta = new BankAccount(n,t);
		}
		
		System.out.println("\nDADOS DA CONTA:");
		System.out.println(conta);
		
		System.out.print("\nENTRE COM O VALOR DO DEPÓSITO:");
		double deposit = sc.nextDouble();
		conta.deposito(deposit);
		System.out.println("\nDADOS ATUALIZADOS:");
		System.out.println(conta);
		
		System.out.print("\nENTRE COM O VALOR DO SAQUE:");
		double withdraw = sc.nextDouble();
		conta.saque(withdraw);
		System.out.println("\nDADOS ATUALIZADOS:");
		System.out.println(conta);
		
		sc.close();
	}

}
