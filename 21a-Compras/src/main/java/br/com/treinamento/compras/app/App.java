package br.com.treinamento.compras.app;

import java.util.Scanner;

import br.com.treinamento.compras.service.ProdutoService;
import br.com.treinamento.compras.service.SistemaService;

public class App {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		ProdutoService produtoService = new ProdutoService();
		
		while (true) {
			
			SistemaService.getMenu();
			
			System.out.println("\n\nDigite sua Opção: ");
			Integer opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			
			case 0: {
				
				scanner.close();
				System.out.println("Obrigado!");
				System.exit(0);
				
				break;
				}
			
			case 1: {
				
				produtoService.getMenuProduto();
				
				break;
			
				}
			default:
				System.out.println("Opção inválida! Tente novamente.");
			
			}
		}
		
	}

}
