package br.com.treinamento.compras.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class ItemPedido {
	

	public ItemPedido(Produto produto, Integer quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	@Getter @Setter
	private Produto produto;
	
	@Getter @Setter
	private Integer produtoId;
	
	@Getter @Setter
	private Integer quantidade;
	
	@Getter @Setter
	private BigDecimal valorUnitario;
	
	@Getter @Setter
	private BigDecimal valorTotal;

}
