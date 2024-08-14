package polimorfismo;

public class OutsourcedEmployee extends Employee{

    private double despezaAdicional;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String nome, Integer horasTrabalhadas, double valorPorHora, double despezaAdicional) {
        super(nome, horasTrabalhadas, valorPorHora);
        this.despezaAdicional = despezaAdicional;
    }

    public double getDespezaAdicional() {
        return despezaAdicional;
    }

    public void setDespezaAdicional(double despezaAdicional) {
        this.despezaAdicional = despezaAdicional;
    }

    @Override
    public double pagamento () {
        return super.pagamento() + despezaAdicional * 1.1;
    }
}
