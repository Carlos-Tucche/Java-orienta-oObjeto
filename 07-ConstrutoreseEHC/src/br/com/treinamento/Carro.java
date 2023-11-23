package br.com.treinamento;

public class Carro {
	
	private String marca;
	private String nome;
	private Integer anoFabricacao;
	
	public Carro(String marca, String nome, Integer anoFabricação) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.anoFabricacao = anoFabricação;
	}

	public Carro(Integer anoFabricacao) {
		super();
		this.anoFabricacao = anoFabricacao;
	}
	
	public Integer idadeCarro() {
		return (2023-this.anoFabricacao);
	}

	public String getMarca() {
		return marca;
	}

	public String getNome() {
		return nome;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
		
	

}
