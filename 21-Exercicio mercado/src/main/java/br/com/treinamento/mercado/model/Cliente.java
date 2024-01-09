package br.com.treinamento.mercado.model;

import lombok.Getter;
import lombok.Setter;

public class Cliente {

	public Cliente(String nome, String email, Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.email = email;
	}
	
	@Getter @Setter
	private Integer codigoCliente;

	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String email;
}
