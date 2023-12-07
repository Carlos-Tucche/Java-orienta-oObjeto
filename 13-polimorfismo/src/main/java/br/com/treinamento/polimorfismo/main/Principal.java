package br.com.treinamento.polimorfismo.main;

import br.com.treinamento.polimorfismo.model.Designer;
import br.com.treinamento.polimorfismo.model.EditorVideo;
import br.com.treinamento.polimorfismo.model.Funcionario;
import br.com.treinamento.polimorfismo.model.Gerente;
import br.com.treinamento.polimorfismo.service.ControleBonificacao;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente();
		gerente.setNome("Matheus");
		gerente.setSalario(17000.00);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Ailton");
		funcionario.setSalario(500.00);
		
		Funcionario designer = new Designer();
		designer.setNome("Odilon");
		designer.setSalario(7000.00);
		
		Funcionario editorVideo = new EditorVideo();
		editorVideo.setNome("Leandro");
		editorVideo.setSalario(6000.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(funcionario);
		controle.registra(designer);
		controle.registra(editorVideo);
		
		System.out.println("Valor total da folha R$"+controle.getSoma());
	}

}
