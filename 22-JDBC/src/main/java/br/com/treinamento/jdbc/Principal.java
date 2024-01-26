package br.com.treinamento.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.treinamento.service.ProdutoService;
import br.com.treinamento.service.SistemaService;

public class Principal {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		
		ProdutoService produtoService = new ProdutoService();
		
		while (true) {
			
			SistemaService.montaMenu();
			System.out.print("\nInforme a opção:");
			Integer opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1: {
				
				produtoService.cadastrarProduto();
				
				break;
			}
			case 2: {
				
				produtoService.listarProdutos();
				
				break;
			}
			
			case 3: {
				
			//	produtoService.visualizarProdutos();
				
				break;
			}
			
			default:
				System.out.println("Opção invalida!");
			}
		}
		
	}

}
