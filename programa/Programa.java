package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import classes.Aluno;
import classes.Disciplina;
import classes.Professor;
import classes.Turma;
import controladores.ControladorAluno;
import controladores.ControladorDisciplina;
import controladores.ControladorProfessor;
import controladores.ControladorTurma;
import controladores.ControladorTurmaAluno;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

		String opcaoMenu = "";

		Aluno alunoEx1 = new Aluno(1, "Fernanda Jófili", data.parse("24/11/1994"), "fernandajofili", "abc123", 2);
		Aluno alunoEx2 = new Aluno(2, "Rafael Brito", data.parse("01/01/1994"), "rafaelbrito", "abc123", 2);
		Aluno alunoEx3 = new Aluno(3, "André Leão", data.parse("02/02/1994"), "andreleao", "abc123", 2);
		Aluno alunoEx4 = new Aluno(4, "Débora Amorim", data.parse("03/03/1994"), "deboraamorim", "abc123", 2);

		Professor professorEx1 = new Professor(1, "Renato Cruz", data.parse("03/03/1994"), "renatocruz", "abc123",
				"Professor");
		Professor professorEx2 = new Professor(2, "Rafaella Matos", data.parse("04/04/1994"), "rafaellamatos", "abc123",
				"Professor");
		Professor professorEx3 = new Professor(3, "Rodrigo Brasileiro", data.parse("05/05/1994"), "rodrigobrasileiro",
				"abc123", "Professor");

		Disciplina disciplinaEx1 = new Disciplina(1, "Modelagem e POO", "Java - POO");
		Disciplina disciplinaEx2 = new Disciplina(2, "Fundamentos de BD", "Entidades, relacionamentos");
		Disciplina disciplinaEx3 = new Disciplina(3, "Lógica computacional", "Tabela verdade");

		Turma turmaEx1 = new Turma();
		turmaEx1.setIdTurma(101);
		turmaEx1.setCapacidade(5);
		/*
		 * turmaEx1.setDisciplina(disciplinaEx1); turmaEx1.setProfessor(professorEx1);
		 * 
		 * Turma turmaEx2 = new Turma(); turmaEx2.setIdTurma(102);
		 * turmaEx2.setCapacidade(2); turmaEx2.setDisciplina(disciplinaEx2);
		 * turmaEx2.setProfessor(professorEx2);
		 * 
		 * Turma turmaEx3 = new Turma(); turmaEx3.setIdTurma(103);
		 * turmaEx3.setCapacidade(1); turmaEx3.setDisciplina(disciplinaEx3);
		 * turmaEx3.setProfessor(professorEx3);
		 * 
		 * Turma turmaEx4 = new Turma(); turmaEx4.setIdTurma(104);
		 * turmaEx4.setCapacidade(3); turmaEx4.setDisciplina(disciplinaEx1);
		 * turmaEx4.setProfessor(professorEx1);
		 * 
		 * Turma turmaEx5 = new Turma(); turmaEx5.setIdTurma(105);
		 * turmaEx5.setCapacidade(3); turmaEx5.setDisciplina(disciplinaEx2);
		 * turmaEx5.setProfessor(professorEx2);
		 * 
		 * Turma turmaEx6 = new Turma(); turmaEx6.setIdTurma(106);
		 * turmaEx6.setCapacidade(3); turmaEx6.setDisciplina(disciplinaEx3);
		 * turmaEx6.setProfessor(professorEx3);
		 */
		ControladorAluno controladorAluno = new ControladorAluno();
		controladorAluno.cadastrarAluno(alunoEx1);
		controladorAluno.cadastrarAluno(alunoEx2);
		controladorAluno.cadastrarAluno(alunoEx3);
		controladorAluno.cadastrarAluno(alunoEx4);

		ControladorProfessor controladorProfessor = new ControladorProfessor();
		controladorProfessor.cadastrarProfessor(professorEx1);
		controladorProfessor.cadastrarProfessor(professorEx2);
		controladorProfessor.cadastrarProfessor(professorEx3);

		ControladorDisciplina controladorDisciplina = new ControladorDisciplina();
		controladorDisciplina.cadastrarDisciplina(disciplinaEx1);
		controladorDisciplina.cadastrarDisciplina(disciplinaEx2);
		controladorDisciplina.cadastrarDisciplina(disciplinaEx3);

		ControladorTurma controladorTurma = new ControladorTurma();
		controladorTurma.cadastrarTurma(turmaEx1);
		/*
		 * controladorTurma.cadastrarTurma(turmaEx2);
		 * controladorTurma.cadastrarTurma(turmaEx3);
		 */
		System.out.println(
				"x----------------------------------     PRIMO SISTEMAS     -----------------------------------x");
		do {
			menu();
			opcaoMenu = sc.next().toUpperCase();
			switch (opcaoMenu) {
			case "1": // CADASTRAR ALUNO
				Aluno aluno = new Aluno();
				System.out.println("\n> Cadastro de Aluno");
				System.out.println("ID: ");
				aluno.setId(sc.nextInt());

				System.out.println("Nome: ");
				sc.nextLine();
				aluno.setNome(sc.nextLine());

				System.out.println("Data de Nascimento: ");
				aluno.setDataNasc(data.parse(sc.next()));

				System.out.println("Período: ");
				aluno.setPeriodo(sc.nextInt());

				System.out.println("Usuário: ");
				aluno.setUser(sc.next());

				System.out.println("Senha: ");
				aluno.setSenha(sc.next());

				controladorAluno.cadastrarAluno(aluno);
				System.out.println();
				break;
			case "2": // CONSULTAR ALUNO
				System.out.println("\n> Consulta de Aluno");
				System.out.println("Nome: ");
				sc.nextLine();
				controladorAluno.consultarAluno(sc.nextLine());
				break;
			case "3": // REMOVER ALUNO
				System.out.println("\n> Remover Aluno");
				System.out.println("Nome: ");
				sc.nextLine();
				controladorAluno.removerAluno(sc.nextLine());
				sc.nextLine();
				break;
			case "4": // LISTAR ALUNOS
				System.out.println("\n> Listar Alunos");
				controladorAluno.listarAlunos();
				break;
			case "5": // CADASTRAR PROFESSOR
				Professor professor = new Professor();
				System.out.println("\n Cadastro de Professor");
				System.out.println("ID: ");
				professor.setId(sc.nextInt());

				System.out.println("Nome: ");
				sc.nextLine();
				professor.setNome(sc.nextLine());

				System.out.println("Data de Nascimento: ");
				professor.setDataNasc(data.parse(sc.next()));

				System.out.println("Cargo: ");
				sc.nextLine();
				professor.setCargo(sc.nextLine());

				System.out.println("Usuário: ");
				professor.setUser(sc.next());

				System.out.println("Senha: ");
				professor.setSenha(sc.next());
				controladorProfessor.cadastrarProfessor(professor);
				break;
			case "6": // CONSULTAR PROFESSOR
				System.out.println("\n> Consulta de Professor");
				System.out.println("Nome: ");
				sc.nextLine();
				String nomeProfessor = sc.nextLine();
				controladorProfessor.consultarProfessor(nomeProfessor);
				break;
			case "7": // REMOVER PROFESSOR
				System.out.println("\n> Remover Professor");
				System.out.println("Nome: ");
				sc.nextLine();
				controladorProfessor.removerProfessor(sc.nextLine());
				sc.nextLine();
				break;
			case "8": // LISTAR PROFESSORES
				System.out.println("\n> Listar Professores");
				controladorProfessor.listarProfessores();
				break;
			case "9": // CADASTRAR DISCIPLINA
				Disciplina disciplina = new Disciplina();
				System.out.println("\n> Cadastrar Disciplina");
				System.out.println("ID: ");
				disciplina.setIdDisciplina(sc.nextInt());

				System.out.println("Nome: ");
				sc.nextLine();
				disciplina.setNomeDisciplina(sc.nextLine());

				System.out.println("Ementa: ");
				disciplina.setEmenta(sc.nextLine());

				controladorDisciplina.cadastrarDisciplina(disciplina);
				break;
			case "10": // CONSULTAR DISCIPLINA
				System.out.println("\n> Consulta de Disciplina");
				System.out.println("ID: ");

				controladorDisciplina.consultarDisciplina(sc.nextInt());
				break;
			case "11": // REMOVER DISCIPLINA
				System.out.println("\n> Remover Disciplina");
				System.out.println("ID: ");
				controladorDisciplina.removerDisciplina(sc.nextInt());
				break;
			case "12": // LISTAR DISCIPLINAS
				System.out.println("\n> Listar Disciplinas");
				controladorDisciplina.listarDisciplinas();
				break;
			case "13": // CADASTRAR TURMA
				Turma turma = new Turma();
				System.out.println("\n> Cadastrar Turma");
				System.out.println("ID: ");
				turma.setIdTurma(sc.nextInt());

				System.out.println("Capacidade: ");
				turma.setCapacidade(sc.nextInt());

				break;
			case "14": // CONSULTAR TURMA
				System.out.println("\n> Consulta de Turma");
				System.out.println("ID da Turma: ");

				// controladorTurma.consultarTurma(sc.nextInt());
				controladorTurma.consultarTurma(sc.nextInt());
				break;
			case "15": // LISTAR TURMAS
				System.out.println("\n> Listar Turmas");
				controladorTurma.listarTurmas();
				break;
			case "16": // ADICIONAR ALUNO À TURMA
				System.out.println("\n> Adicionar aluno à turma");
				System.out.println("Informe ID turma: ");
				int idTurma = sc.nextInt();

				System.out.println("Nome do aluno: ");
				String nomeAluno = sc.nextLine();
				/*
				 * int posTurma = controladorTurmaAluno.buscarTurma(idTurma); if (posTurma !=
				 * -1) { int posAluno = controladorTurmaAluno.buscarAluno(nomeAluno); if
				 * (posAluno != -1) { ControladorTurmaAluno alunoTurmaEx1 = new
				 * ControladorTurmaAluno();
				 * alunoTurmaEx1.setAluno(controladorTurmaAluno.getAlunoLista().get(posAluno));
				 * alunoTurmaEx1.setTurma(controladorTurmaAluno.getTurmaLista().get(posTurma));
				 * } }
				 */
				break;
			case "X":
				System.out.println("\n...");
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (!opcaoMenu.equals("X"));

		sc.close();
	}

	public static void menu() {
		System.out.println("1 - Cadastrar Aluno\t2 - Consultar Aluno\t3 - Remover Aluno\t4 - Listar Alunos");
		System.out.println(
				"5 - Cadastrar Professor\t6 - Consultar Professor\t7 - Remover Professor\t8 - Listar Professores");
		System.out.println(
				"9 - Cadastrar Disciplina\t10 - Consultar Disciplina\t11 - Remover Disciplina\t12 - Listar Disciplinas");
		System.out.println("13 - Consultar Turma\t14 - Listar Turmas");
		System.out.println("\nX - Sair");
	}

}
