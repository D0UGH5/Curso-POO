package arrays;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double mediaPares = 0;
		int contadorPares = 0;
		
		for(int i=0;i<vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			
			if(vetor[i] % 2 == 0) {
				mediaPares+=vetor[i];
				contadorPares ++;
			}
		}
		
		mediaPares /= contadorPares;
		
		System.out.printf("Media dos pares: %.2f", mediaPares);
		if(contadorPares==0) {
			System.out.println("Nenhum numero par");
		}
		
		sc.close();

	}

}
