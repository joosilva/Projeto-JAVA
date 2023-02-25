package trilhaGenRpg;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		boolean conversaThatha=true;
		int entrar,caminho,bau;
		
		if (conversaThatha == true) {
			
			System.out.println("Andando pela cidade você vê uma gruta estranha, você lembra sobre Thata comentar que havia algo lá dentro. \nPode ser uma boa ideia entrar.");
			System.out.println("1 - Entrar na gruta estranha.");
			System.out.println("2 - Não entrar na gruta estranha.");
			entrar = leia.nextInt();	
			
		}	else {
			
			System.out.println("Andando pela cidade você vê uma gruta estranha, é bem assustadora.\nSerá que tem algo lá dentro?");
			System.out.println("1 - Entrar na gruta estranha.");
			System.out.println("2 - Não entrar na gruta estranha.");
			entrar = leia.nextInt();
		}
		
		if (entrar==1) {
			
			System.out.println("Você entrar na gruta, depois de caminhar um pouco você se depara com dois caminhos.");
			System.out.println("O caminho da esquerda tem algumas pegadas.\nO caminho da direita não tem pegadas.\nPor qual caminho gostaria de seguir?");
			System.out.println("1 - Ir pelo caminho da esqueda.");
			System.out.println("2 - Ir pelo caminho da direita.");
			caminho = leia.nextInt();
			
			if (caminho==1) {
				
				System.out.println("Indo um pouco a fundo na gruta você encontra um esqueleto sentado com um baú.");
				System.out.println("O baú esá meio quebrado mas você vê algo brilhando.\nAbrir o baú?");
				System.out.println("1 - Sim\n2 - Não");
				bau = leia.nextInt();
				if (bau == 1) {
					
					System.out.println("O baú estava cheio de moedas, com um bilhete escrito\n'Para quem encontrar o meu tesouro, a este pertencerá.'");
					System.out.println("Você pega as moedas e sai da caverna.");
					//adicionar 15 moedas ao inventário
					//adicionar +2 em orientação ao detalhe
				} else {
					System.out.println("Você achou melhor não mexer nos pertences de um esqueleto e decidiu sair da caverna.");
				}
			} else {
				System.out.println("A caverna não levou a lugar nenhum, você se frusta e sai da caverna sem procurar mais.");
				//-1 em orientação ao detalhe
			}
			
		} else { 
			System.out.println("Você acha melhor não entrar na gruta estranha e assustadora.");
		}
		
	}

}
