package br.com.treinamento.Revisao.model;

import lombok.Getter;
import lombok.Setter;

public class Biblioteca extends Livros {

	@Getter @Setter
	private String dataReserva;
	
	@Getter @Setter
	private String dataEmprestimo;
	
	@Getter @Setter
	private String dataDevolucao;
	
	
	
}
