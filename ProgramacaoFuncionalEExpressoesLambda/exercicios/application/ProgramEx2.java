package ProgramacaoFuncionalEExpressoesLambda.exercicios.application;

import ProgramacaoFuncionalEExpressoesLambda.exercicios.entities.Employee;
import ProgramacaoFuncionalEExpressoesLambda.exercicios.entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ProgramEx2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Employee> employeesList = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                Double salary = Double.parseDouble(fields[2]);

                employeesList.add(new Employee(name, email, salary));

                line = br.readLine();
            }

            System.out.print("ENTER SALARY: ");
            double salary = sc.nextDouble();

            List<String> emails = employeesList.stream().filter( x -> x.getSalary() > salary).map(e -> e.getEmail()).sorted().collect(Collectors.toList());
            System.out.println("EMAIL OF PEOPLE WHOSE SALARY IS MORE THAN " + salary + ": ");
            emails.forEach(System.out::println);

            double sumSalary = employeesList.stream().filter(x -> x.getName().toUpperCase().charAt(0)=='M').map(y -> y.getSalary()).reduce(0.0,(x,y) -> x + y);
            System.out.println("SUM OF SALARY OF PEOPLE WHOSE NAME STARTS WITH 'M': " + sumSalary);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }
}