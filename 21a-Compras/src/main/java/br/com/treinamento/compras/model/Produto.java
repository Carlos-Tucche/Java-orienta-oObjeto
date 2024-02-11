package br.com.treinamento.compras.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class Produto {
	
	public Produto(String nomeProduto, Integer estoque, BigDecimal valor) {
		this.nomeProduto = nomeProduto;
		this.estoque = estoque;
		this.valor = valor;
	}

	@Getter @Setter
	private Integer id;
	
	@Getter @Setter
	private String nomeProduto;
	
	@Getter @Setter
	private Integer estoque;
	
	@Getter @Setter
	private BigDecimal valor;

}
