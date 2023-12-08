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
    	Livro livro1 = new Livro("Braz Cubas", "Machado de Assis", false);
    	
    	Biblioteca biblioteca = new Biblioteca();
    	biblioteca.setUsuario(usuario1);
    	biblioteca.setLivro(livro1);

    	
    }
}
