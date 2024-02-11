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
	
	/*
	 * Metodo VALIDADOR de codigo.
	 */
	
	public static Integer validarCodigo(String nome ) {
		Integer codigo = null;
			while(codigo == null) {
				try {
					System.out.println("Digite CÓDIGO do "+nome+": ");
					codigo = App.scanner.nextInt();
					App.scanner.nextLine();
					
				} catch (Exception e) {
					System.out.println("CÓDIGO inválido! Digite um número interio: ");
				}
			
		}
		return codigo;
	}
	
	
	
	
	
		
}
