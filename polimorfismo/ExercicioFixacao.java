/*
fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao funal, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.
T odo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados possuem data de fabricação. Estes dados específicos devem ser acrescentados na etiqueta de preço. Para produtos importados, a taxa e alfândega deve ser acrescentada ao preço final do produto.
 */

package polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ExercicioFixacao {
    public static void main(String[] args) throws ParseException {

        List<Produto> produtos = new ArrayList<Produto>();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos serâo digitados? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("Comum, usado ou importado? (C/U/I) ");
            char tipoProduto = sc.next().toUpperCase().charAt(0);
            System.out.print("Digite o produto "+i+": ");
            String nome = sc.next();
            System.out.print("Digite o preço "+i+": ");
            double preco = sc.nextDouble();

            switch(tipoProduto){
                case 'C':
                    produtos.add(new Produto(nome, preco));
                    break;
                case 'U':
                    System.out.print("Qual a data de fabricação? (dd/MM/yyyy)");
                    Date dataFabricacao = sdf1.parse(sc.next());
                    produtos.add(new ProdutoUsado(nome, preco, dataFabricacao));
                    break;
                case 'I':
                    System.out.print("Qual a taxa alfandegária? ");
                    double taxaAlfandegaria = sc.nextDouble();
                    produtos.add(new ProdutoImportado(nome, preco, taxaAlfandegaria));
                    break;
            }
        }

        for(Produto produto : produtos){
            System.out.println(produto.etiquetaDePreco());
        }
    }
}
