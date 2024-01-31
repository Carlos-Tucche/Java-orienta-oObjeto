package br.com.treinamento.compras.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class Pedido {
	
	@Getter @Setter
	private Integer id;
	
	@Getter @Setter
	private Integer clienteId;
	
	@Getter @Setter
	private String dataPedido;
	
	@Getter @Setter
	private Boolean status;
	
	@Getter @Setter
	private BigDecimal totalPedido;

}
