package entities;

public class People {
	private String nome;
	private int idade;
	private double altura;
	private char genero;
	
	public People(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public People(String nome,  int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public People(double altura, char genero) {
		super();
		this.altura = altura;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
}
