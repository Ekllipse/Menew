package program;

import java.sql.Connection;

import bd.DBConn;
import model.dao.DaoFactory;
import model.dao.FormaPagamentoDAO;
import model.entities.FormaPagamento;

public class Aplication {

	public static void main(String[] args) {
		Connection conexao = DBConn.getConexao();

		FormaPagamentoDAO fpD = DaoFactory.createFormaPagamentoDAO();
		
		FormaPagamento fp = fpD.Select(1, 0);
		
		System.out.println(fp);
		
		DBConn.closeConnection();
	}

}
