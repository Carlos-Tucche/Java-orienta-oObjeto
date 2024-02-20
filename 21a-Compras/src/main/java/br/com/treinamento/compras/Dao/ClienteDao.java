package br.com.treinamento.compras.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.treinamento.compras.factory.ConnectionFactory;
import br.com.treinamento.compras.model.Cliente;

public class ClienteDao {
	
	/*Metodo JDBC para SALVAR CLIENTE*/

	public void salvarCliente(Cliente cliente) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.abreConexão();
		
		String sqlInsere = "INSERT INTO tb_cliente (nome_cliente, cidade, estado, email) values (?,?,?,?)";
		PreparedStatement pstm = connection.prepareStatement(sqlInsere,java.sql.Statement.RETURN_GENERATED_KEYS);
		pstm.setString(1,cliente.getNomeCliente());
		pstm.setString(2,cliente.getCidade());
		pstm.setString(3,cliente.getEstado());
		pstm.setString(4,cliente.getEmail());
		
		pstm.execute();
		pstm.close();
		connection.close();
		
	}
	/*Metodo JDBC para LISTAR CLIENTE*/

	public List<Cliente> listarCliente() throws SQLException {
		
		List<Cliente> clienteList = new ArrayList<Cliente>();
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.abreConexão();
		
		String sqlLista = "SELECT id_cliente, nome_cliente, cidade, estado, email FROM tb_cliente";
		PreparedStatement pstm = connection.prepareStatement(sqlLista);
		pstm.execute();
		
		ResultSet rst = pstm.getResultSet();
		while (rst.next()) {
			Cliente cliente = new Cliente(sqlLista, sqlLista, sqlLista, sqlLista);
			cliente.setIdCliente(rst.getInt("id_cliente"));
			cliente.setNomeCliente(rst.getString("nome_cliente"));
			cliente.setCidade(rst.getString("cidade"));
			cliente.setEstado(rst.getString("estado"));
			cliente.setEmail(rst.getString("email"));
			clienteList.add(cliente);
		}
		
		rst.close();
		pstm.close();
		connection.close();
		
		return clienteList;
	}

	public Optional<Cliente> buscarPorId(Integer codigo) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.abreConexão();
		
		String sqlbuscarPorId= "SELECT id_cliente, nome_cliente, cidade, estado, email FROM tb_cliente WHERE id_cliente = ?";
		
		PreparedStatement pstm = connection.prepareStatement(sqlbuscarPorId);
		pstm.setInt(1, codigo);
		pstm.execute();
		
		ResultSet rst = pstm.getResultSet();
		
		Optional<Cliente> clienteOptional = Optional.empty();
		
		if (rst.next()) {
			Cliente cliente = new Cliente(sqlbuscarPorId, sqlbuscarPorId, sqlbuscarPorId, sqlbuscarPorId);
			cliente.setIdCliente(rst.getInt("id_cliente"));
			cliente.setNomeCliente(rst.getString("nome_cliente"));
			cliente.setCidade(rst.getString("cidade"));
			cliente.setEstado(rst.getString("estado"));
			cliente.setEmail(rst.getString("email"));
			
			clienteOptional = Optional.of(cliente);
		}
		
		rst.close();
		pstm.close();
		connection.close();
		
		return clienteOptional;
	}

}
