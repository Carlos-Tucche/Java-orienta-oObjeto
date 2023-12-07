package br.com.treinamento.abstrato;

public class NuvemBrods extends Nuvem {

	@Override
	String converteBase64(String imagem) {
		
		String imagemBase64 = imagem.replaceAll("-", "$");
		
		return imagemBase64;
	}

}
