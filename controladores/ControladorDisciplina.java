package controladores;

import java.util.ArrayList;
import java.util.List;

import classes.Disciplina;

public class ControladorDisciplina {
	Disciplina disciplina;
	List<Disciplina> disciplinaLista;

	public ControladorDisciplina() {
		super();
		this.disciplinaLista = new ArrayList<Disciplina>();
	}

	public ControladorDisciplina(Disciplina disciplina, List<Disciplina> disciplinaLista) {
		super();
		this.disciplina = disciplina;
		this.disciplinaLista = disciplinaLista;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public List<Disciplina> getDisciplinaLista() {
		return disciplinaLista;
	}

	public void setDisciplinaLista(List<Disciplina> disciplinaLista) {
		this.disciplinaLista = disciplinaLista;
	}

	public void cadastrarDisciplina(Disciplina disciplina) {
		this.disciplinaLista.add(disciplina);
	}

	public boolean consultarDisciplina(int idDisciplina) {
		boolean encontrou = false;

		for (int i = 0; i < disciplinaLista.size(); i++) {
			if (disciplinaLista.get(i).getIdDisciplina() == idDisciplina) {
				imprimirDisciplina(i);
				encontrou = true;
				break;
			} else {
				encontrou = false;
			}
		}
		if (encontrou == false) {
			System.out.println("Disciplina não encontrada.");
		}
		return encontrou;
	}

	public boolean removerDisciplina(int idDisciplina) {
		boolean removeu = false;
		if (idDisciplina != 0) {
			for (int i = 0; i < disciplinaLista.size(); i++) {
				if (disciplinaLista.get(i).getIdDisciplina() == idDisciplina) {
					disciplinaLista.remove(i);
					removeu = true;
					System.out.println("Disciplina removida com sucesso!");
					break;
				} else {
					removeu = false;
				}
			}
		}
		if (removeu == false) {
			System.out.println("Disciplina não encontrada");
		}

		return removeu;
	}

	public void imprimirDisciplina(int i) {
		System.out.println("ID: " + disciplinaLista.get(i).getIdDisciplina() + "\tNOME: "
				+ disciplinaLista.get(i).getNomeDisciplina() + "\tEMENTA: " + disciplinaLista.get(i).getEmenta()
				+ "\n");
	}

	public void listarDisciplinas() {
		for (int i = 0; i < disciplinaLista.size(); i++) {
			System.out.println(disciplinaLista.get(i).getIdDisciplina() + " - "
					+ disciplinaLista.get(i).getNomeDisciplina() + ": " + disciplinaLista.get(i).getEmenta());
		}
		System.out.println();
	}
}
