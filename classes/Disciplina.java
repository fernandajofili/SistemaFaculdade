package classes;

import java.util.List;

public class Disciplina {
	int idDisciplina;
	String nomeDisciplina = "";
	String ementa = "";

	public Disciplina() {
		super();
	}

	public Disciplina(int idDisciplina, String nomeDisciplina, String ementa) {
		super();
		this.idDisciplina = idDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.ementa = ementa;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	public void lista(List<String> turmas) {
		// lista de turmas
		
	}
	
}
