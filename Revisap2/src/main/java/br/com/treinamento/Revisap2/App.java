package br.com.treinamento.Revisap2;

import br.com.treinamento.Revisap2.model.Biblioteca;
import br.com.treinamento.Revisap2.model.Livro;
import br.com.treinamento.Revisap2.model.Usuario;
import lombok.ToString;

@ToString
public class App 
{
    public static void main( String[] args )
    {
    	Usuario usuario1 = new Usuario("Carlos", 43, 9123456, "cad@gmail.com");
    	Livro livro1 = new Livro("Braz Cubas", "Machado de Assis", "Disponivel");
    	Livro livro2 = new Livro("O Cortiço","Aluizio de Azevedo", "Emprestado");
    	
    	Biblioteca biblioteca = new Biblioteca();
    	biblioteca.getUsuario(usuario1);
    	biblioteca.getLivro(livro1);
    	
    	System.out.println("O livro "+ livro1.getTitulo()+" esta "+ livro1.getEmprestimo());
    	System.out.println("O livro "+ livro2.getTitulo()+" foi emprestado para "+usuario1.getNome());
    	
    }
}
