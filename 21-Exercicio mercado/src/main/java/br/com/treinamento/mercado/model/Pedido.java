package br.com.treinamento.mercado.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Pedido {
	
	public Pedido(Cliente clietne, List<Produto> produtosList, BigDecimal total) {
		this.clietne = clietne;
		
	}

	@Getter @Setter
	private Cliente clietne;
	
	@Getter @Setter
	private List<Produto> produtosList = new ArrayList<Produto>();
	
	@Getter @Setter
	private BigDecimal total;
	
	public void insereProduto(Produto produto) {
		produtosList.add(produto);
	}
	
}
