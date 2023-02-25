package projetoBloco1Java;

import java.util.Scanner;

public class Fase8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int repostaFase8;
		
		System.out.println("Você encontra uma mulher feiticeira chamada Camis, ela diz que se você tiver todas as flores da cidade, "
		+ "ela lhe entregará um item muito útil para sua jornada para encontrar o pergaminho Java. Como ela sabe disso?");
		System.out.println("Confiar em Camis e entregar as flores?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		
		repostaFase8 = leia.nextInt();
		
		
		if(repostaFase8 == 1) {
			//if( TIVER AS TRÊS FLORES NO INVENTÁRIO) {
				
			System.out.println("Camis pega as flores e te entrega uma chave, antes que você se dê conta, ela desaparece. Que estranho.");
			// DELETA AS 3 FLORES DO INVENTARIO
			
			//ADICIONAR CHAVE AO INVENTÁRIO
			
			//}
			
			//else if(TIVER 1 OU 2 FLORES) {
			
			System.out.println("\"Camis diz que você não é uma pessoa que sabe o valor das flores, e disse que para dominar Java teria que aprender mais."
			+ "Ela te dá um livrinho curto que fala sobre trabalho em equipe, comunicação não violenta e amizade e uma chave."
			+ "Logo após isso ela simplesmente desaparece. Que estranho.");
			
			//}
			
			//else {
			System.out.println("Você diz a Camis que não tem nenhuma flor, ela parece desapontada, ela diz que você terá que aprender muitas coisas antes de dominar java,"
			+ "ela simplesmente desaparece depois disso. Que estranho.");
			
		}
		
		

	}

}
