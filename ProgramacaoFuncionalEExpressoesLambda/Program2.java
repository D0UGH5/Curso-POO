package ProgramacaoFuncionalEExpressoesLambda;

import ProgramacaoFuncionalEExpressoesLambda.entities.Product;

import java.util.ArrayList;
import java.util.List;

/*
 * OBJETOS DE PRIMEIRA CLASSE (First-Class Citizens)
 *
 * Em programação funcional, dizemos que funções são "objetos de primeira classe" quando:
 * 1. Podem ser atribuídas a variáveis
 * 2. Podem ser passadas como argumentos para métodos
 * 3. Podem ser retornadas como resultado de métodos
 *
 * No Java 8+, isso é possível através de:
 * - Method References (referências a métodos) → Classe::metodo
 * - Expressões Lambda → (params) -> expressão
 * - Interfaces Funcionais (como Comparator, Predicate, Function, etc.)
 */
public class Program2 {

    // Método estático que compara dois produtos pelo preço
    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // METHOD REFERENCE (Referência a Método)
        // Aqui o método compareProducts é tratado como um OBJETO DE PRIMEIRA CLASSE
        // Ele é PASSADO COMO ARGUMENTO para o método sort()
        // Sintaxe: NomeDaClasse::nomeDoMetodo
        list.sort(Program2::compareProducts);

        // Outro exemplo de method reference
        // O método println é passado como argumento para forEach
        list.forEach(System.out::println);
    }
}
