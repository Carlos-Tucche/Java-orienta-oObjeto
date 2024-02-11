package br.com.treinamento.compras.service;

import java.math.BigDecimal;
import java.sql.SQLException;

import br.com.treinamento.compras.Dao.ProdutoDao;
import br.com.treinamento.compras.app.App;
import br.com.treinamento.compras.model.Produto;

public class ProdutoService {
	
	public void getMenuProduto() {
			
		System.out.print("\n*************************************************\n");
		System.out.println("          SISTEMA DE COMPRAS - Produtos:");
		System.out.print("*************************************************\n");
		System.out.print("__________________________________________________\n");
		System.out.print("|                                                 |");
		System.out.println("\n|               1 - Cadastrar Produto         |");
		System.out.println("|               2 - Listar Produto              |");
		System.out.println("|               3 - Editar produto              |");
		System.out.println("|               4 - Menu Principal              |");
		System.out.println("|               0 - Sair do sistema             |");
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
			default:
				System.out.println("Opção invalidade.\n digite um número válido.");
			}
		}
		}

	public void cadastrarProduto() {
		
		System.out.println("CADASTRAR PRODUTO.");
		
		System.out.print("Informe o nome do produto: ");
		String nomeProduto = App.scanner.nextLine();
		
		System.out.print("Informe o valor do produto: ");
		BigDecimal valor = App.scanner.nextBigDecimal();
		App.scanner.nextLine();
		
		System.out.print("Informe a quantidade entregue ao estoque: ");
		Integer estoque = App.scanner.nextInt();
		App.scanner.nextLine();
		
		Produto produto = new Produto(nomeProduto, estoque, valor);
		
		try {
			salvarProduto(produto);
			System.out.println("\nProduto cadastrado com sucesso!\nPressione ENTER para continuar.");
			App.scanner.nextLine();
			
		} catch (Exception e) {
			System.out.println("Erro ao cadastrar o produto:"+e.getMessage());
			System.out.println("\nProduto cadastrado com sucesso!\nPressione ENTER para continuar.");
		}
	}

	public void salvarProduto(Produto produto) throws SQLException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.salvaProduto(produto);
	}
	
}
