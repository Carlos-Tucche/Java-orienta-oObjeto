package br.com.treinamento;

import java.math.BigDecimal;

public class Principal {

	public static void main(String[] args) {

		
		BigDecimal big1 = new BigDecimal("50.1");
		BigDecimal big2 = new BigDecimal("2");
		
		System.out.println("Adição / soma.");
		System.out.println(big1.add(big1).add(big1));
		
		System.out.println("Subtrair");
		System.out.println(big1.subtract(big2));
		
		System.out.println("Compara");
		System.out.println(big1.compareTo(big2));
		
		System.out.println("Divisão");
		System.out.println(big1.divide(big2));
		
		System.out.println("Maximo");
		System.out.println(big1.max(big2));
		
		System.out.println("Minimo");
		System.out.println(big1.min(big2));
		
		System.out.println("Potencia");
		System.out.println(big1.pow(4));
		
		System.out.println("Multiplicação");
		System.out.println(big1.multiply(big2));
		
		//*System.out.println(big1.multiply(new BigDecimal("3")));
	}

}
