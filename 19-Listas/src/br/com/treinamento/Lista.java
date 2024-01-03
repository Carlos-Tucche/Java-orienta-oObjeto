package br.com.treinamento;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Maça"); // Adiciona na ordem que chega
		list.add(1,"Banana"); // Adiciona informação a posição
		list.addFirst("Goiaba");// Adiciona o inicio da lista
		System.out.println(list);

	}

}
