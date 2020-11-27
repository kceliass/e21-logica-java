package br.com.filmes.cnn;
import java.sql.*;

public class ConnectionFactory {

	public static Connection getConnection() throws SQLException,ClassNotFoundException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/filme", "root", "root");
	
		return cnn;
	}
}
