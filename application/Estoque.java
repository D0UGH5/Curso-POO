package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Estoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("informe os dados do produto:\nNome: ");
		String nome = sc.nextLine();
		System.out.print("preço: ");
		double preco = sc.nextDouble();
		Product produto = new Product(nome, preco);
		
		produto.setNome("computador");
		System.out.println("\nnome atualizado:" + produto.getNome());
		produto.setPreco(1200);
		System.out.println("preço atualizado:" + produto.getPreco());
		
		System.out.println();
		System.out.println(produto);
		System.out.println();
		
		System.out.print("Adicione o número de produtos a serem adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		System.out.println();
		
		System.out.print("Adicione o número de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		System.out.println();
		System.out.println("Dados atualizados: " + produto);

		sc.close();
	}

}
