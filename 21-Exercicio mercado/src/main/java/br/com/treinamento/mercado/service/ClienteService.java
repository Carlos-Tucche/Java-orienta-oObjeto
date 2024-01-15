package br.com.treinamento.mercado.service;

import br.com.treinamento.mercado.main.Principal;
import br.com.treinamento.mercado.model.Cliente;

public class ClienteService {

	/*
	 * Método para validar e cadatrar clientes
	 * */
	
	public static void cadastrarCliente() {
		System.out.println("Cadastro de Clientes: ");
		System.out.println("-------------------------------\n");
		
		//metodo valiadar codigo
		Integer codigo = MercadoSevice.validarcodigo();
		
		boolean codigoValido = false;
		
		while (!codigoValido) {
			boolean codigoDupilcado = false;
			for(Cliente cliente : Principal.clienteList){					if(cliente.getCodigo().equals(codigo)) {
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
	
		Principal.clienteList.add(new Cliente(codigo, nome, email));	
		
		System.out.println("Cliente cadastrado com sucesso.\n Pressiione ENTER para continua.");
		Principal.scanner.nextLine();
		}
	
	/*
	 * Método para listar clientes
	 * */
	
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
		System.out.printf("%-10s %-25s %-25s \n",c.getCodigo(),c.getNome(),c.getEmail());
		});
		
		System.out.println("Fim da lista.\nPrecione enter para continuar.");
		Principal.scanner.nextLine();
		System.out.println("-------------------------------");
	}
}
