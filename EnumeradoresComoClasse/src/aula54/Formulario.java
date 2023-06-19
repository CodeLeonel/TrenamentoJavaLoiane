package aula54;

public class Formulario {

	enum Genero {
		FEMININO('F'),
		MASCULINO('M');
		
		private char valor;
		
		Genero(char valor) {
			this.valor = valor;
		}
		
		public int getValor() {
			return this.valor;
		}
	}
	
	private String nome;
	private Genero genero;
		
	public Formulario() {
		super();
	}

	public Formulario(String nome, Genero genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
}
