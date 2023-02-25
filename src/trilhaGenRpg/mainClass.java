package trilhaGenRpg;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int conversaT,flor,conversaY;
		
		System.out.println("Você é um exploradore, que está em uma jornada em uma cidade interessante, chamada Generation.");
		System.out.println("Você conhece uma pequena criança chamada Thata, ela quer que você se sinta acolhide na cidade.");	
		System.out.println("Deseja conversar com ela? ");
		System.out.println("\n1- Para conversar com Thata.");		
		System.out.println("\n2- Para não conversar com Thata");		
		conversaT = leia.nextInt();
		
		if (conversaT == 1) {
			System.out.println("Você conversa com ela, ela diz muitas coisas gentis para você,");
			System.out.println("diz sobre como você tem muita coragem de sair por aí se aventurando.");
			System.out.println("Ela te diz algo sobre uma caverna, mas você acaba não prestando muita atenção!!");
			System.out.println("Ela te dá uma flor amarela, diz que é para simbolizar a amizade. ");
			System.out.println("Você aceita?");
			System.out.println("\n1- Para aceitar a flor.");		
			System.out.println("\n2- Para não aceitar a flor");	
			// ADICIONE FLOR DA AMIZADE AO INVENTÁRIO.
			//ADICIONAR 1 PONTO EM COMUNICAÇÃO

			flor = leia.nextInt();
		if (flor == 1) {
				System.out.println("Você agradece pela flor e a guarda com você");
				
		}else {
				System.out.println("Você recusa com a desculpa que não teria como preservá-la, o que não é verdade...");
			}
		}else {
			System.out.println("\nLets'go!! Seguindo para fase 2 . . . ");
		}
	
	      System.out.println("\nVocê continua andando pela cidade, passa por algumas pessoas que são bem amigáveis,"); 
		  System.out.println("até que encontra um homem chamado Yuri.");
		  System.out.println("Deseja conversar com ele?");
		  System.out.println("\n1- Para aceitar conversar com yuri.");	
		  System.out.println("\n2- Para não conversar com Yuri.");
		  conversaY =leia.nextInt();
		 
		 if (conversaY == 1) {
			 System.out.println("ele pergunta se você é novo na cidade, você responde que sim, ");
			 System.out.println("quando é perguntado sobre o que faz aqui responde que está em busca de um pergaminho antigo,");
			 System.out.println("chamado Java, ele responde que conhece tudo sobre o pergaminho, mas");
			 System.out.println("que não poderia acompanhar na sua aventura, mas te dá muitas informações úteis,");
			 System.out.println(" comenta sobre um labirinto e também te dá uma moeda, e diz que você");
			 System.out.println("vai usar na loja do Luís. Você continua caminhando.");
			 //ADICIONAR UMA MOEDA AO INVENTÁRIO
			// ADICIONAR 1 PONTO EM COMUNICAÇÃO

		 }else {
			 
			 System.out.println("\nPoxa vida!, Seguindo para fase 3 . . .");
			 
		 }
		  
		
	
	
	
	}
	

}
