package br.com.treinamento.polimorfismo.model;

public class Designer extends Funcionario{

	@Override
	public Double getBonificacao() {
		return (double)200;
	}

}
