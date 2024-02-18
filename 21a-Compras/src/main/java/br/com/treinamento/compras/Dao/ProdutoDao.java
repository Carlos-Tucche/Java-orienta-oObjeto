package br.com.treinamento.compras.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.treinamento.compras.factory.ConnectionFactory;
import br.com.treinamento.compras.model.Produto;

public class ProdutoDao {
	
	/*Metodo JDBC para SALVAR PRODUTO*/
	
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
	/*Metodo JDBC para LISTAR PRODUTO*/

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
	/*Metodo JDBC para BUSCAR PRODUTO por ID*/

	public Optional<Produto> buscarPorId(Integer codigo) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.abreConexão();
		
		String sqlbuscarPorId= "SELECT id_produto, nome_produto, valor, estoque FROM tb_produto WHERE id_produto = ?";
		
		PreparedStatement pstm = connection.prepareStatement(sqlbuscarPorId);
		pstm.setInt(1, codigo);
		pstm.execute();
		
		ResultSet rst = pstm.getResultSet();
		
		Optional<Produto> produtoOptional = Optional.empty();
		
		if (rst.next()) {
			Produto produto = new Produto();
			produto.setId(rst.getInt("id_produto"));
			produto.setNomeProduto(rst.getString("nome_produto"));
			produto.setValor(rst.getBigDecimal("valor"));
			produto.setEstoque(rst.getInt("estoque"));
			
			produtoOptional = Optional.of(produto);
		}
		
		rst.close();
		pstm.close();
		connection.close();
		
		return produtoOptional;
	}
	/*Metodo JDBC para EDITAR PRODUTO*/
	
	public void Editar(Produto produto) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.abreConexão();
		
		String sqlEditar = "UPDATE tb_produto set nome_produto = ? , valor = ?, estoque = ? WHERE id_produto =?";
		
		//PreparedStartement para evitar o SQL Injection 
		PreparedStatement pstm = connection.prepareStatement(sqlEditar);
		pstm.setString(1, produto.getNomeProduto());
		pstm.setBigDecimal(2, produto.getValor());
		pstm.setInt(3, produto.getEstoque());
		pstm.setInt(4, produto.getId());
		
		pstm.execute();
		pstm.close();
		connection.close();
		
	}
	/*Metodo JDBC para EXCLUIR PRODUTO*/

	public void excluir(Integer codigo) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.abreConexão();
		
		String sqlDeleta = "DELETE FROM tb_produto WHERE id_produto = ?";
		
		//PreparedStartement para evitar o SQL Injection 
		PreparedStatement pstm = connection.prepareStatement(sqlDeleta);
		pstm.setInt(1, codigo);
		
		pstm.execute();
		pstm.close();
		connection.close();
	}

}
