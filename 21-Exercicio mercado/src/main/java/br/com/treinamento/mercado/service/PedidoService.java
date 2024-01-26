package br.com.treinamento.mercado.service;

import br.com.treinamento.mercado.main.Principal;
import br.com.treinamento.mercado.model.Cliente;
import br.com.treinamento.mercado.model.ItemPedido;
import br.com.treinamento.mercado.model.Pedido;
import br.com.treinamento.mercado.model.Produto;

public class PedidoService {
	
	/*
	 * Método para Criar Pedido
	 */
	
	public static void criarPedido() {

		System.out.print("\n*************************************************\n");
		System.out.print("                  CRIAR PEDIDO                   \n");
		System.out.print("*************************************************\n");
		
		Cliente clientePedido = ClienteService.getCliente();
		System.out.println("Cliente: "+ clientePedido.getNome());
		
		Pedido pedido = new Pedido(clientePedido);
		
		String resposta = "S";
		
		while (resposta.equalsIgnoreCase("S")) {
			
			Produto produtoLoop = ProdutoService.getProduto();
			System.out.println("Produto: "+ produtoLoop.getNomeProduto()+ " R$: "+ produtoLoop.getPreco());
			System.out.print("Informe a quantidade: ");
			Integer quantidade = Principal.scanner.nextInt();
			Principal.scanner.nextLine();
			ItemPedido itemLoop = new ItemPedido(produtoLoop, quantidade);
			pedido.adicionarItem(itemLoop);
			System.out.print("\nDeseja adicionar mais itens? (S/N): ");
			resposta = Principal.scanner.nextLine();
			System.out.println("Subtotal R$: "+ pedido.getTotalPedido());
			
		}
		
		Principal.pedidosList.add(pedido);
		
		System.out.println("Pedido criado com sucesso. Obrigado!\nValor total R$: "+ pedido.getTotalPedido());
		System.out.println("\nPressione ENTER para voltar ao MENU.");
		Principal.scanner.nextLine();
	}
	
	/*
	 * Método para listar Pedido
	 */

	public static void listarPedidos() {
		System.out.print("\n****************************************************************\n");
		System.out.print("                      LISTA DE PEDIDOS                          \n");
		System.out.print("****************************************************************\n");
		System.out.print("----------------------------------------------------------------\n");
		System.out.printf("%-10s %-25s %-25s \n","NÚMERO", "NOME", "VALOR TOTAL");
		System.out.print("-----------------------------------------------------------------\n");
		
		/*Principal.pedidosList.forEach(p-> {
		System.out.printf("%-10s %-25s %-25s \n",p.getNumero(),p.getCliente(),p.getTotalPedido();
		});*/
		
		for(Pedido pedido: Principal.pedidosList){
			System.out.printf("%-10s %-25s %-25s \n",pedido.getNumero(),pedido.getCliente().getNome(),pedido.getTotalPedido());
			};

		System.out.print("-----------------------------------------------------------------\n");
		System.out.println("Fim da lista.\nPrecione enter para voltar ao MENU.");
		Principal.scanner.nextLine();
		
	}
	
	/*
	 * Método para Pegar Pedido
	 */

	public static Pedido getPedido() {
		Pedido buscaPedido = null;
		 Boolean pedidovalido = false;
		 
		 while (!pedidovalido) {
			Integer numeroPedido = MercadoSevice.validarcodigo("número:");
			
			for(Pedido pedido :Principal.pedidosList ) {
				if(pedido.getNumero().equals(numeroPedido)) {
					buscaPedido = pedido;
					break;
				}
			}
			if(buscaPedido!=null) {
				pedidovalido = true;
			}else {
				System.out.println("Erro: Pedido não encontrado!");
			}
		}
		return buscaPedido;
	}
	
	/*
	 * Método para Detalhar Pedido
	 */

	public static void detalharPedido() {
		Pedido pedido = getPedido();
		
		System.out.print("\n****************************************************************\n");
		System.out.print("                     DETALHES DO PEDIDO                          \n");
		System.out.print("****************************************************************\n");
		System.out.print("-----------------------------------------\n");
		System.out.println("PEDIDO nº " + pedido.getNumero()+"                             |");
		System.out.print("-----------------------------------------\n");
		System.out.println("CLIENTE: "+ pedido.getCliente().getNome());
		System.out.println("VALOR TOTAL : R$ "+ pedido.getTotalPedido());
		System.out.println("ITENS DO PEDIDO:");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.printf("%-10s %-20s %-20s %-10s %-20s", "NÚMERO", "PRODUTO", "VALOR UNIDADE", "QTD.", "VALOR TOTAL");
		System.out.println("\n--------------------------------------------------------------------------------------------------");
		 
		int i = 1;
		for(ItemPedido item : pedido.getItensPedidos()) {
			System.out.printf("%-10s %-20s %-20s %-10s %-20s\n", i, item.getProduto().getNomeProduto(), item.getValorUnitario(), item.getQuantidade(), item.getValorTotal());
			i++;
		 }
		 
		 System.out.println("--------------------------------------------------------------------------------------------------");
		 System.out.println("Fim do Pedido.\nPressione Enter para voltar ao MENU.");
		 Principal.scanner.nextLine();
	}

}
