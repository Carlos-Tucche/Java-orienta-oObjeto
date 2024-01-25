package br.com.treinamento.service;

import java.sql.SQLException;

import br.com.treinamento.Dao.ProdutoDao;
import br.com.treinamento.model.Produto;

public class ProdutoService {
	
	/*
	 * Salvar um produto
	 */

	public void salvarProduto(Produto produto) {
		
		 ProdutoDao produroDao = new ProdutoDao();
		 try {
			produroDao.salvaProduto(produto);
		} catch (SQLException e) {
			System.out.println("Erro ao salvar o produto:" + e.getMessage());
		}
		
	}
}
