package membros_estáticos;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Dolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do Dólar?");
		CurrencyConverter.valorDolar = sc.nextDouble();
		System.out.print("Quantos dólares você deseja comprar?");
		CurrencyConverter.valorComprado = sc.nextDouble();
		
		double valor = CurrencyConverter.valorAPagar();
		
		System.out.printf("Valor a ser pago em reais: %.2f", valor);
		
		sc.close();
	}

}
