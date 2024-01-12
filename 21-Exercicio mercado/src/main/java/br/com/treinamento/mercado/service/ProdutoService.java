package br.com.treinamento.mercado.service;

import java.math.BigDecimal;

import br.com.treinamento.mercado.main.Principal;
import br.com.treinamento.mercado.model.Produto;

public class ProdutoService {

	public static void cadastrarProduto() {
		System.out.println("Cadastro de Produto: ");
		System.out.println("-------------------------------");
		
		System.out.print("Nome: ");
		String nome = Principal.scanner.nextLine();
				
		System.out.print("Preço: ");
		String precoString = Principal.scanner.nextLine();
		BigDecimal preco = new BigDecimal(precoString);
		
		Principal.produtoList.add(new Produto(nome, preco, null));
	}
	 
	public static void listarProduto() {
		System.out.println("Listagem de Produto: ");
		System.out.println("-------------------------------");
		System.out.println("Produto \\ Preço");
		System.out.println("-------------------------------");
		
		/*for (Cliente cliente : clienteList) {
		System.out.println(cliente.getNome()+" - "+cliente.getEmail());
		}*/
		
		Principal.produtoList.forEach(p-> System.out.println(p.getNomeProduto()+ " - "+ p.getPreco()));
		
		System.out.println("-------------------------------");
	}

}

