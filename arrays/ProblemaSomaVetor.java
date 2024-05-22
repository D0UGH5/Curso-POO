package arrays;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		System.out.println("Quantos números vão ser digitados?");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double soma = 0;
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.printf("Insira o %dº número: ", i+1);
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		double media = soma/n;
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.printf("%nA soma dos termos do vetor é %.2f e a média é %.2f", soma, media);
		sc.close();

	}

}
