package br.com.treinamento.mercado.service;

import java.math.BigDecimal;

import br.com.treinamento.mercado.main.Principal;
import br.com.treinamento.mercado.model.Produto;

public class ProdutoService {

	public static void cadastrarProduto() {
		System.out.println("Cadastro de Produto: ");
		System.out.println("-------------------------------");
		
		Integer codigoProduto = null;
		while (codigoProduto == null) {
			try {
				System.out.println("Codigo do produto: ");
				codigoProduto = Principal.scanner.nextInt();
				Principal.scanner.nextLine();
			} catch (Exception e) {
				System.out.println("Codigo invalido, digite um número inteiro: ");
				Principal.scanner.nextLine();
			}
		}
		
		System.out.print("Nome: ");
		String nome = Principal.scanner.nextLine();
				
		System.out.print("Preço: ");
		String precoString = Principal.scanner.nextLine().replace(",",".");
		BigDecimal preco = new BigDecimal(precoString);
		
		boolean codigoDupilcado = false;
		for(Produto produto : Principal.produtoList){ 
			if(produto.getCodigoProduto().equals(codigoProduto)) {
				System.out.println("Codigo já possui cadatro!");
				codigoDupilcado = true;
			}
			if(!codigoDupilcado) {
				Principal.produtoList.add(new Produto(null, nome, preco)); 
			}
			
			System.out.println("Produto cadastrado com sucesso.\n Pressiione ENTER para continua.");
			Principal.scanner.nextLine();

		}
		
	}
	 
	public static void listarProduto() {
		System.out.println("Listagem de Produto: ");
		System.out.println("\n\n-------------------------------");
		System.out.println("Codigo \\ Produto \\ Preço");
		System.out.println("-------------------------------");
		
		System.out.printf("%-10s %-25s %-25s \n","Codigo", "Nome Produto", "Preço");
		

		Principal.produtoList.forEach(p-> 
		{System.out.printf("%-10s %-25s %-25s \n",p.getCodigoProduto()+ p.getNomeProduto()+ p.getPreco());});
		
		System.out.println("-------------------------------");
	}

}

