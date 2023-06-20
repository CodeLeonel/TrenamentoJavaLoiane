package aula64;

import aula64.Externa.Interna;

public class Aula64 {

	public static void main(String[] args) {
		
		// Classe Interna
		Externa externa = new Externa();
		Interna interna = externa.new Interna();
		interna.imprimeTexto();
		
		//Classe Local
		Externa2 externa2 = new Externa2();
		externa2.metodoQualquer();
		
		//Classe Anônima
		Externa3 externa3 = new Externa3() {
			public void imprimeTexto() {
				System.out.println("qualquer texto que foi sobrescrito");
			}
		};
		externa3.imprimeTexto();

		//Classe Anonima usando Interface
		Texto texto = new Texto() {
			public void imprimeTexto() {
				System.out.println("qualquer texto - interface");
			}
		};
		texto.imprimeTexto();
		
		/* Exemplos reais
		 * 
		 *  Classe Interna = JPA/Hibernate (chave primária composta)
		 *  
		 *  Classe Local = Swing (actions)
		 * 
		 *  Classe Anônima = Collections (comparar objetos, entre outros)
		 * 
		 * */
		
	}

}
