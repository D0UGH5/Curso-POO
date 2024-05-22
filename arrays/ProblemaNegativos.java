package arrays;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaNegativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		System.out.println("quantos números você vai digitar?");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.printf("DIFITE O %dº NÚMERO%n", i);
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS: ");
		
		for(int i = 0; i<vetor.length; i++) {
			 if (vetor[i] < 0) {
		        System.out.printf("%d\n", vetor[i]);
		     }
		}
				
		sc.close();

	}

}
