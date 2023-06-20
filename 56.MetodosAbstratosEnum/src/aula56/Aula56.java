package aula56;

public class Aula56 {

	public static void main(String[] args) {

		
		
		for (TipoDocumento doc : TipoDocumento.values()) {
			System.out.println(doc + " - " + doc.geraNumeroTeste());
		}
		
		Pessoa pf = new Pessoa();
		pf.setTipoDocumento(TipoDocumento.CPF);
		pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
		System.out.println(pf);
		
		Pessoa pj = new Pessoa();
		pj.setTipoDocumento(TipoDocumento.CNPJ);
		pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
		System.out.println(pj);
		
		
	}

}
