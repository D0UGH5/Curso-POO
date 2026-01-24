package ProgramacaoFuncionalEExpressoesLambda.Consumer.entities;

public class Product {
    private String nome;
    private Double price;

    public Product(String nome, Double price) {
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static void staticPriceUpdate(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }

    public void nonStaticPriceUpdate() {
        this.setPrice(getPrice() * 1.1);
    }

    @Override
    public String toString() {
        return "Product [" +
                "nome='" + nome + '\'' +
                ", price=" + price +
                ']';
    }
}
