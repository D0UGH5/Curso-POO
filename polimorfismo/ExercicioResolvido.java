package polimorfismo;

import polimorfismo.Employee;
import polimorfismo.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários serâo digitados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("---FUNCIONARIO "+ (i+1) + "---");
            System.out.println("É terceirizado? (s/n)");
            String op = sc.next();

            System.out.print("nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas trabalhadas: ");
            Integer horasTrabalhadas = sc.nextInt();
            System.out.print("Valor da hora trabalhada: ");
            Double valorHoraTrabalhada = sc.nextDouble();

            if(op.equals("s")) {
                System.out.print("despeza adicional: ");
                Double despezaAdicional = sc.nextDouble();
                //Employee funcionario = new OutsourcedEmployee(nome, horasTrabalhadas, valorHoraTrabalhada, despezaAdicional);
                employees.add(new OutsourcedEmployee(nome, horasTrabalhadas, valorHoraTrabalhada, despezaAdicional));

            }
            else {
                //Employee funcionario = new Employee(nome, horasTrabalhadas, valorHoraTrabalhada);
                employees.add(new Employee(nome, horasTrabalhadas, valorHoraTrabalhada));
            }
        }
        for (Employee funcionario : employees) {
            System.out.println(funcionario.getNome() + "---" + funcionario.pagamento());
        }
        sc.close();
    }
}
