package ProgramacaoFuncionalEExpressoesLambda.function.application;
import ProgramacaoFuncionalEExpressoesLambda.function.entities.Product;
import ProgramacaoFuncionalEExpressoesLambda.function.entities.ProductEx2;
import ProgramacaoFuncionalEExpressoesLambda.function.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProgramEx2 {
    public static void main(String[] args) {

        List<ProductEx2> list = new ArrayList<>();

        list.add(new ProductEx2("Tv", 900.00));
        list.add(new ProductEx2("Mouse", 50.00));
        list.add(new ProductEx2("Tablet", 350.50));
        list.add(new ProductEx2("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.printf("Sum of products whose name starts with 'T': %.2f%n", sum);
    }
}
