package br.com.treinamento.interfeice;

public class App {
	
	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.buzina();
		carro.liga();
		System.out.println(carro.velocidadeMaxima());
	}
}
