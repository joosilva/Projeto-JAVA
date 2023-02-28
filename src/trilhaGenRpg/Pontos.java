package trilhaGenRpg;

public class Pontos extends Valores {
	
	private String tipo;
	
	public Pontos (String tipo, int valor) {
		super(valor);
		this.tipo = tipo;
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