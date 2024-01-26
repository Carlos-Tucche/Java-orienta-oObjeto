package br.com.treinamento.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	public List<Produto> listarProduto() throws SQLException {
		
		List<Produto> produtoList = new ArrayList<>();
		
		ConnectFactory factory = new ConnectFactory();
		Connection connection = factory.abreConexao();
		
		String sqlLista = "SELECT id_produto, nome, preco FROM tb_produto";
		PreparedStatement pstm = connection.prepareStatement(sqlLista);
		pstm.execute();
		
		ResultSet rst = pstm.getResultSet();
		while (rst.next()) {
			Produto produto = new Produto();
			produto.setId(rst.getInt("id_produto"));
			produto.setNome(rst.getString("nome"));
			produto.setPreco(rst.getBigDecimal("preco"));
			produtoList.add(produto);
		}
		
		rst.close();
		pstm.close();
		connection.close();
		
		return produtoList;
	}
	
	/*public ProdutoDao buscaPorId(Integer codigo) throws SQLException {
		
		ConnectFactory factory = new ConnectFactory();
		Connection connection = factory.abreConexao();
		
		String sqlBuscaPorId = "SELECT id_produto, nome, preco FROM tb_produto";
		
		return null;
	}*/

}
