package trilhaGenRpg;

public class Pontos {
	
	private String tipo;
	private int valor = 0;
	
	public Pontos (String tipo, int valor) {
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
}