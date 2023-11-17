package br.com.treinamento;

public class PrincipalCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.ano = 1989;
		carro1.cor = "Marro";
		carro1.marcar = "Volkswagn";
		carro1.modelo = "Voyage";
		
		System.out.println("modelo ddo carro: " +carro1.modelo);
		carro1.ligar();
		carro1.mostrarIdade();
		carro1.buzinar(" Foon foon");
		carro1.desligar();
		

	}

}
