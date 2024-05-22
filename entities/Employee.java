package entities;

public class Employee {

	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido () {
		return salarioBruto - taxa;
	}
	
	public void incrementoSalario (double porcentagem) {
		salarioBruto += salarioBruto  * porcentagem / 100.0;
	}
	
	public String toString() {
		return nome + ", $" + String.format("%.2f", salarioLiquido());
	}
}
