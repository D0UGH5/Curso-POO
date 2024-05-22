package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double soma = 0;
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.printf("%dº valor: ", i+1);
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		 double media = soma / n;

		 System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
		 System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		 
		 for (int i=0; i<n; i++) {
		     if (vetor[i] < media) {
		    	 System.out.printf("%.1f\n", vetor[i]);
		     }
		 }
		sc.close();

	}

}
