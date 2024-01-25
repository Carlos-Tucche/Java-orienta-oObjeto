package br.com.treinamento.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.treinamento.factory.ConnectFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectFactory connectFactory = new ConnectFactory();
		
		System.out.println("Conectando com o banco...");
		Connection connection = connectFactory.abreConexao();
		System.out.println("Abriu a conexão");
		
		System.out.println("\n");
		
		System.out.println("fechando a conexão...");
		connection.close();
		System.out.println("Conexão fechada.");
	}

}
