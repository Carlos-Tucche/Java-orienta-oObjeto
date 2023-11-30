package br.com.treinamento.Revisap2.model;

import lombok.Getter;
import lombok.Setter;

public class Usuario extends Pessoa {
	
	public Usuario(String nome, Integer idade, Integer telefone, String email) {
		super(nome, idade);
		this.telefone = telefone;
		this.email = email;
	}

	@Getter @Setter
	private Integer telefone;
	
	@Getter @Setter
	private String email;
}
