package ProgramacaoFuncionalEExpressoesLambda.function.application;
import ProgramacaoFuncionalEExpressoesLambda.function.entities.Product;
import ProgramacaoFuncionalEExpressoesLambda.function.util.UppercaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //implementando a interface Function em uma classe separada (UppercaseName)
        //para usar o 'map', precisamos transformar uma lista em stream, depois converter os elementos com o map e depois coletar novamente em uma lista
        List <String> names = list.stream().map(new UppercaseName()).collect(Collectors.toList());
        names.forEach(System.out::println);
        System.out.println("-------------------");

        //reference method com metodo estatico
        List <String> namesStatic = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        namesStatic.forEach(System.out::println);
        System.out.println("-------------------");

        //reference method com metodo nao estatico
        List <String> namesNonStatic = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
        namesNonStatic.forEach(System.out::println);
        System.out.println("-------------------");

        //expressao lambda declarada
        Function<Product, String> func = p -> p.getName().toUpperCase();
        List <String> namesLambdaDeclared = list.stream().map(func).collect(Collectors.toList());
        namesLambdaDeclared.forEach(System.out::println);
        System.out.println("-------------------");

        //expressao lambda inline
        List <String> namesLambdaInline = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        namesLambdaInline.forEach(System.out::println);

    }
}
