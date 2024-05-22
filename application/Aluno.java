package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Aluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do aluno: ");
		String nome = sc.nextLine();
		System.out.println("Digite as notas dos três trimestres: ");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		
		Student aluno = new Student(nome, nota1, nota2, nota3);
		
		System.out.println("nota final: " + aluno.notaFinal());
		
		if (aluno.notaFinal() < 60) {
			System.out.printf("Reprovado, pontos restantes: %.2f", aluno.pontosRestantes());
		}
		else {
			System.out.println("Aprovado");
		}
		
		sc.close();
	}

}
