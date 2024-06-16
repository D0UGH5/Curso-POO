package heranca;

public class Account {
	
	private Integer number;
	private String holder; //titular
	protected Double balance; // saldo
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void whithdraw(double ammount) {
		balance -= ammount;
	}
	
	public void deposit(double ammount) {
		balance += ammount;
	}
}
