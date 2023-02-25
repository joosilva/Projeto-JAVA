package trilhaGenRpg;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		Inventario inventario = new Inventario ();	
		
		inventario.ganharMoedas(10);
		
		System.out.println(inventario.criarItens().get(0).getNome() + inventario.criarItens().get(0).getValor());
		System.out.println("Item 1 - poção\nItem 2 - pingente");
		int opcao = leia.nextInt();
		
		inventario.comprarItem(opcao);
		
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
        //inventario.adicionarObjeto("Chave");
        
        if (inventario.verificarMochila("Chave")) {
        	System.out.println("\nVocê tem chave.");
        } else {
        	System.out.println("\nVocê não tem chave.");
        }
      
	}

}
