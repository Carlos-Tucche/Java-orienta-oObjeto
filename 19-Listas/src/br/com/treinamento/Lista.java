package br.com.treinamento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Maça"); // Adiciona na ordem que chega
		list.add(1,"Banana"); // Adiciona informação a posição
		list.addFirst("Goiaba");// Adiciona o inicio da lista
		list.addLast("Uva");
		System.out.println(list);
		
		// Concatenação de Listas
        List<String> lista1 = new ArrayList<>();
        lista1.add("Java");
        lista1.add("Python");
        
        List<String> lista2 = new ArrayList<>();
        lista2.add("C++");
        lista2.add("JavaScript");

        lista1.addAll(lista2);
        

        //lista1.set(1, "null");
        lista1.add(1, "Null");
        System.out.println(lista1);

        list.remove(1);// Remove o elemento da posição 1
        //list.clear();// Remove todos os elementos da lista
        list.clone();// Cria uma cópia da lista
        list.contains("Maçã");// Verifica se a lista contém o elemento
        list.remove("JavaScript");// Remove o elemento da lista pelo valor
        list.ensureCapacity(0);// Garante que a lista tenha a capacidade mínima especificada
        list.get(0);// Retorna o elemento da posição 0
        list.getFirst();// Retorna o primeiro elemento da lista
        list.getLast();// Retorna o último elemento da lista
        list.indexOf("Maçã");// Retorna a posição do elemento na lista
        list.isEmpty();// Verifica se a lista está vazia
        list.lastIndexOf("Maçã");// Retorna a última posição do elemento na lista
        list.removeFirst();// Remove o primeiro elemento da lista
        list.removeLast();// Remove o último elemento da lista
        list.size();// Retorna o tamanho da lista
        list.sort(null);// Ordena a lista
        list.subList(0, 1);// Retorna uma sublista da lista
        list.toArray();// Retorna um array com os elementos da lista
        list.trimToSize();// Reduz a capacidade da lista ao seu tamanho atual
        list.reversed();// Retorna uma lista com os elementos em ordem reversa
        

        List<String> listArray = Arrays.asList("Maria","José","Francisco");
        System.out.println(listArray);
        

        ArrayList<String> carros =  new ArrayList<>(List.of("VW", "Ford", "GM"));
        System.out.println(carros);
        carros.add("Fiat");
        System.out.println(carros);


        List<String> listaComNCopias = Collections.nCopies(10, "Ola");
        System.out.println(listaComNCopias);


        List<Integer> toBeSorted = new ArrayList<>(List.of(3,2,4,1,-2));
        Collections.sort(toBeSorted);
        System.out.println(toBeSorted);

	}

}
