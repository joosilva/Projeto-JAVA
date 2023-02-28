package trilhaGenRpg;

public class Item  extends Valores {
	
	private String nome;	
	
	public Item(String nome, int valor) {
		super(valor);
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	

}