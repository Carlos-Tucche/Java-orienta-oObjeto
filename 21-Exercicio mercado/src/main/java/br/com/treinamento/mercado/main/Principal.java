package br.com.treinamento.mercado.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.treinamento.mercado.model.Cliente;
import br.com.treinamento.mercado.model.ItemPedido;
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

				PedidoService.listarPedidos();	
				
				break;
			}
			
			case 7: {
				//detalhar pedido
						
				Pedido pedido = PedidoService.getPedido();
				 
				/* System.out.println("Pedido nº " + pedido.getNumero());
			        System.out.println("--------------------------------------------");       

			        System.out.println("Cliente: " + pedido.getCliente().getNome());
			        System.out.println("Valor Total: R$" + pedido.getTotalPedido());
			        System.out.println("Itens do Pedido: ");
			        System.out.println("--------------------------------------------------------------------------------------------------");
			        System.out.printf("%-10s %-30s %-20s %-20s %-20s", "Código", "Produto", "Valor Unit", "Qtd", "Valor Total");
			        System.out.println("\n--------------------------------------------------------------------------------------------------");
			        
			        int i = 1;
			        for(ItemPedido item : pedido.getItensPedido()){
			            System.out.printf("%-10d %-30s %-20s %-20s %-20s\n", i, item.getProduto().getNome(), item.getValorUnitario(), item.getQuantidade(), item.getValorTotal());
			            i++;
			        }        

			        System.out.println("--------------------------------------------------------------------------------------------------");
			        System.out.println("Fim do pedido.\nPressione Enter para retornar...");
			        SistemaCompras.scanner.nextLine();

			    }*/

				 System.out.println("PEDIDO nº " + pedido.getNumero());
			     System.out.println("--------------------------------------------");  
			     
			     System.out.println("CLIENTE: "+ pedido.getCliente().getNome());
			     System.out.println("VALOR TOTAL : R$ "+ pedido.getTotalPedido());
			     System.out.println("ITENS DO PEDIDO: ");
			     System.out.println("--------------------------------------------------------------------------------------------------");
			     System.out.printf("%-10s %-30s %-20s %-20s %-20s", "NÚMERO PEDIDO", "PRODUTO", "VALOR UNIDADE", "QTD.", "VALOR TOTAL");
			     System.out.println("--------------------------------------------------------------------------------------------------");
			     
			     int i = 1;
			     for(ItemPedido item : pedido.getItensPedidos()) {
			    	 System.out.printf("%-10s %-30s %-20s %-20s %-20s", i, item.getProduto().getNomeProduto(), item.getValorUnitario(), item.getQuantidade(), item.getValorTotal());
			    	 i++;
			     }
			     
			     System.out.println("--------------------------------------------------------------------------------------------------");
			        System.out.println("Fim do Pedido.\nPressione Enter para retornar...");
			        Principal.scanner.nextLine();
			     
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
