package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Funcionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Employee funcionario = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Taxa: ");
		funcionario.taxa = sc.nextDouble();
		System.out.println();
		
		System.out.println("Funcionário: " + funcionario);
		System.out.println();
		
		System.out.print("Qual a porcentagem do reajuste?");
		double porcentagem = sc.nextDouble();
		funcionario.incrementoSalario(porcentagem);
		System.out.println();
		
		System.out.println("Dados atualizados: " + funcionario);
		sc.close();
		
	}

}
