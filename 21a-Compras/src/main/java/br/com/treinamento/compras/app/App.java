package br.com.treinamento.compras.app;

import java.util.Scanner;

import br.com.treinamento.compras.service.SistemaService;

public class App {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
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
				
				scanner.close();
				System.out.println("Obrigado!");
				System.exit(0);
				
				break;
			
				}
			default:
				System.out.println("Opção inválida! Tente novamente.");
			
			}
		}
		
	}

}
