package br.com.treinamento.polimorfismo.model;

import lombok.Getter;
import lombok.Setter;

public class Gerente extends Funcionario {

	@Getter @Setter
	private Integer senha;
	
	@Override
	public Double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	public Boolean autentica (Integer senha) {
		return(this.senha==senha);
	}
}
