package arrays;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Produtos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Tamanho do vetor: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i = 0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			vect[i] = new Product(nome, preco);
		}
		
		double soma = 0;
		
		for (int i = 0; i<vect.length; i++) {
			soma += vect[i].getPreco();
		}
		
		double media = soma / vect.length ;
		
		System.out.printf("preço médio: %.2f%n", media);
		
		sc.close();

	}

}
