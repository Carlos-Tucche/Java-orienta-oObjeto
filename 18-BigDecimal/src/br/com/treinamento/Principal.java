package br.com.treinamento;

import java.math.BigDecimal;

public class Principal {

	public static void main(String[] args) {

		
		BigDecimal big1 = new BigDecimal("0.3");
		
		System.out.println(big1.add(big1).add(big1));
		
		System.out.println(big1.multiply(new BigDecimal("3")));
	}

}
