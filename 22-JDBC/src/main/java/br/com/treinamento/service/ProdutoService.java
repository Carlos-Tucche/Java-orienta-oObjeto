package br.com.treinamento.service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import br.com.treinamento.Dao.ProdutoDao;
import br.com.treinamento.jdbc.Principal;
import br.com.treinamento.model.Produto;

public class ProdutoService {
	
	/*
	 * Cadastrar Cliente
	 */

	public void cadastrarProduto() {
		System.out.println("Cadastrar Produto.\n");
		
		System.out.print("Informe o nome do produto: ");
		String nome = Principal.scanner.nextLine();
		
		System.out.print("Informe o valor: ");
		BigDecimal preco = Principal.scanner.nextBigDecimal();
		Principal.scanner.nextLine();
		
		Produto produto = new Produto(nome, preco);
		
		try {
			salvarProduto(produto);
			System.out.println("\nProduto cadastrado com sucesso!\nPressione ENTER para continuar.");
			Principal.scanner.nextLine();
			
		} catch (Exception e) {
			System.out.println("Erro ao cadastrar o produto:"+ e.getMessage());
			System.out.println("\nProduto cadastrado com sucesso!\nPressione ENTER para voltar ao Menu.");
			Principal.scanner.nextLine();
		}
	}
	
	/*
	 * Salvar um produto
	 */

	public void salvarProduto(Produto produto) throws SQLException {
		
		 ProdutoDao produroDao = new ProdutoDao();
		 produroDao.salvaProduto(produto);
		 
	}

	public void listarProdutos() throws SQLException {
		
		 ProdutoDao produroDao = new ProdutoDao();
		 List<Produto> produtos = produroDao.listarProduto();
		 
		 //System.out.println("Lista de Produtos\n");
		 //System.out.println("Codigo \t Nome \t Preço\n");

		 System.out.print("****************************************************************\n");
		 System.out.print("                LISTA DE PRODUTO                \n");
		 System.out.print("****************************************************************\n\n");
		 System.out.print("----------------------------------------------------------------\n");
		 System.out.printf("\n%-10s %-25s %-25s \n","Codigo", "Nome","Valor");
		 System.out.print("-----------------------------------------------------------------\n");
			
	 	System.out.printf("%-10s %-25s %-25s \n","Codigo", "Nome", "Valor");
		 
		 for(Produto produto : produtos) {
			 System.out.printf("\n%-10s %-25s %-25s \n",produto.getId(), produto.getNome(), produto.getPreco());
		 }
		 
		 System.out.println("Fim da lista. \nPressione ENTER para voltar ao MENU.");
		 Principal.scanner.nextLine();
	}

	public void visualizarProdutos() {
		
		ProdutoDao produtoDao = new ProdutoDao();
		
		System.out.println("Detalhar Produto");
		
		System.out.println("Informe o codigo do produto: ");
		Integer codigo = Principal.scanner.nextInt();
		Principal.scanner.nextLine();
		
		ProdutoDao produto = produto.buscarPorId(codigo);
		
		System.out.println("Nome do produto: "+produto.getNome());
		System.out.println("Nome do produto: "+produto.getPreco());
		
		System.out.println("Fim da lista. \nPressione ENTER para voltar ao MENU.");
		Principal.scanner.nextLine();
	}
}
