package Arquivos;

import model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> lista = new ArrayList<>();

        System.out.print("Entre com o caminho do arquivo: ");
        String arquivo = sc.nextLine();

        File sourceFile = new File(arquivo);
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "\\Out").mkdir();

        String arquivoAlvo = sourceFolderStr + "\\Out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(arquivo))){

            String itemCSV = br.readLine();
            while (itemCSV != null) {
                String[] campos = itemCSV.split(",");
                String nome = campos[0];
                double preco = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                lista.add(new Product(nome, preco, quantidade));

                itemCSV = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoAlvo))){

                for (Product item : lista) {
                    bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(arquivoAlvo + " criado!");

            } catch (IOException e){
                System.out.println("Erro na criação do arquivo: " + e.getMessage());
            }

        } catch (IOException e){
            System.out.println("Erro ao carregar arquivo: " + e.getMessage());
        }
        sc.close();
    }
}
