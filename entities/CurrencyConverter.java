package entities;

public class CurrencyConverter {
	
	public static double valorDolar;
	public static double valorComprado;
	
	public static double valorAPagar() {
		double valor = valorDolar * valorComprado;
		valor = (valor/100*6) + valor;
		return valor;
	}
}
