package br.com.treinamento.abstrato;

import lombok.Getter;
import lombok.Setter;

public abstract class Funcionario {
	
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private Double salario;

	abstract Double calculaHoras();
	
	public Double getBonificacao() {
		return this.salario*(0.10);
	}
}
