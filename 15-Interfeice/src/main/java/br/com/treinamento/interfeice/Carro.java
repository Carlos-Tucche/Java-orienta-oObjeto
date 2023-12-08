package br.com.treinamento.interfeice;

public class Carro implements Veiculo {

	@Override
	public void liga() {
		System.out.println("Ligou o carro:");
		
	}

	@Override
	public Integer velocidadeMaxima() {

		return 150;
	}

	@Override
	public void buzina() {
		System.out.println("biii-biii");
	}

}
