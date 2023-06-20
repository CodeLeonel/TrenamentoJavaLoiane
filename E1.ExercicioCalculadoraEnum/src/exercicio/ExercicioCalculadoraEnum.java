package exercicio;

public class ExercicioCalculadoraEnum {

	public static void main(String[] args) {
		
		double x = 10;
		double y = 50;
		
		CalculadoraEnum[] operacoes = CalculadoraEnum.values();
		
		for(CalculadoraEnum operacao : operacoes) {
			
			System.out.println(x + " " + operacao +" " + y + " = " 
								+ operacao.executarOperacao(x, y));
		
		}
		

	}

}
