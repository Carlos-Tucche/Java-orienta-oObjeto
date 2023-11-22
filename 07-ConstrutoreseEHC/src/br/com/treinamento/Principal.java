package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoaA = new Pessoa();
		pessoaA.setNome("Carlos");
		pessoaA.setIdade(43);
		
		Pessoa pessoaB = new Pessoa();
		pessoaB.setNome("Carlos");
		pessoaB.setIdade(43);
		
		System.out.println("Pessoa A é igual a pessoa B? "+ (pessoaA == pessoaB));//false
		
		System.out.println("Pessoa A é igual a pessoa B? "+ pessoaA.equals(pessoaB));//true
		
		System.out.println("Hash pessoa A: "+ pessoaA.hashCode());//
		
		System.out.println("Hash pessoa B: "+ pessoaB.hashCode());
	}
}
