package br.com.treinamento.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString 
public class Produto {
	
	public Produto(String nome, BigDecimal precao) {
		this.nome = nome;
		this.preco = precao;
	}

	@Getter 
	private Integer id;
	
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private BigDecimal preco;
	
	

}
