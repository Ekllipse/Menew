package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import bd.DBConn;
import model.dao.FormaPagamentoDAO;
import model.entities.FormaPagamento;

public class FormaPagamentoDAOJDBC implements FormaPagamentoDAO {
	
	private Connection conn;
	
	public FormaPagamentoDAOJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void Insert(FormaPagamento formaPag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(FormaPagamento formaPag) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public FormaPagamento Select(int formaPag, int formaComp) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("Select DESCRICAO, NUMERO, TIPO from tbforma where numero = ? and tipo = ?");
			
			st.setInt(1, formaPag);
			st.setInt(2, formaComp);
			
			rs = st.executeQuery();
			
			if(rs.next()) {
				FormaPagamento fp = new FormaPagamento(rs.getString("DESCRICAO"), rs.getInt("NUMERO"), rs.getInt("TIPO"));
				return fp;
			}
			return null;
			
		}catch(SQLException e ) {
			System.out.println("Erro ao tentar select by NUMERO,DESCRICAO :  " + e.getMessage());
			return null;
		}

		
	}

	@Override
	public List<FormaPagamento> getAllForma() {
	
		return null;
	}

}
