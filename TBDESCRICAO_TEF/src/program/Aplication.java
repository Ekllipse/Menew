package program;

import java.sql.Connection;

import bd.DBConn;

public class Aplication {

	public static void main(String[] args) {
		Connection conexao = DBConn.getConexao();

		
		DBConn.closeConnection();
	}

}
