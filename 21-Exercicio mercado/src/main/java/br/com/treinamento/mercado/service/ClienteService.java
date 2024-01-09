package br.com.treinamento.mercado.service;

import br.com.treinamento.mercado.main.Principal;
import br.com.treinamento.mercado.model.Cliente;

public class ClienteService {

	public static void cadastrarCliente() {
		System.out.println("Cadastro de Clientes: ");
		System.out.println("-------------------------------");
		
		System.out.print("Nome: ");
		String nome = Principal.scanner.nextLine();
		
		System.out.print("E-mail: ");
		String email = Principal.scanner.nextLine();
		
		Principal.clienteList.add(new Cliente(nome, email, null));
	}

	public static void listarClientes() {
		System.out.println("Listagem de cliente: ");
		System.out.println("-------------------------------");
		System.out.println("Nome \\ E-mail");
		System.out.println("-------------------------------");
		
		/*for (Cliente cliente : clienteList) {
		System.out.println(cliente.getNome()+" - "+cliente.getEmail());
		}*/
		
		Principal.clienteList.forEach(c-> System.out.println(c.getNome()+ " - "+ c.getEmail()));
		
		System.out.println("-------------------------------");
	}

}
