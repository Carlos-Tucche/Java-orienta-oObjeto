package br.com.treinamento;

import br.com.treinamento.calculos.Calculos;

public class Principal {

	public static void main(String[] args) {
		
		Integer soma = Calculos.somarDoisNumeros(5,20);
		System.out.println("A soma de 5 e 20 é: "+soma);
		
		Integer area = Calculos.calcularAreaQuadrado(5, 3);
		System.out.println("\nA area de um quadrado de 5 por 3 é: "+area);
		
		Double circulo = Calculos.calcularCircunferencia(5);
		System.out.println("\nA circunferencia de um circulo de 5 de diamentro é: "+circulo);

	}

}
