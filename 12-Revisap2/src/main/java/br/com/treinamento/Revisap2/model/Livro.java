package br.com.treinamento.Revisap2.model;

import lombok.Getter;
import lombok.Setter;

public class Livro {
	
	public Livro(String titulo, String autor,Boolean emprestimo) {
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
	private Boolean emprestimo;
	
	@Getter 
	private Boolean emprestado;

	@Getter
	private Boolean devolvido;
	
	public void empretar() {
		this.emprestado = true;
	}
	public void devolver() {
		this.devolvido = false;
	}
}
