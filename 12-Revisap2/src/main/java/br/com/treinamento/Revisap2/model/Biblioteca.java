package br.com.treinamento.Revisap2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Biblioteca {

	@Getter @Setter
	private Livro livro;
	
	@Getter @Setter
	private Usuario usuario;

	public void getLivro(Livro livro1) {
	}

	public void getUsuario(Usuario usuario1) {
	}
	
	public Boolean emprestrar (){
		
		return true;
	}
	
	public Boolean devolver (){
		
		return true;
	}
}
	
