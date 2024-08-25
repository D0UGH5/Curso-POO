package metodosAbstratos;

public class PessoaFisica extends Pessoa{

    public double gastosComSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double imposto() {
        if(getRendaAnual() < 20000){
            return (getRendaAnual() * 15 / 100) - (getGastosComSaude() * 50 / 100);
        }
        else{
            return (getRendaAnual() * 25 / 100) - (getGastosComSaude() * 50 / 100);
        }
    }
}
