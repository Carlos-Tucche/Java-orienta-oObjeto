package br.com.treinamento.Revisao.model;

import lombok.Getter;
import lombok.Setter;

public class Livros extends Usuario {

	@Getter @Setter
	private String nomeDoLivro;
	
	@Getter @Setter
	private String autor;
	
	@Getter @Setter
	private String categoria;
	
	
}
