package br.edu.infnet.principal;

import java.util.Scanner;

import br.edu.infnet.auxiliar.Constantes;
import br.edu.infnet.pessoas.Aluno;
import br.edu.infnet.pessoas.Pessoa;
import br.edu.infnet.pessoas.Professor;

public class Executar {
	public static Scanner in = new Scanner(System.in);

	public static void telaInicial() {
		System.out.println("============================");
		System.out.println("Controle Acadêmico");
		System.out.println("============================");
		System.out.println();
		System.out.println("[1] Cadastrar Professor");
		System.out.println("[2] Cadastrar Aluno");
		System.out.println("[3] Consultar situação de um docente/discente.");
		System.out.println("[4] Sair");
		System.out.print("Digite a operação: ");
	}
	
	public static Professor cadastrarProfessor() {
		Professor prof = new Professor();
		System.out.println("Cadastro de Professor");
		System.out.print("Digite o nome: ");
		prof.setNome(in.next());
		System.out.print("Digite a matéria: ");
		prof.setMateria(in.next());
		System.out.print("Digite a idade: ");
		prof.setIdade(in.nextInt());
		System.out.print("Digite o salário: ");
		prof.setSalario(in.nextDouble());
		return prof;
	}
	
	public static Aluno cadastrarAluno() {
		Aluno aluno = new Aluno();
		System.out.println("Cadastro de Aluno");
		System.out.print("Digite o nome: ");
		aluno.setNome(in.next());
		System.out.print("Digite o turno: ");
		aluno.setTurno(in.next());
		System.out.print("Digite a idade: ");
		aluno.setIdade(in.nextInt());
		System.out.print("Digite a primeira nota: ");
		aluno.setNota1(in.nextDouble());
		System.out.print("Digite a segunda nota: ");
		aluno.setNota2(in.nextDouble());
		System.out.print("Digite a terceira nota: ");
		aluno.setNota3(in.nextDouble());
		return aluno;
	}
	
	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[Constantes.posicoesVetor];
		String opcao = null;
		int indice = 0;

		do {
			telaInicial();
			opcao = in.next();
			
			switch (opcao) {
			case "1":
				if(indice<Constantes.posicoesVetor) {
					pessoas[indice] = cadastrarProfessor();
					System.out.printf("Código do Professor cadastrado: [%d]\n",indice);
					indice++;
				}else {
					System.out.println("Limite de discentes/docentes cadastrados atingido!!");
				}
				System.out.println();
				break;
			
			case "2":
				if(indice<Constantes.posicoesVetor) {
					
					pessoas[indice] = cadastrarAluno();
					System.out.printf("Código do Aluno cadastrado: [%d]\n",indice);
					indice++;

				}else {
					System.out.println("Limite de discentes/docentes cadastrados atingido!!");
				}
				System.out.println();
				break;
				
			case "3":
					System.out.print("Digite o codigo: ");
					int codigo = in.nextInt();
					if(codigo<indice && codigo>=0) {
						pessoas[codigo].consultarSituacao();
					}else {
						System.out.println("Codigo Inválido!!");
					}
					System.out.println();
				break;
				
			case "4":
				System.out.println();
				System.out.println("Saindo do Programa...");
				System.out.println();
				break;
				
			default:
				System.out.println();
				System.err.println("Opção Inválida!!");
				System.out.println();
				break;
			}
		}while(!"4".equals(opcao));
		in.close();
	}
}
