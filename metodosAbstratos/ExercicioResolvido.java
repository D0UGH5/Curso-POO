package metodosAbstratos;

import metodosAbstratos.Enum.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioResolvido {
    public static void main(String[] args) {
        //fazer um programa para ler os dados de N figuras (N fornecido pelo usuário), e depois mostrar as áreas dessas figuras na mesma ordem que foram digitadas

        Scanner sc = new Scanner(System.in);
        List<Forma> lista = new ArrayList<>();

        System.out.print("Entre com o número de figuras: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Digite os dados da figura " + (i+1) + ": ");
            System.out.println("Retângulo ou círculo? (R/C)");
            char ch = sc.next().toUpperCase().charAt(0);
            System.out.print("Cor: (PRETO, AZUL ou VERMELHO)");
            Cor cor = Cor.valueOf(sc.next().toUpperCase());

            if(ch == 'R'){
                System.out.print("Digite o valor da largura: ");
                double largura = sc.nextDouble();
                System.out.print("Digite o valor da altura: ");
                double altura = sc.nextDouble();
                lista.add(new Retangulo(cor, largura, altura));

            }
            else if(ch == 'C'){
                System.out.print("Digite o valor do raio: ");
                double raio = sc.nextDouble();
                lista.add(new Circulo(cor, raio));
            }
        }

        System.out.println();
        System.out.println("Áreas das figuras:");
        for(Forma forma : lista){
            System.out.println(String.format("%.2f", forma.area()));
        }

        sc.close();
    }
}
