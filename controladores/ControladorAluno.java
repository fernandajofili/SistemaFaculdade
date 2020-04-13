package controladores;

import java.util.ArrayList;
import java.util.List;

import classes.Aluno;

public class ControladorAluno {
	Aluno aluno;
	List<Aluno> alunoLista;

	public ControladorAluno() {
		super();
		this.alunoLista = new ArrayList<Aluno>();
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Aluno> getAlunoLista() {
		return alunoLista;
	}

	public void setAlunoLista(List<Aluno> alunoLista) {
		this.alunoLista = alunoLista;
	}

	public void cadastrarAluno(Aluno aluno) {
		this.alunoLista.add(aluno);
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
}
