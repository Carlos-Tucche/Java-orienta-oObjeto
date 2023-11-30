package br.com.treinamento.Revisap2.model;

import lombok.Getter;
import lombok.Setter;

public class Livro {
	
	@Getter @Setter
	private String titulo;
	
	@Getter @Setter
	private String autor;
	
	@Getter @Setter
	private String emprestimo;
}
