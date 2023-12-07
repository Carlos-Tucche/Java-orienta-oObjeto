package br.com.treinamento.Revisap2.model;

import lombok.Getter;
import lombok.Setter;

public class Pessoa {
	
	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private Integer idade;
	
}
