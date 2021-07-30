package model.dao;

import java.util.List;

import model.entities.DescricaoTEF;

public interface DescricaoDAO {

	void Insert(DescricaoTEF formaPag);
	
	void Update(DescricaoTEF formaPag);
	
	List<DescricaoTEF> getAllDesc ();
}
