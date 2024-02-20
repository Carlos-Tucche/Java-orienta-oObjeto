package br.com.treinamento.compras.model;

import lombok.Getter;
import lombok.Setter;

public class Cliente {

	public Cliente(String nomeCliente, String cidade, String estado, String email) {
		this.nomeCliente = nomeCliente;
		this.cidade = cidade;
		this.estado = estado;
		this.email = email;
	}
	
	@Getter @Setter
	private Integer idCliente;
	
	@Getter @Setter
	private String nomeCliente;
	
	@Getter @Setter
	private String cidade;
	
	@Getter @Setter
	private String estado;
	
	@Getter @Setter
	private String email;
	
	
}
