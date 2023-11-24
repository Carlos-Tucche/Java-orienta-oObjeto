package br.com.treinamento.utilitarios;

public class AuxiliarString {
	
	public static String removePontuacao (String texto) {
		return texto.replaceAll("\\.","");
	}

}
