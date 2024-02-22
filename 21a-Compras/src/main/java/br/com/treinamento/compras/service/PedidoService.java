package br.com.treinamento.compras.service;

import java.sql.SQLException;
import java.util.List;

import br.com.treinamento.compras.Dao.PedidoDao;
import br.com.treinamento.compras.app.App;
import br.com.treinamento.compras.model.Cliente;
import br.com.treinamento.compras.model.ItemPedido;
import br.com.treinamento.compras.model.Pedido;
import br.com.treinamento.compras.model.Produto;

public class PedidoService {

	public static void getMenuPedido() throws SQLException {
		
		System.out.print("\n*************************************************\n");
		System.out.println("         PEDIDO, SELECIONE OPÇÃO DESEJADA:");
		System.out.print("*************************************************\n");
		System.out.print("___________________________________________________\n");
		System.out.print("|                                                 |");
		System.out.println("\n|               1 - Novo Pedido                 |");
		System.out.println("|               2 - Listar Pedido                |");
		System.out.println("|               3 - Visualizar Pedido            |");
		System.out.println("|               4 - Editar Pedido                |");
		System.out.println("|               5 - Deletar Pedido               |");
		System.out.println("|               6 - Menu Principal               |");
		System.out.println("|               0 - Sair do sistema              |");
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
				
				NovoPedido();
				
				break;
			}
			case 2: {
				
				listarPedido();
				
				break;
			}
			case 3: {
				
				visualizarPedido();
				
				break;
			}
			case 4: {
				
				editarPedido();
				
				break;
			}
			case 5: {
				
				excluirPedido();
				
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
	/*Metodo para NOVO PEDIDO*/

	private static void NovoPedido() throws SQLException {
		
		System.out.print("\n\n*************************************************\n");
		System.out.print("                    NOVO PEDIDO                \n");
		System.out.print("*************************************************\n\n");
		System.out.println("-------------------------------------------------");
		
		Cliente clientePedido = ClienteService.getCliente();
		
		Pedido pedido = new Pedido(clientePedido);
		
		String resposta = "S";
		while(resposta .equalsIgnoreCase("S")) {
		
			Produto produto = ProdutoService.getProduto();
			System.out.println("Produto: "+produto.getNomeProduto()+" R$: "+ produto.getValor());
			System.out.print("Informe a quantidade: ");	
			Integer quantidade = App.scanner.nextInt();
			App.scanner.nextLine();
			ItemPedido item = new ItemPedido(produto, quantidade);
			pedido.adcionarItem(item);
			System.out.print("\nDeseja adicionar mais itens? S/N: ");
			resposta = App.scanner.nextLine();
			System.out.println("Subtotal R$: "+ pedido.getTotalPedido());
			
		}
		
		PedidoDao pedidoDao = new PedidoDao();
		pedidoDao.salvarPedido(pedido);
		
		System.out.println("Pedido criado com sucesso. Obrigado!\nValor total R$: "+ pedido.getTotalPedido());
		System.out.println("\nPressione ENTER para voltar ao MENU.");
		App.scanner.nextLine();
	}
	
	/*Metodo para LISTAR PEDIDO*/
	
	private static void listarPedido() throws SQLException {
		PedidoDao pedidoDao = new PedidoDao();
		List<Pedido> pedidos = pedidoDao.listarPedidos();
		
		System.out.print("\n****************************************************************\n");
		System.out.print("                 LISTAR PEDIDOS               \n");
		System.out.print("****************************************************************\n\n");
		System.out.print("----------------------------------------------------------------\n");
		System.out.printf("\n%-5s %-20s %-10s \n","CÓDIGO", "CLIENTE","TOTAL PEDIDO");
		System.out.print("-----------------------------------------------------------------\n");
		
		for(Pedido pedido : pedidos) {
	 		System.out.printf("%-5s %-20s %-10s \n", pedido.getIdPedido(), pedido.getClientePedido(), pedido.getTotalPedido());
		 	}
		 	System.out.println("\nFim da lista. \nPressione ENTER para voltar ao menu CLIENTE.");
		 	App.scanner.nextLine();
		
		
	}
	/*Metodo para VISUALIZAR PEDIDO*/

	private static void visualizarPedido() {
		// TODO Auto-generated method stub
		
	}
	/*Metodo para EDITAR PEDIDO*/

	private static void editarPedido() {
		// TODO Auto-generated method stub
		
	}
	/*Metodo para EXCLUIR PEDIDO*/

	private static void excluirPedido() {
		// TODO Auto-generated method stub
		
	}

}
