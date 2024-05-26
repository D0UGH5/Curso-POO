package composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ExercicioResolvido {

	public static void main(String[] args) throws ParseException {
		// Ler os dados de um trabalhador com N contratod (N fornecido pelo usuário). Depois, solicitar do usuário um mês e mostrar qual foi o salário do funcionário nesse mês.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nivel: ");
		String nivel = sc.nextLine();
		System.out.print("Salário base: ");
		double salarioBase = sc.nextDouble();
		
		Worker trabalhador = new Worker(nome, WorkerLevel.valueOf(nivel), salarioBase, new Department(nomeDepartamento));
		
		System.out.print("Quantos contratos esse trabalhador vai ter? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do " + i + "º contrato: ");
			System.out.print("Entre com a data (dd/MM/yyyy): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorhora = sc.nextDouble();
			System.out.print("Duaração (horas): ");
			int horas = sc.nextInt();
			
			HourContract contrato = new HourContract(dataContrato, valorPorhora, horas);
			trabalhador.addContract(contrato);
		}
		
		System.out.println();
		System.out.print("Entre com o mês e ano para calcular o salário (MM/yyyy): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0,2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.println("Nome: " + trabalhador.getName());
		System.out.println("Departamento: " + trabalhador.getDepartment().getName());
		System.out.println("Valor total de " + mesEAno + ": " + String.format("%.2f",trabalhador.income(ano, mes)));
		
		sc.close();
	}

}
