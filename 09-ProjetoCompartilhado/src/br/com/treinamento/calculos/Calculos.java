package br.com.treinamento.calculos;

/**
 * Esta classe é responsavel por fornecer diversas formulas de 
 * claculos que podem ser utilizada em variosprojetos.
 * A classe não possui atributos e os métodos são todos estáticos.
 */

public class Calculos {

	/**
	 * Calcula a soma de dois número.
	 * @param numero1 recebe o primeiro número a ser calculado.
	 * @param numero2 recebe o segundo número a ser calculado.
	 * @return retorna o valor da soma dos número.
	 */
	public static Integer somarDoisNumeros(Integer numero1,Integer numero2) {
		return numero1+numero2;
	}
	/**
	 * Calcula o perimetro da circunferência.
	 * @param diametro recebe o valor do diametro
	 * @return retorna o perimetro.
	 */
	public static Double calcularCircunferencia (Integer diametro) {
		double pi = 3.14159265;
		return pi*diametro;
	}
	/**
	 * Calcula a area de um quadrado.
	 * @param base recebe o valor da base 
	 * @param altura recebe o valor da altura
	 * @return retorna o valor da area 
	 */
	public static Integer calcularAreaQuadrado (Integer base, Integer altura) {
		return base*altura;
	}
}
