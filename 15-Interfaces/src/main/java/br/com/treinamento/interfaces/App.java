package br.com.treinamento.interfaces;

public class App {
	
	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("Marcelo");
		gerente.setDiasTrabalhados(22);
		gerente.setSalario(1500.00);
		
		System.out.println("O valor do salario é: "+ gerente.calculaHoras());
	}
}
