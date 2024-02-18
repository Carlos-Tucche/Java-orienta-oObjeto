package br.com.treinamento.compras.service;

import br.com.treinamento.compras.app.App;

public class ClienteService {

	public static void getMenuCliente() {
		System.out.print("\n*************************************************\n");
		System.out.println("         CLIENTE, SELECIONE OPÇÃO DESEJADA:");
		System.out.print("*************************************************\n");
		System.out.print("___________________________________________________\n");
		System.out.print("|                                                 |");
		System.out.println("\n|               1 - Cadastrar Produto             |");
		System.out.println("|               2 - Listar Produtos               |");
		System.out.println("|               3 - Visualizar Produto            |");
		System.out.println("|               4 - Editar produto                |");
		System.out.println("|               5 - Deletar produto               |");
		System.out.println("|               6 - Menu Principal                |");
		System.out.println("|               0 - Sair do sistema               |");
		System.out.print("|_________________________________________________|");
			
		while (true) {
			
			System.out.print("\n\nDigite sua Opção: ");
			Integer opcao = App.scanner.nextInt();
			App.scanner.nextLine();
			
			switch (opcao) {
			
			case 0: {
				
				SistemaService.metodoSair();
				
				break;
				}
			
			case 1: {
				
				cadastrarCliente();
				
				break;
			}
			case 2: {
				
				listarCliente();
				
				break;
			}
			case 3: {
				
				visualizarCliente();
				break;
			}
			
			case 4  : {
				
				EditarCliente();
				break;
			}
			
			case 5  : {
				
				ExcluirCliente();
				break;
			}
			
			case 6: {
				
				SistemaService.getMenu();
				
				break;
			}
			
			default:
				System.out.println("Opção invalidade.\nDigite um número válido.");
			}
		}
	}
	/*Metodo para CADASTRAR CLIENTE*/
	private static void cadastrarCliente() {
		// TODO Auto-generated method stub
		
	}
	/*Metodo para LISTAR CLIENTE*/
	private static void listarCliente() {
		// TODO Auto-generated method stub
		
	}
	/*Metodo para VISUALIZAR CLIENTE*/
	private static void visualizarCliente() {
		// TODO Auto-generated method stub
		
	}
	/*Metodo para EDITAR CLIENTE*/
	private static void EditarCliente() {
		// TODO Auto-generated method stub
		
	}
	/*Metodo para EXCLUIR CLIENTE*/
	private static void ExcluirCliente() {
		// TODO Auto-generated method stub
		
	}
		
}


