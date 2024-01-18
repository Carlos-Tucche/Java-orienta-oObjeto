package br.com.treinamento.mercado.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Produto {
	
	public Produto(Integer codigo, String nomeProduto, BigDecimal preco) {
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}

	@Getter @Setter
	private Integer codigo;

	@Getter @Setter
	private String nomeProduto;

	@Getter @Setter
	private BigDecimal preco;
	
}
