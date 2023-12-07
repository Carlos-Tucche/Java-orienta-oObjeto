package br.com.treinamento.polimorfismo.model;

public class EditorVideo extends Funcionario {

	@Override
	public Double getBonificacao() {
		return (double)150;
	}
}
