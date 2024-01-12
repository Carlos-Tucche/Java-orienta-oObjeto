package br.com.treinamento.mercado.service;

import br.com.treinamento.mercado.main.Principal;

public class MercadoSevice {

	public static void montarMenu() {
		System.out.println("Sistema de Pedidos - Selecione uma opção:");
		System.out.println("1 - Cadrastrar Cliente");
		System.out.println("2 - Listar Clientes");
		System.out.println("3 - Adicionar Produto");
		System.out.println("4 - Lista Produto");
		System.out.println("5 - Sair");
	}

	public static void sair() {
		Principal.scanner.close();
		System.out.println("Obrigado");
		System.exit(0);
	}

}
