package arrays;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Student[] aluno = new Student[n];
		
		for (int i = 0; i < aluno.length; i++) {
			System.out.print("Nome do aluno: ");
			String nome = sc.nextLine();
			System.out.println("Digite as duas notas: ");
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			sc.nextLine();
			
			aluno[i] = new Student(nome, nota1, nota2);
		}
		
		System.out.println("Alunos Aprovados");
		for (int i = 0; i < aluno.length; i++) {
			if (aluno[i].media()>=6) {
				System.out.println(aluno[i].nome);
			}
		}
		
		sc.close();
	}

}
