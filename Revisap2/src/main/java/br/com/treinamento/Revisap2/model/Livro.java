package br.com.treinamento.Revisap2.model;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

public class Livro {
	
	public Livro(String titulo, String autor,String emprestimo) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.emprestimo = emprestimo;
	}

	@Getter @Setter
	private String titulo;
	
	@Getter @Setter
	private String autor;
	
	@Getter @Setter
	private String emprestimo;

	@Override
	public int hashCode() {
		return Objects.hash(emprestimo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(emprestimo, other.emprestimo);
	}
	
	
	
}
