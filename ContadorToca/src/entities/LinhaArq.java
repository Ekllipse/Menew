package entities;

public class LinhaArq {
	private double valor;
	private int multiplicador;
	
	
	public LinhaArq(double valor, int multiplicador) {
		this.valor = valor;
		this.multiplicador = multiplicador;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public int getMultiplicador() {
		return multiplicador;
	}


	public void setMultiplicador(int multiplicador) {
		this.multiplicador = multiplicador;
	}
	
	public Double ValorFinal() {
	
		return valor* multiplicador ;
	}
	
	
	
	
}
