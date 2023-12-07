package br.com.treinamento.polimorfismo.service;

import br.com.treinamento.polimorfismo.model.Funcionario;
import lombok.Getter;

public class ControleBonificacao {
	
	@Getter
	private Double soma = 0.0;
	
	public void registra (Funcionario funcionario) {
		soma += funcionario.getBonificacao();
	}
	
	/*
	 * this.soma = gerente.getBonificacao();
	 * 
	 * Double boni = gerente.getBonificacao();
		this.soma = this.soma + boni;
	 * */
}
