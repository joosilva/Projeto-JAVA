package trilhaGenRpg;

public class mainClass {

	public static void main(String[] args) {
		
		Inventario inventario = new Inventario ();
		
        inventario.criarPontos();
        inventario.ganharPontos("Comunicação", 2);
        inventario.ganharPontos("Empatia", 3);
        inventario.ganharPontos("Comunicação", 6);
        inventario.ganharPontos("Trabalho em Equipe", 3);
        inventario.ganharPontos("Comunicação", -1);
        inventario.ganharPontos("Proatividade", 2);
        inventario.imprimirPontos();
        
        inventario.criarItens();
        inventario.ganharMoedas(10);
        inventario.comprarItem(2);
        //inventario.adicionarChave();
        
        if (inventario.verificarMochila("Chave")) {
        	System.out.println("\nVocê tem chave.");
        } else {
        	System.out.println("\nVocê não tem chave.");
        }
        
		
	}

}
