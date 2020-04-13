package classes;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	int idTurma, capacidade;
	Disciplina disciplina;
	Professor professor;
	List<Aluno> alunoTurmaLista = new ArrayList<>();

	public Turma() {
	}

	public Turma(Disciplina disciplina, Professor professor) {
		this.disciplina = disciplina;
		this.professor = professor;
	}

	public Turma(int idTurma, int capacidade) {
		super();
		this.idTurma = idTurma;
		this.capacidade = capacidade;
	}

	/*
	 * public Turma(int idTurma, int capacidade, Disciplina disciplina, Professor
	 * professor) { super(); this.idTurma = idTurma; this.capacidade = capacidade;
	 * this.disciplina = disciplina; this.professor = professor; }
	 */
	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunoTurmaLista() {
		return alunoTurmaLista;
	}

	public void setAlunoTurmaLista(List<Aluno> alunoTurmaLista) {
		this.alunoTurmaLista = alunoTurmaLista;
	}

	/*
	 * public void adicionarAluno(Aluno aluno) { this.alunoTurmaLista.add(aluno); }
	 */
}
