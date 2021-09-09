package br.edu.infnet.pessoas;

public class Aluno extends Pessoa{
	private String turno;
	private double nota1;
	private double nota2;
	private double nota3;
	private String aprovacao;
	private double media;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int idade, String turno  ) {
		this.nome = nome;
		this.idade = idade;
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public String getAprovacao() {
		return aprovacao;
	}

	public double getMedia() {
		return media;
	}

	public void calcularMedia(Double nota1, Double nota2, Double nota3) {
		this.media = (nota1+nota2+nota3)/3;
	}
	
	public void calcularMedia(Double nota1, Double nota2) {
		this.media = (nota1+nota2)/2;
	}
	
	public void definirAprovacao(Double media) {
		if(media >= 7) {
			aprovacao = "Aprovado";
		}
		else if(media<= 4) {
			aprovacao = "Reprovado";
		}else {
			aprovacao =  "Recuperação";
		}
	}

	@Override
	public void consultarSituacao() {
		calcularMedia(getNota1(),getNota2(),getNota3());
		definirAprovacao(this.media);
		System.out.printf("Nome do Aluno: %s\n"
				+ "Idade: %d\n"
				+"Turno: %s\n"
				+"Media: %.2f\n"
				+"Aprovação: %s\n",this.nome,this.idade,this.turno,this.media,this.aprovacao);
		System.out.println();
	}

	
	

}
