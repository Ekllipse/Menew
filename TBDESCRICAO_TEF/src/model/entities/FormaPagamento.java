package model.entities;

import java.util.ArrayList;
import java.util.List;

public class FormaPagamento {
	private String nome;
	private int formaPag;
	private int formaComp;
	
	private List<DescricaoTEF> listDesc = new ArrayList<>();
	
	public FormaPagamento(String nome, int formaPag, int formaComp) {
		this.nome = nome;
		this.formaPag = formaPag;
		this.formaComp = formaComp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(int formaPag) {
		this.formaPag = formaPag;
	}

	public int getFormaComp() {
		return formaComp;
	}

	public void setFormaComp(int formaComp) {
		this.formaComp = formaComp;
	}

	@Override
	public String toString() {
		return "FormaPagamento [nome=" + nome + ", formaPag=" + formaPag + ", formaComp=" + formaComp + ", listDesc="
				+ listDesc + "]";
	}
	

	
	
	
}
