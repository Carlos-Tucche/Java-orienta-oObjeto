package br.com.treinamento.compras.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection AbreConexão() throws SQLException {
		
		return DriverManager.getConnection("jdbc:postgresql://localhost/jdbc","root","123456");
		
	}

}
