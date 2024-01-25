package br.com.treinamento.jdbc;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Scanner;

import br.com.treinamento.Dao.ProdutoDao;
import br.com.treinamento.model.Produto;
import br.com.treinamento.service.SistemaService;

public class Principal {

	public static void main(String[] args) throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		ProdutoDao produtoDao = new ProdutoDao();
		
		while (true) {
			
			SistemaService.montaMenu();
			System.out.print("\nInforme a opção:");
			Integer opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1: {
				
				System.out.println("Cadastrar Produto.");
				
				System.out.print("informe o nome do produto: ");
				String nome = scanner.nextLine();
				
				System.out.print("informe o valor: ");
				BigDecimal preco = scanner.nextBigDecimal();
				
				Produto produto = new Produto(nome, preco);
				
				produtoDao.salvaProduto(produto);
				
				
				System.out.println(produto);
				System.out.println("Pressione ENTER para continuar.");
				scanner.nextLine();
				
				break;
			}
			
			
			default:
				System.out.println("Opção invalida!");
			}
		}
		
		
		
	}

}
