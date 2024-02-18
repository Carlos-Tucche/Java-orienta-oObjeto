package br.com.treinamento.compras.service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import br.com.treinamento.compras.Dao.ProdutoDao;
import br.com.treinamento.compras.app.App;
import br.com.treinamento.compras.model.Produto;

public class ProdutoService {
	
	public static void getMenuProduto() throws SQLException {
			
		System.out.print("\n*************************************************\n");
		System.out.println("       PRODUTOS, SELECIONE OPÇÃO DESEJADA:");
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
				
				cadastrarProduto();
				
				break;
			}
			case 2: {
				
				listarProduto();
				
				break;
			}
			case 3: {
				
				visualizarProduto();
				break;
			}
			
			case 4  : {
				
				EditarProduto();
				break;
			}
			
			case 5  : {
				
				ExcluirProduto();
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
	/*Metodo para CADASTRAR PRODUTO*/
	
	public static void cadastrarProduto() throws SQLException {
		
		System.out.print("\n\n*************************************************\n");
		System.out.print("             CADASTRO DE PRODUTOS                \n");
		System.out.print("*************************************************\n\n");
		
		String resposta = "S";
		while(resposta .equalsIgnoreCase("S")) {
		
			System.out.println("-------------------------------------------------");
			System.out.print("Informe o nome do produto: ");
			String nomeProduto = App.scanner.nextLine();
			System.out.print("Informe o valor do produto: ");
			String valorString = App.scanner.nextLine().replace(",",".");
			BigDecimal valor = new BigDecimal(valorString);
			System.out.print("Informe a quantidade entregue ao estoque: ");
			Integer estoque = App.scanner.nextInt();
			App.scanner.nextLine();
			
			Produto produto = new Produto(nomeProduto, valor, estoque);
			
			try {
				salvarProduto(produto);
				System.out.println("\nProduto cadastrado com sucesso!\nDeseja cadastrar novo produto? S/N");
				resposta = App.scanner.nextLine();
				
			} catch (Exception e) {
				System.out.println("Erro ao cadastrar o produto:"+e.getMessage());
				System.out.print("\nProduto cadastrado com sucesso!\nPressione ENTER para continuar.");
			}
		getMenuProduto();
		}
	
	}
	/*Metodo para SALVAR PRODUTO*/
	
	public static void salvarProduto(Produto produto) throws SQLException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.salvaProduto(produto);
	}
	/*Metodo para LISTAR PRODUTO*/
	
	private static void listarProduto() throws SQLException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		List<Produto> produtos = produtoDao.listarProduto();
		
		System.out.print("\n****************************************************************\n");
		System.out.print("                LISTA DE PRODUTO                \n");
		System.out.print("****************************************************************\n\n");
		System.out.print("----------------------------------------------------------------\n");
		System.out.printf("\n%-10s %-20s %-10s %-10s\n","CÓDIGO", "NOME PRODUTO","VALOR","ESTOQUE");
		System.out.print("-----------------------------------------------------------------\n");
		
	 	for(Produto produto : produtos) {
	 		System.out.printf("%-10s %-20s %-10s %-10s\n", produto.getId(), produto.getNomeProduto(), produto.getValor(), produto.getEstoque());
		 	}
		 	System.out.println("\nFim da lista. \nPressione ENTER para voltar ao menu PRODUTO.");
		 	App.scanner.nextLine();
	 	getMenuProduto();
	}
	/*Metodo para VISUALIZAR PRODUTO*/
	
	private static void visualizarProduto() throws SQLException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		
		System.out.print("****************************************************************\n");
		System.out.print("                DETALHAR PRODUTO                \n");
		System.out.print("****************************************************************\n\n");
		System.out.print("----------------------------------------------------------------\n");
		System.out.println("Informe o CÓDIGO do produto: ");
		Integer codigo = App.scanner.nextInt();
		App.scanner.nextLine();
		
		Optional<Produto> produtoOptional = produtoDao.buscarPorId(codigo);
		
		if(produtoOptional.isEmpty()) {
			System.out.println("Produto não encontrado.");
		}else {
			Produto produto = produtoOptional.get();
			System.out.println("Nome do produto: "+produto.getNomeProduto());
			System.out.println("Valor do produto: "+produto.getValor());
			System.out.println("Quantidade em Estoque: "+produto.getEstoque());
		}
		
		System.out.println("Fim da lista. \nPressione ENTER para voltar ao MENU.");
		App.scanner.nextLine();
		getMenuProduto();
	}
	/*Metodo para EDITAR PRODUTO*/
	
	private static void EditarProduto() throws SQLException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		
		System.out.print("****************************************************************\n");
		System.out.print("                     EDITAR PRODUTO                \n");
		System.out.print("****************************************************************\n\n");
		System.out.print("----------------------------------------------------------------\n");
		
		String resposta = "S";
		while(resposta .equalsIgnoreCase("S")) {
		
		System.out.println("Informe o CÓDIGO do produto: ");
		Integer codigo = App.scanner.nextInt();
		App.scanner.nextLine();
		
		Optional<Produto> produtoOptional= produtoDao.buscarPorId(codigo);
		
		if(produtoOptional.isEmpty()) {
			System.out.println("Produto não encontrado");
		}else {
			Produto produto = produtoOptional.get();
			
			System.out.print("Informe o novo NOME do produto: ");
			String nomeProduto = App.scanner.nextLine();
			produto.setNomeProduto(nomeProduto);
			System.out.print("Informe onovo VALOR: ");
			BigDecimal valor = App.scanner.nextBigDecimal();
			App.scanner.nextLine();
			produto.setValor(valor);
			System.out.print("Informe a nova quantidade no ESTOQUE: ");
			Integer estoque = App.scanner.nextInt();
			App.scanner.nextLine();
			produto.setEstoque(estoque);
			produtoDao.Editar(produto);
			System.out.println("\nProduto editado com sucesso. \nDeseja EDITAR outro produto? S/N ");
			resposta = App.scanner.nextLine();
			}
		}
		getMenuProduto();
	}
	/*Metodo para EXCLUIR PRODUTO*/
	
	private static void ExcluirProduto() throws SQLException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		
		System.out.print("****************************************************************\n");
		System.out.print("                     EXCLUIR PRODUTO                \n");
		System.out.print("****************************************************************\n\n");
		System.out.print("----------------------------------------------------------------\n");
		
		System.out.println("Informe o codigo do produto: ");
		Integer codigo = App.scanner.nextInt();
		App.scanner.nextLine();
		
		Optional<Produto> produtoOptional= produtoDao.buscarPorId(codigo);
		
		if(produtoOptional.isEmpty()) {
			System.out.println("Produto não encontrado");
		}else {
			Produto produto = produtoOptional.get();
			System.out.print("Deseja realmente excluir o produto: "+produto.getNomeProduto()+"? (S/N)");
			String confirmacao = App.scanner.nextLine(); 
			
			if(confirmacao.equalsIgnoreCase("S")) {
				produtoDao.excluir(codigo);
				System.out.println("Produto excluido com sucesso. \nPressione ENTER para voltar ao MENU");
			}else {
				System.out.println("Eclusão cancelada \nPressione ENTER para voltar ao MENU.");
			}
			App.scanner.nextLine();
		}
		
	}
	
}
