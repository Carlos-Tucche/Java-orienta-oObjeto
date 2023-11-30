package br.com.treinamento.projeto.model;

import lombok.Getter;
import lombok.Setter;

public class Funcionario {

	public Funcionario(String nome, Integer registro) {
		super();
		this.nome = nome;
		this.registro = registro;
	}
	
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private Integer registro;
	
	

}
