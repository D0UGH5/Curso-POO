package arrays;

import java.util.Locale;
import java.util.Scanner;

public class altura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE UM NÚMERO INTEIRO");
		int n = sc.nextInt();
		double[] vetorzinho = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("digite a altura: ");
			vetorzinho[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		for (int i=0; i<n; i++) {
			soma += vetorzinho[i];
		}
		
		System.out.println("A altura média é " + soma/n);
		sc.close();

	}

}
