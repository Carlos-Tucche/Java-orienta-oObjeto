package br.com.treinamento.Revisao.model;

import lombok.Getter;
import lombok.Setter;

public class Usuario {

	public Usuario(String nome, Integer idade, String endereco, Integer telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public Usuario() {
			}

	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private Integer idade;
	
	@Getter @Setter
	private String endereco;
	
	@Getter @Setter
	private Integer telefone;

	
	
}
