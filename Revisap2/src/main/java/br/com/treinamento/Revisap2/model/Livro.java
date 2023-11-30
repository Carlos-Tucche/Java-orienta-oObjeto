package br.com.treinamento.Revisap2.model;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

public class Livro {
	
	public Livro(String titulo, String autor,String emprestimo) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.emprestimo = emprestimo;
	}

	@Getter @Setter
	private String titulo;
	
	@Getter @Setter
	private String autor;
	
	@Getter @Setter
	private String emprestimo;

}
