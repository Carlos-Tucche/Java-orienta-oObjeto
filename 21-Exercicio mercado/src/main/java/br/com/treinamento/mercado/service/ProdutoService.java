package br.com.treinamento.mercado.service;

import java.math.BigDecimal;
import br.com.treinamento.mercado.main.Principal;
import br.com.treinamento.mercado.model.Produto;
import lombok.ToString;

@ToString
public class ProdutoService {
	
	/*
	 * Método para validar e cadastrar Produto
	 */

	public static void cadastrarProduto() {
		
			System.out.print("\n*************************************************\n");
			System.out.print("             CADASTRO DE PRODUTOS                \n");
			System.out.print("*************************************************\n");

			String resposta = "S";

			while (resposta.equalsIgnoreCase("S")) {
			
			//Método Verificador Cliente.
			Integer codigo = verificarProduto();
			
			System.out.print("Nome: ");
			String nome = Principal.scanner.nextLine();
			System.out.print("Preço: ");
			String precoString = Principal.scanner.nextLine().replace(",",".");
			BigDecimal preco = new BigDecimal(precoString);
			Principal.produtoList.add(new Produto(codigo, nome, preco));
			System.out.print("\n");
			System.out.print("Produto cadastrado com sucesso.\nDeseja adicionar mais produtos? (S/N): ");
			resposta = Principal.scanner.nextLine();

		}
	}
	
	/*
	 * Método para Verificar Produto
	 */

	public static Integer verificarProduto() {
		boolean codigoValido = false;
		Integer codigo = null;
		
		while (!codigoValido) {
			 	
			//metodo valiadar codigo
			codigo = MercadoSevice.validarcodigo("Produto");			
			
			boolean codigoDupilcado = false;
			for(Produto produto : Principal.produtoList){
				if(produto.getCodigo().equals(codigo)) {
					System.out.println("Codigo já possui cadatro!"+codigo);
					codigoDupilcado = true;
					break;
				}
			}
			if(!codigoDupilcado) {
				codigoValido = true;
			}
		}
		return codigo;
	}
	
	/*
	 * Método para listar Produto
	 */
	 
	public static void listarProduto() {
		System.out.print("\n****************************************************************\n");
		System.out.print("                     LISTA DE PRODUTOS                          \n");
		System.out.print("****************************************************************\n");
		System.out.print("----------------------------------------------------------------\n");
		System.out.printf("%-10s %-25s %-25s \n","CÓDIGO", "NOME", "VALOR");
		System.out.print("-----------------------------------------------------------------\n");
		
		Principal.produtoList.forEach(p-> {
		System.out.printf("%-10s %-25s %-25s \n",p.getCodigo(),p.getNomeProduto(),p.getPreco());
		});
		
		System.out.print("-----------------------------------------------------------------\n");
		System.out.println("Fim da lista.\nPrecione enter para voltar ao MENU.");
		Principal.scanner.nextLine();
		
	}

	/*
	 * Método para buscar Produtos em criar pedidos.
	 */
	
	public static Produto getProduto() {
		Produto produtoPedido = null;
		Boolean produtoValido = false;
		
		while (!produtoValido) {
			Integer codigoProduto = MercadoSevice.validarcodigo("produto");
			
			for (Produto produto: Principal.produtoList) {
				if (produto.getCodigo().equals(codigoProduto)){
					produtoPedido = produto;
					break;
				}
			}
			if (produtoPedido!= null) {
				produtoValido = true;
			}else {
				System.out.println("Produto não encontrado");
			}
			
		}
		return produtoPedido;
	}
	
}
