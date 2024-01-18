package br.com.treinamento.mercado.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.treinamento.mercado.model.Cliente;
import br.com.treinamento.mercado.model.Pedido;
import br.com.treinamento.mercado.model.Produto;
import br.com.treinamento.mercado.service.ClienteService;
import br.com.treinamento.mercado.service.MercadoSevice;
import br.com.treinamento.mercado.service.PedidoService;
import br.com.treinamento.mercado.service.ProdutoService;

public class Principal {
	
	public class produtoList {

	}

	public static Scanner scanner = new Scanner(System.in);
	public static List<Cliente> clienteList = new ArrayList<Cliente>();
	public static List<Produto> produtoList = new ArrayList<Produto>();
	public static List<Pedido> pedidosList = new ArrayList<Pedido>();

	public static void main(String[] args) {
	
		while(true) {
			
	 		MercadoSevice.montarMenu();
			
			System.out.print("Opção: ");
			Integer opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			
			case 1: {
				
				ClienteService.cadastrarCliente();
				MercadoSevice.limparTela();
				
				break;
			}
			
			case 2: {
				
				ClienteService.listarClientes();
				
				break;
			}
			
			case 3: {
				ProdutoService.cadastrarProduto();
				
				break;
			}
			
			case 4: {
				ProdutoService.listarProduto();
				
				break;				
			}
			
			case 5: {
				
				PedidoService.criarPedido();
				
				break;
			}
			
			case 6: {
				
				System.out.println("Listagem de Pedido: ");
				System.out.println("\n\n-------------------------------------------------------------");
				System.out.println("Codigo Pedido \t Nome Cliente \t\t Total Pedido");
				System.out.println("                -------------------------------");
				
				System.out.printf("%-10s %-25s %-25s \n","Codigo Pedido", "Nome Cliente", "Total Pedido");
				
				
				//PrintStream.printf("%-10s %-25s %-25s \n",Pedido.getNumero(),Pedido.getCliente(),Pedido.getTotalPedido()):
				System.out.printf("%-10s %-25s %-25s \n",Pedido.getNumero(),Pedido.getCliente(),Pedido.getTotalPedido());
				
				
				System.out.println("Fim da lista.\nPrecione enter para continuar.");
				Principal.scanner.nextLine();
				System.out.println("-------------------------------");
				
				MercadoSevice.limparTela();
			
				break;
				}
			
			
			case 7: {
				//detalhar pedido
				
				
				
				break;
			}
			
			case 0: {
				
				MercadoSevice.sair();
			}
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
			
		}

	}

}
