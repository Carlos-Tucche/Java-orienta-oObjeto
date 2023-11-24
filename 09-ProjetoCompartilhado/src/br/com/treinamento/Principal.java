package br.com.treinamento;

import br.com.treinamento.calculos.Calculos;
import br.com.treinamento.utilitarios.AuxiliarString;

public class Principal {

	public static void main(String[] args) {
		
		Double circunferencia = Calculos.calcularCircunferencia(5);
		System.out.println("A circunferencia é: "+ circunferencia );
		
		Integer soma = Calculos.somarDoisNumeros(7,3);
		System.out.println("A soma de 7 e 3  é: "+soma);
		
		Integer area = Calculos.calcularAreaQuadrado(5, 3);
		System.out.println("A area de um quadrado de A= 5 e L= 3 é: "+area);

		String ponto = AuxiliarString.removePontuacao("217.555.482");
		System.out.println("Número sem pontuação; "+ponto);
	}

}
