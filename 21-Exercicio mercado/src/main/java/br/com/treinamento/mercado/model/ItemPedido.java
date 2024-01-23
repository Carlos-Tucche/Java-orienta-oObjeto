package br.com.treinamento.mercado.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ItemPedido {

	public ItemPedido(Produto produto, Integer quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorUnitario = produto.getPreco();
		this.valorTotal = valorUnitario.multiply(new BigDecimal(quantidade));
	}

	@Getter @Setter
	private Produto produto;
	
	@Getter @Setter
	private Integer quantidade;
	
	@Getter @Setter
	private BigDecimal valorUnitario;

	@Getter @Setter
	private BigDecimal valorTotal;
}
