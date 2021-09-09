package br.edu.infnet.pessoas;

public class Professor extends Pessoa {
	private String materia;
	private double salario;
	

	public Professor() {
		
	}
	
	public Professor(String nome, int idade, String materia, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.materia = materia;
		this.salario = salario;
	}
	
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public void consultarSituacao() {
		System.out.printf("Nome do professor: %s\n"
				+ "Idade: %d\n"
				+ "Materia: %s\n"
				+ "Salário: %.2f\n",this.nome,this.idade,this.materia,this.salario);
		System.out.println();
	}
}
