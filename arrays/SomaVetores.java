package arrays;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		System.out.println();
		System.out.println("Digite os números do PRIMEIRO vetor:");
		
		int[] vetor1 = new int[n];
		int[] vetor2 = new int[n];
		int soma;
		
		for (int i = 0; i<vetor1.length; i++) {
			System.out.printf("VALOR VETOR 1 POSIÇÃO %d: ", i+1);
			vetor1[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Digite os números do SEGUNDO vetor:");
		for (int i = 0; i<vetor2.length; i++) {
			System.out.printf("VALOR VETOR 2 POSIÇÃO %d: ", i+1);
			vetor2[i] = sc.nextInt();
		}
		
		System.out.println("\nSOMA DAS POSIÇÕES DOS VETORES: ");
		for (int i = 0; i<vetor1.length; i++) {
			soma = vetor1[i]+vetor2[i];
			System.out.printf("POSIÇÕES %d: %d%n", i+1, soma);
		}
		
		sc.close();

	}

}
