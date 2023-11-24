package br.com.treinamento.utilitarios;

public class AuxiliarString { 
	
	/**
	 * Retira os pontos das numerações.
	 * @param texto recebe os textos (números).
	 * @return retorna os textos sem os pontos.
	 */
	public static String removePontuacao (String texto) {
		return texto.replaceAll("\\.","");
	}

}
