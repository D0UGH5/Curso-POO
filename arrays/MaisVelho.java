package arrays;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class MaisVelho {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		People[] pessoa = new People[n];
		int maiorIdade = 0;
		
		for (int i=0; i<n; i++) {
			System.out.printf("%nNome: ");
			String nome = sc.nextLine();
			System.out.printf("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			pessoa[i] = new People(nome, idade);
			
			if(pessoa[i].getIdade()>maiorIdade) {
				maiorIdade = pessoa[i].getIdade();
			}
		}
		
		System.out.printf("%nMais velho: ");
		for (People maisVelho : pessoa){
			if (maisVelho.getIdade()== maiorIdade) {
				System.out.println(maisVelho.getNome());
			}
		}
		sc.close();
	}

}
