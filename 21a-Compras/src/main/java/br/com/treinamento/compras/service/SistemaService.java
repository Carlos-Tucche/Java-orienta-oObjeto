package br.com.treinamento.compras.service;

import br.com.treinamento.compras.app.App;

public class SistemaService {
	
	/*
	 * Metodo para CHAMAR o Menu Principal.
	 */

	public static void getMenu() {
		System.out.print("\n*************************************************\n");
		System.out.println("    SISTEMA DE COMPRAS - Selecione uma opção:");
		System.out.print("*************************************************\n");
		System.out.print("__________________________________________________\n");
		System.out.print("|                                                 |");
		System.out.println("\n|                 1 - CLIENTES                    |");
		System.out.println("|                 2 - PRODUTOS                    |");
		System.out.println("|                 3 - PEDIDOS                     |");
		System.out.println("|                 4 - ESTOQUE                     |");
		System.out.println("|                 0 - SAIR                        |");
		System.out.print("|_________________________________________________|");
	}
	
	/*
	 * Metodo SAIR dos Menus.
	 */

	public static void metodoSair() {
		App.scanner.close();
		System.out.println("Obrigado!");
		System.exit(0);
	}

	public static Integer validarcodigo(String nome) {
		Integer opcao = null;
			while (opcao == null) {
				try {
					System.out.print("\nDigite o Código do "+nome+": ");
					opcao = App.scanner.nextInt();
					App.scanner.nextLine();
					
				} catch (Exception e) {
					System.out.println("Código invalido! Digite um número inteiro.");
					App.scanner.nextLine();
				}
		}
		return opcao;
	}
}
