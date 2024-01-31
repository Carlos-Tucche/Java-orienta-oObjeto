package br.com.treinamento.compras.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class ItermPedido {
	
	@Getter @Setter
	private Integer produtoId;
	
	@Getter @Setter
	private Integer quantidade;
	
	@Getter @Setter
	private BigDecimal valorUnitario;
	
	@Getter @Setter
	private BigDecimal valorTotal;

}
