package aula60;

public class Aula60 {

	public static void main(String[] args) {
		
		EscopoVariaveis escopo = new EscopoVariaveis();
		
		escopo.setValor(10);
		
		System.out.println(escopo.getValor());
		
		System.out.println(escopo.calculaValor(20));
		
		System.out.println(escopo.getValor());
		

	}

}
