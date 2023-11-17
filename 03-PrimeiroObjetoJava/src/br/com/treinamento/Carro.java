package br.com.treinamento;

public class Carro {

	String marcar;
	String cor;
	String modelo;
	int ano;
	
	void ligar() {
		
		System.out.println("O carro ligou.");
	}
	
	void desligar() {
		System.out.println("O carro desligou.");
	}
	void buzinar (String buzina) {
		System.out.println("Som da buzina"+ buzina);
	}
	void mostrarIdade() {
		System.out.println("O carro tem: " + (2023-ano)+" anos");
	}
}
