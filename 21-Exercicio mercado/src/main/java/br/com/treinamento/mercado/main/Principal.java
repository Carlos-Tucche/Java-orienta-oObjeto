package br.com.treinamento.mercado.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.treinamento.mercado.model.Cliente;
import br.com.treinamento.mercado.model.Produto;
import br.com.treinamento.mercado.service.MercadoSevice;

public class Principal {
	
	public class produtoList {

	}

	public static Scanner scanner = new Scanner(System.in);
	public static List<Cliente> clienteList = new ArrayList<Cliente>();
	public static List<Produto> produtoList = new ArrayList<Produto>();

	public static void main(String[] args) {
	
		while(true) {
			
	 		MercadoSevice.montarMenu();
			
			System.out.print("Opção: ");
			Integer opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1: {
				
				MercadoSevice.cadastrarCliente();
				
				break;
			}
			
			case 2: {
				
				MercadoSevice.listarClientes();
				
				break;
			}
			
			case 3: {
				MercadoSevice.cadastrarProduto();
				
				break;
			}
			
			case 5: {
				
				MercadoSevice.sair();
			}
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
			
		}

	}

}
