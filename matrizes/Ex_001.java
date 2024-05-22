package matrizes;

import java.util.Scanner;

public class Ex_001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de linhas: ");
		int m = sc.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		System.out.println();
		
		System.out.println("popule a matriz: ");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		
		System.out.println("Digite um número que está na matriz");
		int x = sc.nextInt();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					if (j > 0) {
						System.out.println("Valor à esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Valor à direita: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Valor acima: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Valor abaixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		sc.close();

	}

}
