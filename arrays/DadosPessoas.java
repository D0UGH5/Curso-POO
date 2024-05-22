package arrays;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class DadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		People[] pessoa = new People[n];
		char genero = 'a';
		double menorAltura = 100;
		double maiorAltura = 0;
		double mediaAlturaF = 0;
		int totalHomens = 0;
		int totalF = 0;
		
		for (int i = 0; i < pessoa.length; i++) {
			System.out.printf("altura da %dº pessoa: ", i+1);
			double altura = sc.nextDouble();
			sc.nextLine();
			do {
				System.out.printf("Gênero da %dº pessoa: ", i+1);
				String gen = sc.nextLine().toUpperCase();
				genero = gen.charAt(0);
			} while(genero != 'M' && genero != 'F');
			
			pessoa [i] = new People (altura, genero);
		}
		
		for (People conta : pessoa) {
			if (conta.getAltura()<menorAltura) {
				menorAltura = conta.getAltura();
			}
			if (conta.getAltura()>maiorAltura) {
				maiorAltura = conta.getAltura();
			}
			if (conta.getGenero()== 'F') {
				mediaAlturaF += conta.getAltura();
				totalF++;
			}
			if (conta.getGenero()== 'M') {
				totalHomens++;
			}
		}
		
		mediaAlturaF /= totalF;
		
		System.out.printf("Menor altura: %.2f%n"
				+ "Maior altura: %.2f%n"
				+ "Media das alturas das mulheres: %.2f%n"
				+ "Total de homens: %d", menorAltura, maiorAltura, mediaAlturaF, totalHomens);
		
		sc.close();

	}

}
