package entities;

import entities.enums.TipoCampo;

public class ChaveValor {
	private String campo;
	private int posicao;
	private String valor;
	private TipoCampo tipoCampo;
	

	public ChaveValor(String campo, TipoCampo tipoCampo) {
		this.campo = campo;
		this.tipoCampo = tipoCampo;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public String getValor() {
		if((this.tipoCampo == TipoCampo.VARCHAR) && !(this.valor.equals("NULL"))) {
			this.valor = "\"" + valor + "\"";
		}
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	
	
}
