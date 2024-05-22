package arrays;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i<vetor.length; i++){
			System.out.printf("Digite o %d° número", i+1);
			vetor[i] = sc.nextInt();
		}

		int soma = 0;

		System.out.println("NÚMEROS PARES:");
		for(int i = 0; i<vetor.length; i++){
			if(vetor[i]%2==0){
				System.out.println(vetor[i]);
				soma++;
			}
		}

		System.out.println("QUANTIDADE DE PARES = " + soma);

		sc.close();

	}

}
