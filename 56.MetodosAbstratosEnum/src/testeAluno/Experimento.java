package testeAluno;

import aula56.Pessoa;
import aula56.TipoDocumento;

public class Experimento {

	public static void main(String[] args) {
		
		TipoDocumento[] documentos = TipoDocumento.values();
		Pessoa[] pessoas = new Pessoa[documentos.length];
		
		for(int i=0; i < documentos.length; i++) {
			pessoas[i] = new Pessoa();
			pessoas[i].setTipoDocumento(documentos[i]);
			pessoas[i].setNumeroDocumento(pessoas[i].getTipoDocumento().geraNumeroTeste());
			System.out.println(pessoas[i]);
		}
		
	}

}
