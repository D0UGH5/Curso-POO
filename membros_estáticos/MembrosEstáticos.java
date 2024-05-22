package membros_estáticos;

import java.util.Locale;
import java.util.Scanner;

import entities.circles;


public class MembrosEstáticos {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio:");
		double raio = sc.nextDouble();
		
		double c = circles.circunferencia(raio);
		double v = circles.volume(raio);
		
		System.out.printf("Circunferência: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("Valor de PI: %.2f\n", circles.PI);
		sc.close();

	}

}
