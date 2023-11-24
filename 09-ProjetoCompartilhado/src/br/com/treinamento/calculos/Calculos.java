package br.com.treinamento.calculos;

public class Calculos {

	public static Integer somarDoisNumeros(Integer numero1,Integer numero2) {
		return numero1+numero2;
	}
	
	public static Double calcularCircunferencia (Integer diametro) {
		double pi = 3.14159265;
		return pi*diametro;
	}
	
	public static Integer calcularAreaQuadrado (Integer base, Integer altura) {
		return base*altura;
	}
}
