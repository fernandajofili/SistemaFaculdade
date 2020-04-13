package controladores;

import java.util.ArrayList;
import java.util.List;

import classes.Aluno;
import classes.Turma;

public class ControladorTurmaAluno {
	Aluno aluno;
	Turma turma;
	List<Aluno> alunoLista;
	List<Turma> turmaLista;

	public ControladorTurmaAluno() {
		super();
		this.alunoLista = new ArrayList<Aluno>();
	}

	public ControladorTurmaAluno(Aluno aluno, Turma turma) {
		super();
		this.aluno = aluno;
		this.turma = turma;
	}

	public ControladorTurmaAluno(Turma turma) {
		super();
		this.turma = turma;
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public List<Aluno> getAlunoLista() {
		return alunoLista;
	}

	public void setAlunoLista(List<Aluno> alunoLista) {
		this.alunoLista = alunoLista;
	}

	public List<Turma> getTurmaLista() {
		return turmaLista;
	}

	public void setTurmaLista(List<Turma> turmaLista) {
		this.turmaLista = turmaLista;
	}

	public void cadastrarAluno(Aluno aluno) {
		this.alunoLista.add(aluno);
	}

	public void cadastrarTurma(Turma turma) {
		this.turmaLista.add(turma);
	}

	public int buscarAluno(String nomeAluno) {
		boolean encontrou = false;
		int i;
		for (i = 0; i < alunoLista.size(); i++) {
			if (alunoLista.get(i).getNome().equals(nomeAluno)) {
				encontrou = true;
				break;
			} else {
				encontrou = false;
			}
		}
		if (encontrou == false) {
			System.out.println("Aluno não encontrado.");
		}
		return i;
	}

	public void consultarAluno(String nomeAluno) {
		int i = buscarAluno(nomeAluno);
		if (i != -1) {
			System.out.println("ID: " + alunoLista.get(i).getId() + "\tNOME: " + alunoLista.get(i).getNome()
					+ "\tUSER: " + alunoLista.get(i).getUser() + "\tPERÍODO: " + alunoLista.get(i).getPeriodo() + "\n");
		}
	}

	public boolean removerAluno(String nomeAluno) {
		boolean removeu = false;
		if (!nomeAluno.isBlank()) {
			for (int i = 0; i < alunoLista.size(); i++) {
				if (alunoLista.get(i).getNome().equals(nomeAluno)) {
					alunoLista.remove(i);
					removeu = true;
					System.out.println("Aluno removido com sucesso!");
					break;
				} else {
					removeu = false;
				}
			}
		}
		if (removeu == false) {
			System.out.println("Aluno não encontrado");
		}

		return removeu;
	}

	public void listarAlunos() {
		for (int i = 0; i < alunoLista.size(); i++) {
			System.out.println(alunoLista.get(i).getId() + " - " + alunoLista.get(i).getNome());
		}

		System.out.println("\n");
	}

	public int buscarTurma(int idTurma) {
		boolean encontrou = false;
		int i;
		for (i = 0; i < turmaLista.size(); i++) {
			if (turmaLista.get(i).getIdTurma() == idTurma) {
				encontrou = true;
				break;
			} else {
				encontrou = false;
			}
		}
		if (encontrou == false) {
			i = -1;
			System.out.println("Turma não encontrada.");
		}
		return i;
	}
	
	public Turma retornaTurma(int idTurma) {
		Turma turma = null;
		boolean encontrou = false;
		int i;
		for ( i = 0; i < turmaLista.size(); i++) {
			if (turmaLista.get(i).getIdTurma() == idTurma) {
				turma = turmaLista.get(i);
				encontrou = true;
				break;
			} else {
				encontrou = false;
			}
		}
		if (encontrou == false) {
			i = -1;
			System.out.println("Turma não encontrada.");
		}
		return turma;
	}

	public void consultarTurma(int idTurma) {
		int i = buscarTurma(idTurma);
		if (i != -1) {
			System.out.println("ID: " + turmaLista.get(i).getIdTurma() + "\tDISCIPLINA: "
					+ turmaLista.get(i).getDisciplina().getNomeDisciplina() + "\tPROFESSOR: "
					+ turmaLista.get(i).getProfessor().getNome() + "\tCapacidade: " + turmaLista.get(i).getCapacidade()
					+ "\n");
		}
	}

	public void listarTurmas() {
		System.out.println("ID - DISCIPLINA - PROFESSOR - CAPACIDADE");
		for (int j = 0; j < turmaLista.size(); j++) {
			System.out.println(turmaLista.get(j).getIdTurma() + " - "
					+ turmaLista.get(j).getDisciplina().getNomeDisciplina() + " - "
					+ turmaLista.get(j).getProfessor().getNome() + " - " + turmaLista.get(j).getCapacidade());
		}
		System.out.println();
	}

	public Aluno returnAlunoTurma(int idTurma, String nomeAluno) {
		Aluno retorno = null;
		if (buscarTurma(idTurma) != -1) {
			for (int i = 0; i < alunoLista.size(); i++) {
				if (alunoLista.get(i).getNome().equals(nomeAluno)) {
					retorno = alunoLista.get(i);

				}
			}

		}
		return retorno;
	}

	public Aluno retornaAluno(int idTurma, String nomeAluno) {
		Aluno retorno = null;
		if (buscarTurma(idTurma) != -1) {
			for (int i = 0; i < alunoLista.size(); i++) {
				if (alunoLista.get(i).getNome().equals(nomeAluno)) {
					retorno = alunoLista.get(i);

				}
			}

		}
		return retorno;
	}
	
	public boolean addAlunoTurma(Aluno aluno) {
		boolean add = false;

		return add;
	}
}
