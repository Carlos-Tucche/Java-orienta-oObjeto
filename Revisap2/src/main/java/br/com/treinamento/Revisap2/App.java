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
    	Livro livro3 = new Livro("A mão e a Luva", "Machado de Assis", "Entregue");
    	
    	Biblioteca biblioteca = new Biblioteca();
    	biblioteca.setUsuario(usuario1);
    	biblioteca.setLivro(livro1);
    	
    	System.out.println("O livro "+ livro1.getTitulo()+" esta: "+ livro1.getEmprestimo());
    	System.out.println("O livro "+ livro2.getTitulo()+" foi emprestado para: "+usuario1.getNome());
    	System.out.println("O livro "+ livro2.getTitulo()+" tem status de: "+ livro2.getEmprestimo());
    	System.out.println("o livro "+ livro3.getTitulo()+" esta com status de: "+ livro3.getEmprestimo());
    }
}
