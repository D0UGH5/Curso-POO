package arrays;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double maiorElemento = 0;
		int maiorPosicao = 0;
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.printf("Posição %d: ", i);
			vetor[i] = sc.nextDouble();
			if (vetor[i]>maiorElemento){
				maiorPosicao=i;
				maiorElemento=vetor[i];
			}
		}
		
		System.out.printf("O maior valor é %.2f e sua posição é %d",maiorElemento, maiorPosicao);
		
		sc.close();

	}

}
