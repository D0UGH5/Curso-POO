package entities;

public class Student {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public Student(String nome, double nota1, double nota2, double nota3) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public Student(String nome, double nota1, double nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double pontosRestantes() {
		if (notaFinal()<60) {
			return 60 - notaFinal();
		}
		else {
			return 0.0;
		}
	}
	
	public double media () {
		return (nota1 + nota2)/2;
	}
}
