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
				
				editarCliente();
				break;
			}
			
			case 5  : {
				
				excluirCliente();
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
			System.out.print("Informe a sigla do estado do CLIENTE: ");
			String estado =  App.scanner.nextLine();
			System.out.print("Infomer o email do CLIENTE: ");
			String email = App.scanner.nextLine();
			
			Cliente cliente = new Cliente(nomeCliente, cidade, estado, email);
			
			try {
				salvarCliente(cliente);
				System.out.println("Cliente cadastrado com sucesso! \nDeseja cadastrar outro cliente? S/N \n");
				resposta = App.scanner.nextLine();
				
			} catch (Exception e) {
				System.out.println("Erro ao cadastrar o CLIENTE:"+e.getMessage());
				System.out.print("\nCliente cadastrado com sucesso!\nPressione ENTER para continuar.");
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
		 	System.out.println("\nFim da lista. \nPressione ENTER para voltar ao menu CLIENTE.");
		 	App.scanner.nextLine();
	 	getMenuCliente();
		
	}
	/*Metodo para VISUALIZAR CLIENTE*/
	
	private static void visualizarCliente() throws SQLException {
		
		ClienteDao clienteDao = new ClienteDao();
		
		System.out.print("****************************************************************\n");
		System.out.print("                   DETALHAR CLIENTE                \n");
		System.out.print("****************************************************************\n\n");
		System.out.print("----------------------------------------------------------------\n\n");
		System.out.print("Informe o código do cliente: ");
		Integer codigo = App.scanner.nextInt();
		App.scanner.nextLine();
		
		Optional<Cliente> clienteOptional = clienteDao.buscarPorId(codigo);
		
		if(clienteOptional.isEmpty()) {
			System.out.println("Cliente não encontrado.");
		}else {
			Cliente  cliente = clienteOptional.get();
			System.out.println("Nome do cliente: "+ cliente.getNomeCliente());
			System.out.println("Cidade: "+ cliente.getCidade());
			System.out.println("Estado: "+ cliente.getEstado());
			System.out.println("E-mail: "+ cliente.getEmail());
		}
		System.out.print("\n----------------------------------------------------------------\n");
		System.out.println("\nFim da lista. \nPressione ENTER para voltar ao menu CLIENTE.");
		App.scanner.nextLine();
		getMenuCliente();
		
	}
	/*Metodo para EDITAR CLIENTE*/
	
	private static void editarCliente() throws SQLException {
		
		ClienteDao clienteDao = new ClienteDao();
		
		System.out.print("****************************************************************\n");
		System.out.print("                     EDITAR CLIENTE               \n");
		System.out.print("****************************************************************\n\n");
		System.out.print("----------------------------------------------------------------\n");
		
		String resposta = "S";
		while(resposta .equalsIgnoreCase("S")) {
		
		System.out.println("Informe o CÓDIGO do cliente: ");
		Integer codigo = App.scanner.nextInt();
		App.scanner.nextLine();
		
		Optional<Cliente> clienteOptional= clienteDao.buscarPorId(codigo);
		
		if(clienteOptional.isEmpty()) {
			System.out.println("Cliente não encontrado");
		}else {
			Cliente cliente = clienteOptional.get();
			System.out.print("Deseja realmente EDITAR o cliente: "+cliente.getNomeCliente()+"? (S/N) \n");
			String confirmacao = App.scanner.nextLine();
			
			if(confirmacao.equalsIgnoreCase("N")) {
				System.out.println("Edição cancelada!");
				
			}else {
				System.out.print("Informe o novo NOME do cliente: ");
				String nomeCliente = App.scanner.nextLine();
				cliente.setNomeCliente(nomeCliente);
				System.out.print("Informe a nova CIDADE: ");
				String cidade = App.scanner.nextLine();
				cliente.setCidade(cidade);
				System.out.print("Informe  a sigla do novo ESTADO: ");
				String estado = App.scanner.nextLine();
				cliente.setEstado(estado);
				System.out.print("Informe o novo E-MAIL: ");
				String email = App.scanner.nextLine();
				cliente.setEmail(email);;
				clienteDao.Editar(cliente);
				System.out.print("\nCliente editado com sucesso. \nDeseja EDITAR outro cliente? S/N \n");
				resposta = App.scanner.nextLine();
				}
			}
		}
		getMenuCliente();
		
	}
	/*Metodo para EXCLUIR CLIENTE*/
	
	private static void excluirCliente() throws SQLException {

		ClienteDao clienteDao = new ClienteDao();
		
		System.out.print("****************************************************************\n");
		System.out.print("                     EXCLUIR CLIENTE                \n");
		System.out.print("****************************************************************\n\n");
		System.out.print("----------------------------------------------------------------\n");
		
		System.out.println("Informe o CÓDIGO do cliente: ");
		Integer codigo = App.scanner.nextInt();
		App.scanner.nextLine();
		
		Optional<Cliente> clienteOptional= clienteDao.buscarPorId(codigo);
		
		if(clienteOptional.isEmpty()) {
			System.out.println("Cliente não encontrado");
		}else {
			Cliente cliente = clienteOptional.get();
			System.out.print("Deseja realmente excluir o cliente: "+cliente.getNomeCliente()+"? (S/N) \n");
			String confirmacao = App.scanner.nextLine(); 
			
			if(confirmacao.equalsIgnoreCase("S")) {
				clienteDao.excluir(codigo);
				System.out.println("Produto excluido com sucesso. \nPressione ENTER para voltar ao MENU");
			}else {
				System.out.println("Eclusão cancelada \nPressione ENTER para voltar ao MENU.");
			}
			App.scanner.nextLine();		
		}
	}

	public static Integer getCliente() throws SQLException {
		
		ClienteDao clienteDao = new ClienteDao();
		
		System.out.println("Informe o CÓDIGO do cliente: ");
		Integer codigo = App.scanner.nextInt();
		
		Optional<Cliente> clienteOptional= clienteDao.buscarPorId(codigo);
		
		if(clienteOptional.isEmpty()) {
			System.out.println("Cliente não encontrado");
		}else {
			Cliente cliente = clienteOptional.get();
			System.out.println("Cliente: "+ cliente.getNomeCliente());
		}
		
		return codigo;
	}
		
}


