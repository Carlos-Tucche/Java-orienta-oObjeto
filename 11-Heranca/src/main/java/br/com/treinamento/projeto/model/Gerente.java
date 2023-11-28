package br.com.treinamento.projeto.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Gerente extends Funcionario {
	
	public Gerente(String nome, Integer registro) {
		super(nome, registro);
		System.out.println("Construtor da classe filha (Gerente)");
	}

	@Getter @Setter
	private Double salario;

	@Override
	public String toString() {
		return "Gerente [salario=" + salario + ", getSalario()=" + getSalario() + ", getNome()=" + getNome()
				+ ", getRegistro()=" + getRegistro() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}