package br.com.treinamento.compras.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	public List<Produto> listarProduto() throws SQLException {
		
		List<Produto> produtoList = new ArrayList<Produto>();
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.abreConexão();
		
		String sqlLista = "SELECT id_produto, nome_produto, valor, estoque FROM tb_produto";
		PreparedStatement pstm = connection.prepareStatement(sqlLista);
		pstm.execute();
		
		ResultSet rst = pstm.getResultSet();
		while (rst.next()) {
			Produto produto = new Produto();
			produto.setId(rst.getInt("id_produto"));
			produto.setNomeProduto(rst.getString("nome_produto"));
			produto.setValor(rst.getBigDecimal("valor"));
			produto.setEstoque(rst.getInt("estoque"));
			produtoList.add(produto);
		}
		
		rst.close();
		pstm.close();
		connection.close();
		
		return produtoList;
		
	}

}
