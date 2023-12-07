package br.com.treinamento.abstrato;

import lombok.Getter;
import lombok.Setter;

public abstract class Nuvem {
	
	@Getter @Setter
	private String nomeImagem;

	@Setter
	private String urlImagem;
	
	abstract String converteBase64(String imagem);
	
	public void upload(String base64) {
		System.out.println("imagem enviada com sucesso!");
		this.urlImagem ="http;//caminho_da_imagem";
	}
}
