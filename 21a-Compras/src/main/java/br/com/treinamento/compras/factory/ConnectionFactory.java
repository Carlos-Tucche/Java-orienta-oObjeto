package br.com.treinamento.compras.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection abreConexão() throws SQLException {
		
		//return DriverManager.getConnection("jdbc:postgresql://localhost/compras","root","123456");
		return DriverManager.getConnection("jdbc:postgresql://localhost/compras","root","123456");
	}

}
