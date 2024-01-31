package br.com.treinamento.compras.model;

import lombok.Getter;
import lombok.Setter;

public class Cliente {

	public Cliente(Integer id, String nome, String cidade, String estado, String email) {
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
		this.email = email;
	}
	
	@Getter @Setter
	private Integer id;
	
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String cidade;
	
	@Getter @Setter
	private String estado;
	
	@Getter @Setter
	private String email;
	
	
}
