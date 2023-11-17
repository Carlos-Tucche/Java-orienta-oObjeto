package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Carlos";
		cliente1.cpf = "123456789";
		
		Conta conta1 = new Conta();
		conta1.agencia = "778-9";
		conta1.numeroConta = 456789;
		conta1.saldo = 100.00;
		conta1.titular = cliente1;

		Cliente cliente2 = new Cliente();
		cliente2.nome = "José";
		cliente2.cpf = "987654";
		
		Conta conta2 = new Conta();
		conta2.agencia = "0058-9";
		conta2.numeroConta = 1345679;
		conta2.saldo = 100.00;
		conta2.titular = cliente2;
		
		
		System.out.println("Valor da conta1 antes do depósito: R$" + conta1.saldo+ "\n");
		conta1.depositar(30.00);
		
		System.out.println("Saldo atual: R$"+ conta1.saldo+"\n");
		
		conta1.sacar(20.00);
		
		System.out.println("Saldo atual: R$"+ conta1.saldo);
		conta1.transferir(conta2,27.00);
		System.out.println("\n Saldo atual conta1:"+ conta1.saldo);
		System.out.println("\n Saldo atual conta2:"+ conta2.saldo);
		
		System.out.println("\nNome do cliente conta1: "+ conta1.titular.nome);
	}

}
