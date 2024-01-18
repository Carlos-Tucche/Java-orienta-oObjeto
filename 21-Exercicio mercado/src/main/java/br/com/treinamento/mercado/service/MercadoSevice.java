package br.com.treinamento.mercado.service;

import java.io.IOException;

import br.com.treinamento.mercado.main.Principal;
import lombok.ToString;

@ToString
public class MercadoSevice {

	/*
	 * Metodo Gerador do MENU
	 * */
	
	public static void montarMenu() {
		System.out.println("Sistema de Pedidos - Selecione uma opção:");
		System.out.println("1 - Cadrastrar Cliente");
		System.out.println("2 - Listar Clientes");
		System.out.println("3 - Adicionar Produto");
		System.out.println("4 - Lista Produto");
		System.out.println("5 - Criar Pedido");
		System.out.println("6 - Listar Pedido");
		System.out.println("7 - Detalhar Pedido");
		System.out.println("0 - Sair");
	}
	
	/*
	 * Metodo Sair
	 * */
	
	public static void sair() {
		Principal.scanner.close();
		System.out.println("Obrigado");
		System.exit(0);
	}

	/*
	 * Metodo Validador de CODIGO
	 * */
	
	public static Integer validarcodigo(String nome) {
		Integer codigo = null;
			while (codigo == null) {
				try {
					System.out.print("Digite o Codigo "+nome+": ");
					codigo = Principal.scanner.nextInt();
					Principal.scanner.nextLine();
					
				} catch (Exception e) {
					System.out.println("Codigo invalido! Digite um número inteiro.");
					Principal.scanner.nextLine();
				}
		}
		return codigo;
	}
	
	/*
	 * Metodo Limpar tela
	 * */

	public static void limparTela() {
		System.out.println("\n");
		
		// Windows
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
