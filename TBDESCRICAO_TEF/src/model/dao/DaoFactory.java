package model.dao;

import bd.DBConn;
import model.dao.impl.DescricaoDAOJDBC;
import model.dao.impl.FormaPagamentoDAOJDBC;

public class DaoFactory {
	public static FormaPagamentoDAO createFormaPagamentoDAO() {
		return new FormaPagamentoDAOJDBC(DBConn.getConexao());
	}
	
	public static DescricaoDAO createDescricaoDAO() {
		return new DescricaoDAOJDBC();
	}
}
