package bd;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Connection conexao;
	
	public static Connection getConexao() {
		try {
			if(conexao == null) {
				Class.forName("org.firebirdsql.jdbc.FBDriver");
				conexao = DriverManager.getConnection("jdbc:firebirdsql://localhost/" + 
				System.getProperty("user.dir") + "/NETUNO.FDB","SYSDBA","masterkey"); 
			}
			return conexao;
		}catch(ClassNotFoundException e) {
			System.out.println("Erro no driver JDBC: " + e.getMessage());
			return null;
		}catch(SQLException j) {
			System.out.println("Erro na conexao com o banco de dados: " + j.getMessage());
			return null;
		}
		
	}
}
