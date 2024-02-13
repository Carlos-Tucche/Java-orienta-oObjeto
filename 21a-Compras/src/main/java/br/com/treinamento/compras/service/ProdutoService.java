package br.com.treinamento.compras.service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import br.com.treinamento.compras.Dao.ProdutoDao;
import br.com.treinamento.compras.app.App;
import br.com.treinamento.compras.model.Produto;

public class ProdutoService {
	
	public void getMenuProduto() throws SQLException {
			
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
			
			case 6: {
				
				SistemaService.getMenu();
				
				break;
			}
			
			default:
				System.out.println("Opção invalidade.\nDigite um número válido.");
			}
		}
	}

	public void cadastrarProduto() throws SQLException {
		
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
				System.out.println("\nProduto cadastrado com sucesso!\nDeseja cadastrar novo produto");
				resposta = App.scanner.nextLine();
				
			} catch (Exception e) {
				System.out.println("Erro ao cadastrar o produto:"+e.getMessage());
				System.out.println("\nProduto cadastrado com sucesso!\nPressione ENTER para continuar.");
			}
			getMenuProduto();
		}
	
	}
	public void salvarProduto(Produto produto) throws SQLException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.salvaProduto(produto);
	}
	
	private void listarProduto() throws SQLException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		List<Produto> produtos = produtoDao.listarProduto();
		
		System.out.print("****************************************************************\n");
		System.out.print("                LISTA DE PRODUTO                \n");
		System.out.print("****************************************************************\n\n");
		System.out.print("----------------------------------------------------------------\n");
		System.out.printf("\n%-10s %-25s %-25s \n","CÓDIGO", "NOME PRODUTO","VALOR","ESTOQUE");
		System.out.print("-----------------------------------------------------------------\n");
			
	 	System.out.printf("%-10s %-25s %-25s \n","CÓDIGO", "NOME PRODUTO", "VALOR", "ESTOQUE");
		
	 	for(Produto produto : produtos) {
	 		System.out.printf("%-10s %-25s %-25s \n", produto.getId(), produto.getNomeProduto(), produto.getValor(), produto.getEstoque());
	 	}
	 	System.out.println("Fim da lista. \nPressione ENTER para voltar ao menu inicial.");
	 	App.scanner.nextLine();
	 	getMenuProduto();
	}
	
}
