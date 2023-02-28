package trilhaGenRpg;

import java.util.List;

public interface Repository {
	
	public void criarPontos();
	
	public List<Pontos> ganharPontos(String tipoPonto, int quantidadePontos);

	public void imprimirPontos();
	
	public int ganharMoedas(int valor);

	public List<Item> criarItens();

	public int comprarItem(int identificacao); 
	
	public void adicionarObjeto(String objeto);
	
	public boolean verificarMochila(String item);

}
