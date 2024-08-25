package metodosAbstratos;

import metodosAbstratos.Enum.Cor;

public class Retangulo extends Forma{

    private double largura;
    private double altura;

    public Retangulo(){
        super();
    }

    public Retangulo(Cor cor, double altura, double largura) {
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double area() {
        return largura * altura;
    }
}
