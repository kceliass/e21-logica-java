package br.com.filmes.cnn;

import java.sql.*;

public class ConnectionFactory {

	public static Connection getConnection() {
		
		Connection cnn = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/filmes?useTimezone=true&serverTimezone=UTC";
			String usuario = "root";
			String senha = "root";
			
			cnn = DriverManager.getConnection(url, usuario, senha);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		return cnn;
		
	}
}

