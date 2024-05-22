package application;

import java.util.Locale;
import java.util.Scanner;

import entities.triangle;

public class Triangulos_sem_oab {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		triangle x, y;
		x = new triangle();
		y = new triangle();
		
		
		System.out.println("digite as medidas do triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("digite as medidas do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("area do triângulo X: %.4f\n", areax);
		System.out.printf("area do triângulo Y: %.4f\n", areay);
		
		if (areax>areay) {
			System.out.println("O maior triângulo é o X");
		}
		if (areax==areay) {
			System.out.println("As áreas são as mesmas");
		}
		else {
			System.out.println("O maior triângulo é o Y");
		}
		sc.close();

	}

}
