package br.com.treinamento.compras.app;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.treinamento.compras.factory.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		System.out.println("Conectando com o banco");
		Connection connection = connectionFactory.abreConexão();
		System.out.println("Abriu a conexão 2.");
		
		System.out.println("\n");
		
		System.out.println("fechando a conexão...");
		connection.close();
		System.out.println("Conexão 2 fechada.");

	}

}
