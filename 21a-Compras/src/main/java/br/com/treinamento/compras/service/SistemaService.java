package br.com.treinamento.compras.service;

public class SistemaService {
	
	/*
	 * Metodo para CHAMAR o Menu
	 * */

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

}
