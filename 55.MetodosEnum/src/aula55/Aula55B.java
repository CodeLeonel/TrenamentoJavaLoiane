package aula55;

public class Aula55B {

	public static void main(String[] args) {
		
		System.out.println(Enum.valueOf(DiaSemanaSimples.class, DiaSemanaSimples.DOMINGO.toString()));
		
		DiaSemanaSimples dia = Enum.valueOf(DiaSemanaSimples.class, "DOMINGO");
		
		System.out.println(dia);

	}

}
