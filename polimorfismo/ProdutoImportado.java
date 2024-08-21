package polimorfismo;

public class ProdutoImportado extends Produto{
    private double taxaAlfandegaria;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, double preco, double taxaAlfandegaria) {
        super(nome, preco);
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public double getTaxaAlfandegaria() {
        return taxaAlfandegaria;
    }

    public void setTaxaAlfandegaria(double taxaAlfandegaria) {
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    @Override
    public String etiquetaDePreco(){
        return super.etiquetaDePreco() + " (taxa alfandegária: $" + taxaAlfandegaria + ")";
    }
}
