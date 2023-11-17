package br.com.treinamento;

public class SwitchCase {

	public static void main(String[] args) {
		
		int diaSemana = 4;
		
		String diaSemanaTexto = "";
		
		switch (diaSemana) {
		case 1:
			diaSemanaTexto = "Segunda-Feira";			
			break;
			
		case 2:
			diaSemanaTexto = "Terça-Feira";			
			break;
			
		case 3:
			diaSemanaTexto = "Quarta-Feira";			
			break;
			
		case 4:
			diaSemanaTexto = "Quinta-Feira";			
			break;
			
		case 5:
			diaSemanaTexto = "Sexta-Feira";			
			break;
			
		case 6:
			diaSemanaTexto = "Sabado";			
			break;
			
		case 7:
			diaSemanaTexto = "Domingo";			
			break;

		default:
			diaSemanaTexto = "Dia inválido";
			break;
		}
		
		System.out.println(diaSemanaTexto);		

	}

}
