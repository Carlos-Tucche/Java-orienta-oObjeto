package br.com.treinamento.Revisao.model;

import lombok.Getter;
import lombok.Setter;

public class Livros extends Usuario {
	
	public Livros(String nomeDoLivro, String autor, String categoria) {
		super();
		this.nomeDoLivro = nomeDoLivro;
		this.autor = autor;
		this.categoria = categoria;
	}

	@Getter @Setter
	private String nomeDoLivro;
	
	@Getter @Setter
	private String autor;
	
	@Getter @Setter
	private String categoria;
	
	
}
