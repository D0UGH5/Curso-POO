package polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataFabricacao;

    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(String nome, double preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String etiquetaDePreco(){
        return super.etiquetaDePreco() + " (data de fabricação: " + sdf1.format(dataFabricacao) + ")";
    }
}
