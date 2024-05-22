package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RetanguloArea;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		RetanguloArea retangulo = new RetanguloArea();
		System.out.println("Informe a largura do retângulo: ");
		retangulo.largura = sc.nextDouble();
		System.out.println("Informe a altura do retângulo: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.printf("Area: %.2f\n", retangulo.area());
		System.out.printf("Perímetro: %.2f\n", retangulo.perimetro());
		System.out.printf("Diagonal: %.2f\n", retangulo.diagonal());
		sc.close();

	}

}
