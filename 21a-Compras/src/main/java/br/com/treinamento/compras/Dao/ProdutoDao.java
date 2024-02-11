package br.com.treinamento.compras.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.treinamento.compras.factory.ConnectionFactory;
import br.com.treinamento.compras.model.Produto;

public class ProdutoDao {
	
	public void salvaProduto(Produto produto) throws SQLException {
	
	ConnectionFactory factory = new ConnectionFactory();
	Connection connection = factory.abreConexão();
	
	String sqlInsere = "INSERT INTO tb_produto (nome_produto, valor, estoque) values (?,?,?)";
	
	PreparedStatement pstm = connection.prepareStatement(sqlInsere,java.sql.Statement.RETURN_GENERATED_KEYS );
	pstm.setString(1,produto.getNomeProduto());
	pstm.setBigDecimal(2, produto.getValor());
	pstm.setInt(3, produto.getEstoque());
	
	pstm.execute();
	pstm.close();
	connection.close();
	
	}

}
