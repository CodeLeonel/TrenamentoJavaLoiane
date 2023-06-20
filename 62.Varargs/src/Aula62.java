
public class Aula62 {

	public static void main(String[] args) {
		
	System.out.println(soma(2,3));
	System.out.println(soma(4,5,6));
	
	int[] vetor = {1,2,3,4,5,6};
	
	System.out.println(soma(vetor));

	System.out.println(soma(10,11,12,13,14,15,16,17,18,19,20));
	
	}
	
	static int soma(int a, int b) {
		return a + b;
	}
	
	static int soma(int a, int b, int c) {
		return a + b + c;
	}
	
	static int soma(int[] vetor) {
		
		int total = 0;
		
		for(int valor : vetor) {
			total += valor;
		}
		
		return total;
	}
	
	// Varargs
	static int soma(Integer... valores) {
		
		int total = 0;
		
		for(int valor : valores) {
			total += valor;
		}
		
		return total;
	}

}
