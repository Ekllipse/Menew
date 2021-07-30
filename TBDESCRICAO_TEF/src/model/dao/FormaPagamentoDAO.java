package model.dao;

import java.util.List;

import model.entities.FormaPagamento;

public interface FormaPagamentoDAO {
	
	void Insert(FormaPagamento formaPag);
	
	void Update(FormaPagamento formaPag);
	
	FormaPagamento Select(int formaPag, int formaComp);
	
	List<FormaPagamento> getAllForma ();
	

}
