package br.com.treinamento.abstrato;

public class Principal {

	public static void main(String[] args) {
		
		NuvemBrods nuvem = new NuvemBrods();
		nuvem.setNomeImagem("foto_perfil.pnj");
		
		String base64 = nuvem.converteBase64(nuvem.getNomeImagem());
		
		nuvem.upload(base64);

		System.out.println(nuvem.getNomeImagem());
	}

}
