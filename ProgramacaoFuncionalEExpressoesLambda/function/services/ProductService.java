package ProgramacaoFuncionalEExpressoesLambda.function.services;

import ProgramacaoFuncionalEExpressoesLambda.function.entities.ProductEx2;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<ProductEx2> list, Predicate<ProductEx2> criteria) {
        double sum = 0.0;
        for (ProductEx2 p : list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
