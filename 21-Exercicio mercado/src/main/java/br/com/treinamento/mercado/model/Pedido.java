package br.com.treinamento.mercado.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Pedido {
	
	public Pedido(Cliente cliente) {
		Pedido.numero = ++contador;
		Pedido.cliente = cliente;
	}

	static @Getter @Setter
	private Integer numero;
	private Integer contador = 0;
	
	static @Getter @Setter
	private Cliente cliente;
	
	@Getter @Setter
	private List<ItemPedido> itensPedidos = new ArrayList<ItemPedido>();

	static @Getter @Setter
	private BigDecimal totalPedido = BigDecimal.ZERO;
	
	public void adicionarItem(ItemPedido item) {
		itensPedidos.add(item);
		totalPedido = totalPedido.add(item.getValorTotal());
	}
}
