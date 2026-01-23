package GenericsSetAndMap.Application;

import GenericsSetAndMap.Entities.Alunos;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExFixSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Alunos> set = new TreeSet<Alunos>();

        System.out.println("Quantos alunos estão no curso A? ");
        int a = sc.nextInt();
        for (int i=0; i < a; i++) {
            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            String name = sc.next();
            Alunos aluno = new Alunos(name);
            set.add(aluno);
        }

        System.out.println("Quantos alunos estão no curso B? ");
        int b = sc.nextInt();
        for (int i=0; i < b; i++) {
            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            String name = sc.next();
            Alunos aluno = new Alunos(name);
            set.add(aluno);
        }

        System.out.println("Quantos alunos estão no curso C? ");
        int c = sc.nextInt();
        for (int i=0; i < c; i++) {
            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            String name = sc.next();
            Alunos aluno = new Alunos(name);
            set.add(aluno);
        }

        System.out.println("Quantidade de alunos: " + set.size());
        sc.close();
    }
}
