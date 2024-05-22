package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.funcionarios;

public class ExercicioFixacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos funcionarios serão digitados? ");
		int x = sc.nextInt();
		List<funcionarios> lista = new ArrayList<>();
		
		for(int i = 0; i<x; i++) {			
			System.out.println("funcionário " + (i+1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			while(temId(lista,id)) {
				System.out.println("ID já existe, digite outro ID: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			System.out.println();
			
			funcionarios escravo = new funcionarios(id, nome, salario);
			lista.add(escravo);
		}
		
		System.out.print("Entre com o id do funcionário que vai receber aumento: ");
		int idSalario = sc.nextInt();
		funcionarios escravo = lista.stream().filter(s -> s.getId()==idSalario).findFirst().orElse(null);
		//Integer pos = posicao(lista, idSalario);
		if (escravo == null) {
			System.out.println("ESSE ID NÃO EXISTE");
		}
		else {
			System.out.print("Entre com a porcentagem do aumento: ");
			double porcentagem = sc.nextDouble();
			escravo.aumentarSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("LISTA DE FUNCIONÁRIOS");
		sc.close();
		for(funcionarios y : lista) {
			System.out.println(y);
		}

	}
	
	public static Integer posicao (List<funcionarios> list, int id) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getId()==id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean temId(List<funcionarios> lista, int id) {
		funcionarios escravo = lista.stream().filter(s -> s.getId()== id).findFirst().orElse(null);
		return escravo != null;
	}
}
