package ProgramacaoFuncionalEExpressoesLambda.function.entities;

public class ProductEx2 {
    private String name;
    private Double price;

    public ProductEx2(String nome, Double price) {
        this.name = nome;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static String staticUpperCaseName(ProductEx2 p) {
        return p.getName().toUpperCase();
    }

    public String nonStaticUpperCaseName() {
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return "Product [" +
                "nome='" + name + '\'' +
                ", price=" + price +
                ']';
    }
}