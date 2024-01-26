package br.com.treinamento.mercado.service;

import br.com.treinamento.mercado.main.Principal;
import br.com.treinamento.mercado.model.Cliente;
import br.com.treinamento.mercado.model.ItemPedido;
import br.com.treinamento.mercado.model.Pedido;
import br.com.treinamento.mercado.model.Produto;

public class PedidoService {
	
	/*
	 * Método para Criar Pedidos
	 * */
	
	public static void criarPedido() {
		System.out.println("\nCriar Pedido: ");
		System.out.println("-------------------------------\n");
		
		Cliente clientePedido = ClienteService.getCliente();
		System.out.println("Cliente: "+ clientePedido.getNome()+"\n");
		
		
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
			System.out.println("Pedido criado com sucesso. Obrigado!\nSubtotal R$: "+ pedido.getTotalPedido());
			
			System.out.print("\nDeseja adicionar mais itens? (S/N): ");
			resposta = Principal.scanner.nextLine();
			System.out.println("\n");
			
		}
		
		Principal.pedidosList.add(pedido);
		
		System.out.println("Pedido criado com sucesso. Obrigado!\nValor total R$: "+ pedido.getTotalPedido());
		System.out.println("\nPressione ENTER para continuar");
		Principal.scanner.nextLine();
	}
	
	/*
	 * Método para listar Pedidos
	 * */

	public static void listarPedidos() {
		System.out.println("Listagem de Produto: ");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("NÚMERO PEDIDO \t NOME CLIENTE \t VALOR TOTAL");
		System.out.println("--------------------------------------------------------------------");
		
		System.out.printf("%-10s %-25s %-25s \n","NÚMERO PEDIDO", "NOME CLIENTE", "VALOR TOTAL");
		
		/*Principal.pedidosList.forEach(p-> {
		System.out.printf("%-10s %-25s %-25s \n",p.getNumero(),p.getCliente(),p.getTotalPedido();
		});*/
		for(Pedido pedido: Principal.pedidosList){
			System.out.printf("%-10s %-25s %-25s \n",pedido.getNumero(),pedido.getCliente().getNome(),pedido.getTotalPedido());
			};
		
		System.out.println("Fim da lista.\nPrecione enter para continuar.");
		Principal.scanner.nextLine();
		System.out.println("--------------------------------------------------------------------");
		
		MercadoSevice.limparTela();
	}

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
				System.out.println("Erro: Pedido não econtrado");
			}
		}
		return buscaPedido;
	}

	public static void detalharPedido() {
		Pedido pedido = getPedido();
	
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
	}

}
