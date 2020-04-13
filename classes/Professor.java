package classes;

import java.util.Date;
import java.util.List;

public class Professor extends Pessoa {
	String cargo = "";

	public Professor() {
		super();
		this.cargo = "Professor";
	}

	public Professor(int id, String nome, Date dataNasc, String user, String senha, String cargo) {
		super(id, nome, dataNasc, user, senha);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public void lista(List<String> pessoas) {
		// TODO Auto-generated method stub

	}

}
