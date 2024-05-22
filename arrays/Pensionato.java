package arrays;

import java.util.Locale;
import java.util.Scanner;
import entities.StudentRent;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		StudentRent[] quartos = new StudentRent[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("%nALUGUEL %d:%n", i);
			System.out.print("Nome: ");
			sc.nextLine(); 
			String nome = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.next();
			System.out.printf("Quarto: ");
			int quarto = sc.nextInt();
			
			quartos[quarto] = new StudentRent(nome, email);
		}
		
		System.out.println();
		System.out.println("Alunos ocupando os quartos:");
        for (int i = 0; i < quartos.length; i++) {
        	if(quartos[i] != null) {
        		System.out.println(i + ": " + quartos[i]);
        	}
        }
		sc.close();
	}

}
