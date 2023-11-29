package br.com.treinamento.Revisao.model;

import lombok.Getter;
import lombok.Setter;

public class Biblioteca extends Livros {

	public Biblioteca(String nomeDoLivro, String autor, String categoria) {
		super(nomeDoLivro, autor, categoria);
	}

	@Getter @Setter
	private String dataReserva;
	
	@Getter @Setter
	private String dataEmprestimo;
	
	@Getter @Setter
	private String dataDevolucao;
	
	
	
}
