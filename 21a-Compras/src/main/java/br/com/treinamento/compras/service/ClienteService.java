package br.com.treinamento.compras.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import br.com.treinamento.compras.Dao.ClienteDao;
import br.com.treinamento.compras.app.App;
import br.com.treinamento.compras.model.Cliente;

public class ClienteService {

	public static void getMenuCliente() throws SQLException {
		 
		System.out.print("\n*************************************************\n");
		System.out.println("         CLIENTE, SELECIONE OPÇÃO DESEJADA:");
		System.out.print("*************************************************\n");
		System.out.print("___________________________________________________\n");
		System.out.print("|                                                 |");
		System.out.println("\n|               1 - Cadastrar Cliente             |");
		System.out.println("|               2 - Listar Clientes               |");
		System.out.println("|               3 - Visualizar Cliente            |");
		System.out.println("|               4 - Editar Cliente                |");
		System.out.println("|               5 - Deletar Cliente               |");
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
	
	private static void cadastrarCliente() throws SQLException {
		System.out.print("\n\n*************************************************\n");
		System.out.print("             CADASTRO DE CLIENTES                \n");
		System.out.print("*************************************************\n\n");
		
		String resposta = "S";
		while(resposta .equalsIgnoreCase("S")) {
		
			System.out.println("-------------------------------------------------");
			System.out.print("Informe o nome do CLIENTE: ");
			String nomeCliente = App.scanner.nextLine();
			System.out.print("Informe a cidade do CLIENTE: ");
			String cidade = App.scanner.nextLine();
			System.out.print("Informe o estado do CLIENTE: ");
			String estado =  App.scanner.nextLine();
			System.out.print("Infomer o email do CLIENTE: ");
			String email = App.scanner.nextLine();
			
			Cliente cliente = new Cliente(nomeCliente, cidade, estado, email);
			
			try {
				salvarCliente(cliente);
				System.out.println("Cliente cadastrado com sucesso! \nDeseja cadastrar outro cliente? S/N");
				resposta = App.scanner.nextLine();
				
			} catch (Exception e) {
				System.out.println("Erro ao cadastrar o CLIENTE:"+e.getMessage());
				System.out.print("\nProduto cadastrado com sucesso!\nPressione ENTER para continuar.");
			}
			getMenuCliente();
		}
	}
	/*Metodo para SALVAR CLIENTE*/
	
	private static void salvarCliente(Cliente cliente) throws SQLException {
		
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.salvarCliente(cliente);
		
	}
	/*Metodo para LISTAR CLIENTE*/
	
	private static void listarCliente() throws SQLException {
		ClienteDao clienteDao = new ClienteDao();
		List<Cliente> clientes = clienteDao.listarCliente();
		
		System.out.print("\n****************************************************************\n");
		System.out.print("                LISTA DE PRODUTO                \n");
		System.out.print("****************************************************************\n\n");
		System.out.print("----------------------------------------------------------------\n");
		System.out.printf("\n%-5s %-20s %-10s %-5s %-20s\n","CÓDIGO", "NOME CLIENTE","CIDADE","ESTADO","E-MAIL");
		System.out.print("-----------------------------------------------------------------\n");
		
	 	for(Cliente cliente : clientes) {
	 		System.out.printf("%-5s %-20s %-10s %-5s %-20s\n", cliente.getIdCliente(), cliente.getNomeCliente(), cliente.getCidade(), cliente.getEstado(), cliente.getEmail());
		 	}
		 	System.out.println("\nFim da lista. \nPressione ENTER para voltar ao menu PRODUTO.");
		 	App.scanner.nextLine();
	 	getMenuCliente();
		
	}
	/*Metodo para VISUALIZAR CLIENTE*/
	private static void visualizarCliente() {
		// TODO Auto-generated method stub
		
	}
	/*Metodo para EDITAR CLIENTE*/
	
	private static void EditarCliente() throws SQLException {
		ClienteDao clienteDao = new ClienteDao();
		
		System.out.print("****************************************************************\n");
		System.out.print("                   DETALHAR CLIENTE                \n");
		System.out.print("****************************************************************\n\n");
		System.out.print("----------------------------------------------------------------\n");
		System.out.println("Informe o código do cliente : ");
		Integer codigo = App.scanner.nextInt();
		App.scanner.nextLine();
		
		Optional<Cliente> clienteOptional = clienteDao.buscarPorId(codigo);
		
		if(clienteOptional.isEmpty()) {
			System.out.println("Produto não encontrado.");
		}else {
			Cliente  cliente = clienteOptional.get();
			System.out.println("Nome do cliente: "+ cliente.getNomeCliente());
			System.out.println("Cidade: "+ cliente.getCidade());
			System.out.println("Estado: "+ cliente.getEstado());
			System.out.println("E-mail: "+ cliente.getEmail());
		}
		
		System.out.println("Fim da lista. \nPressione ENTER para voltar ao MENU.");
		App.scanner.nextLine();
		getMenuCliente();
		
	}
	/*Metodo para EXCLUIR CLIENTE*/
	private static void ExcluirCliente() {
		// TODO Auto-generated method stub
		
	}
		
}


