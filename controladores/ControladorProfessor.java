package controladores;

import java.util.ArrayList;
import java.util.List;

import classes.Professor;

public class ControladorProfessor {
	Professor professor;
	List<Professor> professorLista;

	public ControladorProfessor() {
		super();
		this.professorLista = new ArrayList<Professor>();
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Professor> getProfessorLista() {
		return professorLista;
	}

	public void setProfessorLista(List<Professor> professorLista) {
		this.professorLista = professorLista;
	}

	public void cadastrarProfessor(Professor professor) {
		this.professorLista.add(professor);
	}

	public boolean consultarProfessor(String nomeProfessor) {
		boolean encontrou = false;

		for (int i = 0; i < professorLista.size(); i++) {
			if (professorLista.get(i).getNome().equals(nomeProfessor)) {
				imprimirProfessor(i);
				encontrou = true;
				break;
			} else {
				encontrou = false;
			}
		}
		if (encontrou == false) {
			System.out.println("Professor não encontrado.");
		}
		return encontrou;
	}

	public void imprimirProfessor(int i) {
		System.out.println("ID: " + professorLista.get(i).getId() + "\tNOME: " + professorLista.get(i).getNome()
				+ "\tUSER: " + professorLista.get(i).getUser() + "\n");
	}

	public boolean removerProfessor(String nomeProfessor) {
		boolean removeu = false;
		if (!nomeProfessor.isBlank()) {
			for (int i = 0; i < professorLista.size(); i++) {
				if (professorLista.get(i).getNome().equals(nomeProfessor)) {
					professorLista.remove(i);
					removeu = true;
					System.out.println("Professor removido com sucesso!");
					break;
				} else {
					removeu = false;
				}
			}
		}
		if (removeu == false) {
			System.out.println("Professor não encontrado");
		}

		return removeu;
	}

	public void listarProfessores() {
		for (int i = 0; i < professorLista.size(); i++) {
			System.out.println(professorLista.get(i).getId() + " - " + professorLista.get(i).getNome());
		}
		System.out.println("\n");
	}

}
