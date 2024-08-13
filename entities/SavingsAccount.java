package entities;

public class SavingsAccount extends Account {

    private double interrestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, double interrestRate) {
        super(number, holder, balance);
        this.interrestRate = interrestRate;
    }

    public double getInterrestRate() {
        return interrestRate;
    }

    public void setInterrestRate(double interrestRate) {
        this.interrestRate = interrestRate;
    }

    public void updateBalance(){
        balance += balance * interrestRate;
    }

    @Override
    public void withdraw(double ammount) {
        balance -= ammount;
    }
}
