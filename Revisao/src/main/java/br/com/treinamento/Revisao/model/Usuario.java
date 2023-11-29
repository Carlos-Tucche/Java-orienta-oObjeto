package br.com.treinamento.Revisao.model;

import lombok.Getter;
import lombok.Setter;

public class Usuario {

	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String endereço;
	
	@Getter @Setter
	private Integer telefone;

	@Getter @Setter
	private String cpf;
	
	
}
