package br.com.treinamento;

public class EnhancedFor {

	public static void main(String[] args) {
		
		int [] arrayList = {10,20,30,40, 60,70};
		
		int contador = 0;
		System.out.println("Lista de numeros");
		for(int array : arrayList) {
			System.out.println("valor de i:"+array );
			contador ++;
		}
		
		System.out.println("Quantidade de registros: "+ contador);
	}

}
