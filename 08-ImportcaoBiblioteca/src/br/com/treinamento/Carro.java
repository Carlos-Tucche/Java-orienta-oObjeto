package br.com.treinamento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Carro {
	
	
	@Getter @Setter
	private String modelo;
	
	@Getter @Setter
	private String marca;
	
	@Getter @Setter
	private String motor;
	
	@Getter @Setter
	private Integer anoFrabricacao;
	
	@Getter @Setter
	private String combustivel;
	
	@Getter @Setter
	private String cor;
	
	
}
