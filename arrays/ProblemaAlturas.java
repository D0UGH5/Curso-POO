package arrays;

import java.util.Locale;
import java.util.Scanner;
import entities.People;

public class ProblemaAlturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		People[] vetor = new People[n];
		double somaAlturas = 0;
		int menoresDe16 = 0;
		
		for (int i = 0; i<vetor.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %d pessoa:\n", i+1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vetor[i] = new People(nome, idade, altura);
			
			somaAlturas += altura;
			
			if(idade<16) {
				menoresDe16++;
			}
		}
		
		double mediaAltura = somaAlturas/n;
		double porcentagem = (double)menoresDe16 *100 /n;
		
		System.out.printf("A altura média é: %.2f\n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
		
		for(People pessoa: vetor) {
			if(pessoa.getIdade()<16) {
				System.out.println(pessoa.getNome());
			}
		}
		sc.close();

	}

}
