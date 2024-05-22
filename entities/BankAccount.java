package entities;

public class BankAccount {

	private int numeroDaConta;
	private String titular;
	double saldo;
	
	public BankAccount(int numeroDaConta, String titular, double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.titular = titular;
		deposito(depositoInicial);
	}
	
	public BankAccount(int numeroDaConta, String titular) {
		this.numeroDaConta = numeroDaConta;
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double deposito(double valor) {
		return saldo += valor;
	}
	
	public double saque(double valor) {
		return saldo -= valor+5;
	}
	
	public String toString() {
		return "conta: " + numeroDaConta + ", titular: " + titular + ", Saldo: " + saldo;
	}
}
