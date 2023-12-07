package br.com.treinamento.polimorfismo.model;

import lombok.Getter;
import lombok.Setter;

public class Funcionario {

	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private Double salario;
	
	public Double getBonificacao() {
		return this.salario*0.1;
	}
}
