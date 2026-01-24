package ProgramacaoFuncionalEExpressoesLambda.Consumer.Application;

import ProgramacaoFuncionalEExpressoesLambda.Consumer.entities.Product;
import ProgramacaoFuncionalEExpressoesLambda.Consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD case", 80.90));

        //usando a classe que implementa Consumer
        list.forEach(new PriceUpdate());
        list.forEach(System.out::println);
        System.out.println("-------------------");

        //reference method para metodo estatico
        list.forEach(Product::staticPriceUpdate);
        list.forEach(System.out::println);
        System.out.println("-------------------");

        //reference method para metodo nao estatico
        list.forEach(Product::nonStaticPriceUpdate);
        list.forEach(System.out::println);
        System.out.println("-------------------");

        //expressao lambda declarada
        double factor = 1.1;

        Consumer<Product> consumer = p -> {
            p.setPrice(p.getPrice() * factor);
        };

        list.forEach(consumer);
        list.forEach(System.out::println);
        System.out.println("-------------------");

        //expressao lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);
    }
}
