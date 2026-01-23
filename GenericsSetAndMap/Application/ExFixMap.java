package GenericsSetAndMap.Application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExFixMap {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        Map<String,Integer> candidatos = new HashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String nome = fields[0];
                Integer votos = Integer.parseInt(fields[1]);

                if (candidatos.containsKey(nome)) {
                    candidatos.put(nome, votos + candidatos.get(nome));
                } else {
                    candidatos.put(nome, votos);
                }

                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (String key : candidatos.keySet()) {
            System.out.println(key + ": " + candidatos.get(key));
        }

        sc.close();
    }
}
