package br.com.treinamento;

public class Conta {

	
	String agencia;
	int numeroConta;
	double saldo;
	Cliente titular;

	
	void transferir(Conta contaDestino, double valor) {
		
		if(saldo<valor) {
			System.out.println("Saldo insuficiente.");
			saldo = saldo -valor;
		}else {
			saldo = saldo - valor;
			contaDestino.saldo = contaDestino.saldo + valor;
		}
		
	}
	
	void sacar(double valor) {
		saldo = saldo-valor;
		
		System.out.println("\nSaque de: "+ valor + " efetuado com sucesso!");
		
	}
	void depositar(double valor) {
		saldo = saldo+valor;
		
		System.out.println("Despósito de: R$ "+ valor+ " efetuado com sucesso!");
	}
}
