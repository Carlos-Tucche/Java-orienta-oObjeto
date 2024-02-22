package br.com.treinamento.compras.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Pedido {

	public Pedido() {
	}
	
	public Pedido(Cliente clientePedido) {
		this.clientePedido = clientePedido;
	}

	@Getter @Setter
	private Cliente clientePedido;

	@Getter @Setter
	private Integer idPedido;
	
	@Getter @Setter
	private Integer clienteId;
	
	@Getter @Setter
	private BigDecimal totalPedido;
	
	@Getter @Setter
	private List<ItemPedido> itensPedidos = new ArrayList<ItemPedido>();

	public void adcionarItem(ItemPedido item) {
		itensPedidos.add(item);
		totalPedido = totalPedido.add(item.getValorTotal());
	}

}
