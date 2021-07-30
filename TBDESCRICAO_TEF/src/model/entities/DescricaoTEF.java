package model.entities;

import model.entities.enums.TipoForma;

public class DescricaoTEF {
	

	private String DescNome;
	private TipoForma tipoDesc;
	
	public DescricaoTEF(String descNome, TipoForma tipoDesc) {
		DescNome = descNome;
		this.tipoDesc = tipoDesc;
	}

	public String getDescNome() {
		return DescNome;
	}

	public void setDescNome(String descNome) {
		DescNome = descNome;
	}

	public TipoForma getTipoDesc() {
		return tipoDesc;
	}

	public void setTipoDesc(TipoForma tipoDesc) {
		this.tipoDesc = tipoDesc;
	}
	
	@Override
	public String toString() {
		return "DescricaoTEF [DescNome=" + DescNome + ", tipoDesc=" + tipoDesc + "]";
	}
	
	
	
	
	
	
}
