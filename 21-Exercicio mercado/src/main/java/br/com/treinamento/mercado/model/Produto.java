package br.com.treinamento.mercado.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class Produto {
	
	public Produto(String nomeProduto, BigDecimal preco, Integer codigoProduto) {
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
