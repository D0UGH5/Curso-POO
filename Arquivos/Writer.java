package Arquivos;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {

        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        String path = "c:\\temp\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ //com o parâmetro true, ele adiciona no final do arquivo, sem o true, o arquivo é reescrito
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
