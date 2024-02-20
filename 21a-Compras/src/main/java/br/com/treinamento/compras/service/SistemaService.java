package br.com.treinamento.compras.service;

import java.util.InputMismatchException;

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
	
	/*
	 * Metodo Validar opção.
	 */

	public static Integer validarcodigo() {
		Integer codigo = null;
			while (codigo == null) {
				try {
					codigo = App.scanner.nextInt();
					
				} catch (InputMismatchException e) {
					System.out.println("Opçõa invalida! Digite um NÚMERO do MENU.");
					App.scanner.nextLine();
				}
				
		}
		return codigo;
	}
}
