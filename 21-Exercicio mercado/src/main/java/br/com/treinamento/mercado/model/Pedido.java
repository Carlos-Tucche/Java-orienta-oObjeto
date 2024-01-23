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
		this.numero = ++contador;
		this.cliente = cliente;
	}

	@Getter 
	public Integer numero;
	public static Integer contador = 0;
	
	@Getter 
	private Cliente cliente;
	
	@Getter @Setter
	private List<ItemPedido> itensPedidos = new ArrayList<ItemPedido>();

	@Getter @Setter
	private BigDecimal totalPedido = BigDecimal.ZERO;
	
	public void adicionarItem(ItemPedido item) {
		itensPedidos.add(item);
		totalPedido = totalPedido.add(item.getValorTotal());
	}
	
}
