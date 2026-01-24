package ProgramacaoFuncionalEExpressoesLambda.function.util;

import ProgramacaoFuncionalEExpressoesLambda.function.entities.Product;

import java.util.function.Function;

public class UppercaseName implements Function<Product, String> {
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
