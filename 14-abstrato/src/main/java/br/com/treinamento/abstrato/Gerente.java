package br.com.treinamento.abstrato;

import lombok.Getter;
import lombok.Setter;

public class Gerente extends Funcionario {

	@Getter @Setter
	private Integer diasTrabalhados;
	
	@Override
	Double calculaHoras() {
		
		Double salarioPorDia = this.getSalario()/this.diasTrabalhados;
		
		Double salarioPorHora = salarioPorDia/8;
		
		return salarioPorHora;
	}
	
	

}
