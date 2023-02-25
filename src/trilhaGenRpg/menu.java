package trilhaGenRpg;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao = 2, opcaoSobre, opcaoSair;

		while (opcao > 1 && opcao < 4) {
			System.out.println("\n  ( )_      _(_ )( )");
			System.out.println("  |  _)_ __(_)| || |__    _ _      __    __   ___");
			System.out.println("  | | (  __) || ||  _  \\/ _  )   / _  \\/ __ \\  _  \\");
			System.out.println("  | |_| |  | || || | | | (_| |  ( (_) |  ___/ ( ) |");
			System.out.println("   \\__)_)  (_)___)_) (_)\\__ _)   \\__  |\\____)_) (_)");
			System.out.println("                                ( )_) |");
			System.out.println("                                 \\___/");
			System.out.println("\n\t\t     BEM-VINDE!\nEstá pronte para embarcar nessa jornada pelo mundo Gen?"
					+ "\n\t\t1 - INICIAR O JOGO\n\t2 - Sobre\t\t3 - Sair"
					+ "\n________________________________________________________\nDigite a opção desejada:");
			opcao = leia.nextInt();

			while (opcao < 1 || opcao > 3) {
				System.out.println("Ops... Essa opção é inválida.\nDigite novamente:");
				opcao = leia.nextInt();
			}

			switch (opcao) {
			case 2:
				System.out.println("\n<= VOLTAR AO MENU (Digite 0)\nEste é um jogo RPG onde nosso personagem principal, você, tem tomadas de decisões diante de diversos"
						+ "\ncenários em um mundo cheio de descobertas e aventuras chamado GeneratiON."
						+ "\n\nVOCÊ ESTÁ PRONTE!?"
						+ "\n\n\t\tIdealização e Roteiro:\n\t\t     ANA SOPHIA\n\n\t\t   Código Fonte:\n\n\t  Criação e implementação de métodos:\n\t\t JOÃO VICTOR MENDES"
						+ "\n\n\t   Execução das tomadas de decisão:\n\t\t     ANA SOPHIA\n\t\t  ELISSANDRO ABREU"
						+ "\n\t\t    GIULIA FARIA\n\t\t       JAINNA\n\t\t JOÃO VITOR MOLINARI"
						+ "\n\n\t\t  Criação do menu:\n\t\t JOÃO VICTOR MENDES"
						+ "\n\n<= VOLTAR AO MENU (Digite 0)");
				opcaoSobre = leia.nextInt();
				
				while (opcaoSobre != 0) {
					System.out.println("Ops... Essa opção é inválida.\nDigite novamente:");
					opcaoSobre = leia.nextInt();
				}
			    break;
			case 3:
				System.out.println("\nAh... Não vai, não... :/ \nTem certeza que deseja sair?\n1 - SIM\n2 - NÃO");
				opcaoSair = leia.nextInt();
				
				while (opcaoSair < 1 || opcaoSair > 2) {
					System.out.println("Ops... Essa opção é inválida.\nDigite novamente:");
					opcaoSair = leia.nextInt();
				}
				if(opcaoSair == 1) {
					opcao = 0;
					System.out.println("Tudo bem... Não demore a voltar!");
				} 
				break;
			}
		
		}
		
		if (opcao == 1) {
			
			
			
		}
						
		
	}

}
