package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>(); // como um trabalhador possui vários contratos, representamos o "vários" com uma lista.
	
	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
		// quando existir uma composição "tem muitos", uma lista no caso, não incluir no contrutor 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contrato){
		contracts.add(contrato);//adiciona a lista de contratos, o contrato recebido como argumento
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income (int year, int month){
		double soma = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) { // para cada contrato c na lista de contratos:
			cal.setTime(c.getDate());//para cada contrato c, setar a data do contrato c
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				soma += c.totalValue();
			}
		}
		return soma;
	}
}
