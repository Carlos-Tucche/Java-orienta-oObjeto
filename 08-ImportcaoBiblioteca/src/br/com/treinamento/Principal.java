package br.com.treinamento;

public class Principal {
	
	public static void main(String[] args) {
		
	Carro carro = new Carro();
	carro.setModelo("Ka");
	carro.setMarca("Ford");
	carro.setAnoFrabricacao(2019);
	carro.setMotor("1.0");
	carro.setCombustivel("Flex");
	carro.setCor("Prata");
	
	System.out.println(carro);
	}

}
