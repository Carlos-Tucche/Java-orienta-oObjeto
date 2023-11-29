package br.com.treinamento.Revisao;

import java.util.Scanner;

public class App 
{
    private static int opcao;

	public static void main( String[] args )
    {
      Scanner entrada = new Scanner(System.in);
      
      while(true) {
    	  System.out.println("\n::  MENU BIBLIOTECA :: \n");
    	  System.out.println("Bem-vindo(a) ao sistema de emprestimos de livros. \n Digite a opção desejada  ");
    	  System.out.println("1- Cadastro usuario.");
    	  System.out.println("2- Cadastro de livros.");
    	  System.out.println("3- Reservas.");
    	  System.out.println("4- Emprestimos.");
    	  System.out.println("0- Sair do Sistema.");
    	  
    switch (opcao) {
	case 1:
				
		break;
		
	default:
		break;
	}
    	  
    	  entrada.close();
      }
    }
}
