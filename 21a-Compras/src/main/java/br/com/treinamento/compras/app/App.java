package br.com.treinamento.compras.app;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.treinamento.compras.service.ProdutoService;
import br.com.treinamento.compras.service.SistemaService;

public class App {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		
		ProdutoService produtoService = new ProdutoService();
		
		while (true) {
			
			SistemaService.getMenu();
			System.out.print("\n\nDigite sua Opção: ");
			Integer opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 0: {
				
				SistemaService.metodoSair();
				
				break;
				}
			
			case 2: {
				
				produtoService.getMenuProduto();
				
				break;
			
				}
			default:
				System.out.println("Opção inválida! Tente novamente.");
			
			}
		}
		
	}

}
