package controladores;

import java.util.ArrayList;
import java.util.List;

import classes.Aluno;
import classes.Turma;

public class ControladorTurma {
	Aluno aluno;
	Turma turma;
	List<Aluno> alunoLista;
	List<Turma> turmaLista;

	public ControladorTurma() {
		super();
		this.alunoLista = new ArrayList<Aluno>();
	}

	public ControladorTurma(Aluno aluno, Turma turma) {
		super();
		this.aluno = aluno;
		this.turma = turma;
	}

	public ControladorTurma(Aluno aluno) {
		super();
		this.aluno = aluno;
	}
	
	public ControladorTurma(Turma turma) {
		super();
		this.turma = turma;
	}
	

	public void cadastrarAluno(Aluno aluno) {
		this.alunoLista.add(aluno);
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

	public void cadastrarTurma(Turma turma) {
		this.turmaLista.add(turma);
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

	public void consultarTurma(int idTurma) {
		int i = buscarTurma(idTurma);
		if (i != -1) {
			System.out.println("ID: " + turmaLista.get(i).getIdTurma() + "\tDISCIPLINA: "
					+ turmaLista.get(i).getDisciplina().getNomeDisciplina() + "\tPROFESSOR: "
					+ turmaLista.get(i).getProfessor().getNome() + "\nCapacidade: "
					+ turmaLista.get(i).getCapacidade());
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

}
