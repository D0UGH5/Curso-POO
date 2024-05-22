package matrizes;

import java.util.Scanner;

public class Exercicio_resolvido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] mat = new int[n][n];
		int negativos = 0;
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal");
		for(int i = 0; i<n; i++) {
			System.out.println(mat[i][i] +" ");
		}
		System.out.println();
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if(mat[i][j] < 0) {
					negativos++ ;
				}
			}
		}
		System.out.println("numeros negativos: " + negativos);
		sc.close();

	}

}
