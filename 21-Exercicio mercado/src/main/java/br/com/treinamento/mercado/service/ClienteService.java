package br.com.treinamento.mercado.service;

import br.com.treinamento.mercado.main.Principal;
import br.com.treinamento.mercado.model.Cliente;
import lombok.ToString;

@ToString
public class ClienteService {

	/*
	 * Método para validar e cadatrar cliente
	 */
	
	public static void cadastrarCliente() {
		 
		 System.out.print("\n*************************************************\n");
		 System.out.print("             CADASTRO DE CLIENTES                \n");
		 System.out.print("*************************************************\n");
		
		 String resposta = "S";
			 
		 while (resposta.equalsIgnoreCase("S")) {
			
			//Método Verifica CODIGO do Cliente
			Integer codigo = verificaCliente();
				
			System.out.print("Nome: ");
			String nome = Principal.scanner.nextLine();
			System.out.print("E-mail: ");
			String email = Principal.scanner.nextLine();
			Principal.clienteList.add(new Cliente(codigo, nome, email));
			System.out.print("\n");
			System.out.print("Cliente cadastrado com sucesso.\nDeseja adicionar mais clientes? (S/N): ");
			resposta = Principal.scanner.nextLine();
				
			}
		 }
	
	/*
	 * Método para Verificar CODIGO do cliente
	 */

	public static Integer verificaCliente() {
		boolean codigoValido = false;
		Integer codigo = null;
		
		while (!codigoValido) {
			 	
			//metodo valiadar codigo
			codigo = MercadoSevice.validarcodigo("cliente");			
			
			boolean codigoDupilcado = false;
			for(Cliente cliente : Principal.clienteList){
				if(cliente.getCodigo().equals(codigo)) {
					System.out.println("Codigo já possui cadatro! "+codigo);
					codigoDupilcado = true;
					break;
				}
			}
			if(!codigoDupilcado) {
				codigoValido = true;
			}
		}
		return codigo;
	}
	
	/*
	 * Método para listar cliente
	 */
	
	public static void listarClientes() {
		System.out.print("\n****************************************************************\n");
		System.out.print("                     LISTA DE CLIENTES                          \n");
		System.out.print("****************************************************************\n");
		System.out.print("----------------------------------------------------------------\n");
		System.out.printf("%-10s %-25s %-25s \n","CÓDIGO", "NOME", "E-MAIL");
		System.out.print("-----------------------------------------------------------------\n");
		
		
		/*for (Cliente cliente : clienteList) {
		System.out.println(cliente.getNome()+" - "+cliente.getEmail());
		}*/
		
		Principal.clienteList.forEach(c-> {
		System.out.printf("%-10s %-25s %-25s \n",c.getCodigo(),c.getNome(),c.getEmail());
		});

		System.out.print("-----------------------------------------------------------------\n");
		System.out.println("Fim da lista.\nPrecione ENTER para voltar ao MENU.");
		Principal.scanner.nextLine();
		
	}
	
	/*
	 * Método para buscar clientes em criar pedido.
	 */

	public static Cliente getCliente() {
		Cliente clientePedido = null;
		Boolean clienteValido = false;
		
		while (!clienteValido) {
			Integer codigoCliente = MercadoSevice.validarcodigo("cliente");
			
			for (Cliente cliente : Principal.clienteList) {
				if (cliente.getCodigo().equals(codigoCliente)){
					clientePedido = cliente;
					break;
				}
			}
			if (clientePedido!= null) {
				clienteValido = true;
			}else {
				System.out.println("Cliente não encontrado!");
			}
		}
		return clientePedido;
	}

}
