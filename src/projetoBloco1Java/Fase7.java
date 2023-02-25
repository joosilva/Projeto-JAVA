package projetoBloco1Java;

import java.util.ArrayList;
import java.util.Scanner;

public class Fase7 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int respostaFase7, respostaFlorFase7;
		
		System.out.println("Você está em sua jornada quando um homem lhe pede ajuda,\n"
		+ "ele quer que você o ajude a carregar um fardo, pois está muito pesado.");
		System.out.println("Ajudar?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		
		respostaFase7 = leia.nextInt();
		
		
		
		if (respostaFase7 == 1) {
			System.out.println("Você ajuda o homem a carregar o fardo, que realmente era muito pesado para uma só pessoa.\n"
			+ "Após isso o homem te agradece muito, e te dá uma flor azul, diz que representa o trabalho em equipe.");
			System.out.println("Você aceita?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			
			respostaFlorFase7 = leia.nextInt();
			
			if(respostaFlorFase7 == 1) {
				
				//+1 EM TRABALHO EM EQUIPE
				
				//ADICIONAR FLOR TRABALHO EM EQUIPE AO INVENTÁRIO
				
				
			}else if(respostaFlorFase7 == 2) {
				System.out.println("Você não consegue pensar em uma desculpa convincente, recusa e continua andando."
				+ "Talvez não aceitar tenha sido uma má ideia");
			}
			
		}else if (respostaFase7 != 2) {
			System.out.println("Opção inválida");
			
		}
	}
}
