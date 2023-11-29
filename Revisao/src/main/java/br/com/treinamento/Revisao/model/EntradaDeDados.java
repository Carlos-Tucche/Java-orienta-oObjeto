package br.com.treinamento.Revisao.model;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("Nome: "+ nome + "\nIdade: "+ idade);
		
		scanner.close();

	}

}
