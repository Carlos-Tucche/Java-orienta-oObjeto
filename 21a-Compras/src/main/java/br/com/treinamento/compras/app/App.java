package br.com.treinamento.compras.app;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.treinamento.compras.service.ClienteService;
import br.com.treinamento.compras.service.ProdutoService;
import br.com.treinamento.compras.service.SistemaService;

public class App {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		
		/*SistemaService.montaMenu();
		System.out.print("\nInforme a opção:");
		Integer opcao = scanner.nextInt();
		scanner.nextLine();*/
		
		while (true) {
			
			SistemaService.getMenu();

			Integer opcao = SistemaService.validarcodigo("MENU");
			opcao = scanner.nextInt();
			//scanner.nextLine();
 			
			switch (opcao) {
			case 0: {
				
				SistemaService.metodoSair();
				
				break;
				}
			
			case 1: {
				
				ClienteService.getMenuCliente();
				
				break;
			}
			
			case 2: {
				
				ProdutoService.getMenuProduto();
				
				break;
			}
			
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
		}
		
	}

}
