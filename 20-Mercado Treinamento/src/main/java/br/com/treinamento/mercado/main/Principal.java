package br.com.treinamento.mercado.main;

import java.util.Scanner;

import br.com.treinamento.mercado.service.MercadoSevice;

public class Principal {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	
		while(true) {
			
			MercadoSevice.montarMenu();
			
			System.out.print("Opção: ");
			Integer opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1: {
				//Cadatra o cliente
				break;
			}
			case 5: {
				scanner.close();
				System.out.println("Obrigado");
				System.exit(0);
			}
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
			
		}

	}

}
