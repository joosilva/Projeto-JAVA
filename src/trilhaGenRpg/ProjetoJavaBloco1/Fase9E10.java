package ProjetoJavaBloco1;

public class Fase9E10 {

	public static void main(String[] args) {
	
		System.out.println("\nVocê sabe que está chegando ao fim de uma aventura, porém ainda há mais um desafio. Você está na entrada de um labirinto e sabe que dentro tem o que procura. Você entra.");
		
		if(inventario.contains(mapa)) {
			System.out.println("\nVocê lembra que tem um mapa desse labirinto, seguindo minuciosamente você se depara com um altar.");
			if(inventario.contains(chave)) {
				System.out.println("\nVocê coloca a chave que Camis deu para você e abre o altar, dentro dele há uma estátua segurando o pergaminho java que você rapidamente pega.\r\n"
						+ "Sua jornada chegou ao fim, você lembra que sem as pessoas no seu caminho nada disso seria possível, você é muito grate à elas. Voltando para a cidade você vê todos os seus amigos, eles estão felizes em te ver de volta, mas você está mais ainda por ter os conhecido.\r\n"
						+ "");
				System.out.println("\nFim de jogo. Você fez "+pontos+" e fez o final 2.");
				System.exit(0);
			
			}
			else {
				System.out.println("\nVocê percebe que não tem nada para abrir o altar, com raiva você sai do labirinto, e continua a sua jornada. Você percebe que talvez as pessoas da cidade possam te ajudar, mas você pensa que já é tarde demais para isso.");
			}
		}
		
		else {
			System.out.println("\nVocê anda muito tempo no labirinto e se perde, eventualmente acha uma saída mas não acha o que estava procurando. Um mapa seria bom, mas o que se pode fazer.");
			System.out.println("\nFim de jogo. Você fez "+pontos+" e fez o final 1.");
			System.exit(0);
		
		}

	}

}
