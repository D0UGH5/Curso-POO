package arrays;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double media = 0;
		
		for(int i=0;i<vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			media += vetor[i];
		}
		
		media /= vetor.length;
		System.out.println("Média:" + media);
		
		
		System.out.println("Elementos abaixo da média: ");
		for(int i=0;i<vetor.length; i++) {
			if(vetor[i]<media) {
				System.out.println(vetor[i]);
			}
		}
		sc.close();

	}

}
