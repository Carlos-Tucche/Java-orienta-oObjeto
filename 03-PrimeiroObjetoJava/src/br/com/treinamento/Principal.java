package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa carlos = new Pessoa();
		carlos.nome = "Carlos Alexandre Dias";
		carlos.idade = 39;
		carlos.altura = 1.62;
		carlos.peso = 70.00;
		
		Pessoa pessoa2 = new Pessoa();
		System.out.println(pessoa2.nome);
		
		pessoa2.nome = "Moises Molina";
		
		System.out.println(carlos.nome);
		System.out.println(pessoa2.nome);
	

	}

}
