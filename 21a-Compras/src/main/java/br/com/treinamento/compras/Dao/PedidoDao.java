package br.com.treinamento.compras.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.treinamento.compras.factory.ConnectionFactory;
import br.com.treinamento.compras.model.Pedido;

public class PedidoDao {

	public void salvarPedido(Pedido pedido) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.abreConexão();
		
		String sqlInsere = "INSERT INTO tb_pedido (id_pedido, id_cliente, total_pedido) values (?,?,?)";
		PreparedStatement pstm = connection.prepareStatement(sqlInsere,java.sql.Statement.RETURN_GENERATED_KEYS);
		pstm.setInt(1,pedido.getIdPedido());
		pstm.setInt(2,pedido.getClienteId());
		pstm.setBigDecimal(3,pedido.getTotalPedido());
		
		pstm.execute();
		pstm.close();
		connection.close();		
	}

	public List<Pedido> listarPedidos() throws SQLException {

		List<Pedido> pedidoList = new ArrayList<Pedido>();
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.abreConexão();
		
		String sqlLista = "SELECT id_pedido, id_cliente, total_pedido, FROM tb_pedido";
		PreparedStatement pstm = connection.prepareStatement(sqlLista);
		pstm.execute();
		
		ResultSet rst = pstm.getResultSet();
		while (rst.next()) {
			Pedido pedido = new Pedido();
			pedido.setIdPedido(rst.getInt("id_pedido"));
			pedido.setClienteId(rst.getInt("id_cliente"));
			pedido.setTotalPedido(rst.getBigDecimal("total_pedido"));
			
			pedidoList.add(pedido);
		}
		
		rst.close();
		pstm.close();
		connection.close();
		
		return pedidoList;
	}

}
