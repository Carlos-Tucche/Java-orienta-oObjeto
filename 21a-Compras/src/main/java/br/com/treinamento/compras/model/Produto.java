package br.com.treinamento.compras.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class Produto {
	
	public Produto() {
	}
	
	public Produto(String nomeProduto, BigDecimal valor, Integer estoque) {
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.estoque = estoque;
	}

	@Getter @Setter
	private Integer id;
	
	@Getter @Setter
	private String nomeProduto;
	
	@Getter @Setter
	private BigDecimal valor;
	
	@Getter @Setter
	private Integer estoque;
}
