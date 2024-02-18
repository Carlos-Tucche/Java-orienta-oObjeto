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

	public static Integer validarcodigo(String nome) {
		Integer codigo = null;
			while (codigo == null) {
				try {
					System.out.print("\n\nDigite uma opção do "+nome+": ");
					codigo = App.scanner.nextInt();
					//App.scanner.nextLine();
					
				} catch (InputMismatchException e) {
					System.out.println("Opçõa invalida!\nPrecione ENTER para voltar ao MENU\n");
					App.scanner.nextLine();
				}
				getMenu();
		}
		return codigo;
	}
}
