package aula61;

public class Aula61 {

	public static void main(String[] args) {
		
		Contato contato = new Contato("Contato 1","1234-4567","contato@email");
		int valor = 10;
		
		System.out.println(contato);
		System.out.println(valor);
		
		testePassagemValorReferencia(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
		testePassagemValorReferencia2(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
	}
	
	private static void testePassagemValorReferencia(int valor, Contato contato) {
		
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato = new Contato("Contato 2", "2345-6789","contato@email.com");
		
	}
	
	private static void testePassagemValorReferencia2(int valor, Contato contato) {
		
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato.setNome("Contato"+novoValor);
	}

}
