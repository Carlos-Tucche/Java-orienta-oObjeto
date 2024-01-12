package br.com.treinamento.mercado.service;

import br.com.treinamento.mercado.main.Principal;
import br.com.treinamento.mercado.model.Cliente;

public class ClienteService {

	public static void cadastrarCliente() {

		System.out.println("Cadastro de Clientes: ");
		System.out.println("-------------------------------\n") ;
		
		boolean codigoValido = false;
		Integer codigoCliente = null;
		
		while (!codigoValido) {

			// O codigo é valido? É um número?
			while (codigoCliente == null) {
				try {
					System.out.print("Digite o Codigo do cliente: ");
					codigoCliente = Principal.scanner.nextInt();
					Principal.scanner.nextLine();
					
				} catch (Exception e) {
					System.out.println("Codigo invalido! Digite um número inteiro.");
					Principal.scanner.nextLine();
				}
			
		}
		 
		boolean codigoDupilcado = false;
		for(Cliente cliente : Principal.clienteList){
			if(cliente.getCodigoCliente().equals(codigoCliente)) {
				System.out.println("Codigo já possui cadatro!");
				codigoDupilcado = true;
			}
		}
			if(!codigoDupilcado) {
				codigoValido = true;
			}
			
		}
		System.out.print("Nome: ");
		String nome = Principal.scanner.nextLine();
		
		System.out.print("E-mail: ");
		String email = Principal.scanner.nextLine();
	
		Principal.clienteList.add(new Cliente(codigoCliente, nome, email));	
		
		System.out.println("Cliente cadastrado com sucesso.\n Pressiione ENTER para continua.");
		Principal.scanner.nextLine();
		}
	

	public static void listarClientes() {
		System.out.println("Listagem de cliente: ");
		System.out.println("\n\n-------------------------------");
		System.out.println("Codigo \t Nome \t E-mail");
		System.out.println("-------------------------------");
		
		System.out.printf("%-10s %-25s %-25s \n","Codigo", "Nome", "E-mail");
		
		/*for (Cliente cliente : clienteList) {
		System.out.println(cliente.getNome()+" - "+cliente.getEmail());
		}*/
		
		Principal.clienteList.forEach(c-> {
		System.out.printf("%-10s %-25s %-25s \n",c.getCodigoCliente(),c.getNome(),c.getEmail());
		});
		
		System.out.println("-------------------------------");
	}

}
