package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Carlos");
		cliente1.setCpf ("123456789");
		
		Conta conta1 = new Conta();
		conta1.setAgencia("778-9");
		conta1.setNumeroConta (456789);
		conta1.setSaldo (100.00);
		conta1.setTitular (cliente1);

		Cliente cliente2 = new Cliente();
		cliente2.setNome ("José");
		cliente2.setCpf("987654");
		
		Conta conta2 = new Conta();
		conta2.setAgencia ("0058-9");
		conta2.setNumeroConta (1345679);
		conta2.setSaldo (100.00);
		conta2.setTitular (cliente2);
		
		
		System.out.println("Valor da conta1 antes do depósito: R$" + conta1.getSaldo()+ "\n");
		conta1.depositar(30.00);
		
		System.out.println("Saldo atual: R$"+ conta1.getSaldo()+"\n");
		
		conta1.sacar(20.00);
		
		System.out.println("Saldo atual: R$"+ conta1.getSaldo());
		conta1.transferir(conta2,27.00);
		System.out.println("\n Saldo atual conta1:"+ conta1.getSaldo());
		System.out.println("\n Saldo atual conta2:"+ conta2.getSaldo());
		
		System.out.println("\nNome do cliente conta1: "+ conta1.getTitular().getNome());
	}

}
