package br.com.treinamento.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.treinamento.factory.ConnectFactory;
import br.com.treinamento.model.Produto;

public class ProdutoDao {

	public void salvaProduto(Produto produto) throws SQLException {
		
		ConnectFactory factory = new ConnectFactory();
		Connection connection = factory.abreConexao();
		
		String sqlInsere = "INSERT INTO tb_produto (nome, preco) values (?,?)";
		
		//PreparedStartement para evitar o SQL Injection 
		PreparedStatement pstm = connection.prepareStatement(sqlInsere, java.sql.Statement.RETURN_GENERATED_KEYS);
		pstm.setString(1, produto.getNome());
		pstm.setBigDecimal(2, produto.getPreco());
		
		pstm.execute();
		pstm.close();
		connection.close();
		
		
	}

}
