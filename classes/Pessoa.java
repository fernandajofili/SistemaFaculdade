package classes;

import java.util.Date;
import java.util.List;

public abstract class Pessoa {
	int id;
	String nome = "";
	Date dataNasc;
	String user = "";
	String senha = "";
	
	
	
	public Pessoa() {
		super();
	}

	public Pessoa(int id, String nome, Date dataNasc, String user, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.user = user;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public abstract void lista(List<String> pessoas);
	
}
