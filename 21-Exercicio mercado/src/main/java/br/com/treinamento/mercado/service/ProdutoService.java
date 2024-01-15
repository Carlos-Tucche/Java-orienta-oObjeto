package br.com.treinamento.mercado.service;

import java.math.BigDecimal;

import br.com.treinamento.mercado.main.Principal;
import br.com.treinamento.mercado.model.Produto;

public class ProdutoService {
	
	/*
	 * Método para validar e cadatrar clientes
	 * */

	public static void cadastrarProduto() {
		System.out.println("Cadastro de Produto: ");
		System.out.println("-------------------------------");
		
		boolean codigoValido = false;
		Integer codigo = null;
		
		while (!codigoValido) {
			
			codigo = MercadoSevice.validarcodigo();
			
			boolean codigoDuplicado = false;
			for(Produto produto : Principal.produtoList){
				if(produto.getCodigo().equals(codigo)) {
					System.out.println("Codigo já possui cadatro!"+codigo);
					codigoDuplicado = true;
					break;
				}
			} 
		if(!codigoDuplicado) {
			codigoValido =true;
		}
		}
		
		System.out.print("Nome: ");
		String nome = Principal.scanner.nextLine();
				
		System.out.print("Preço: ");
		String precoString = Principal.scanner.nextLine().replace(",",".");
		BigDecimal preco = new BigDecimal(precoString);
		
		Principal.produtoList.add(new Produto(codigo, nome, preco));
		
		System.out.println("Produto cadastrado com sucesso.\n Pressione ENTER para continuario");
		Principal.scanner.nextLine();
		}
	/*
	 * Método para listar clientes
	 * */
	 
	public static void listarProduto() {
		System.out.println("Listagem de Produto: ");
		System.out.println("\n\n-------------------------------");
		System.out.println("Codigo \t Nome Produto \t Preço");
		System.out.println("-------------------------------");
		
		System.out.printf("%-10s %-25s %-25s \n","Codigo", "Nome", "Preço");
		
		/*for (Cliente cliente : clienteList) {
		System.out.println(cliente.getNome()+" - "+cliente.getEmail());
		}*/
		
		Principal.produtoList.forEach(p-> {
		System.out.printf("%-10s %-25s %-25s \n",p.getCodigo(),p.getNomeProduto(),p.getPreco());
		});
		
		System.out.println("Fim da lista.\nPrecione enter para continuar.");
		Principal.scanner.nextLine();
		System.out.println("-------------------------------");
	}

}
