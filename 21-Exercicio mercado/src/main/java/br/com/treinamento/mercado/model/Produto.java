package br.com.treinamento.mercado.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class Produto {
	
	public Produto(Integer codigoProduto, String nomeProduto, BigDecimal preco) {
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}

	@Getter @Setter
	private Integer codigoProduto;

	@Getter @Setter
	private String nomeProduto;

	@Getter @Setter
	private BigDecimal preco;
	
}
