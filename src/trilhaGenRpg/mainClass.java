package trilhaGenRpg;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		List<Item> itensComprados = new ArrayList<Item>();

		int opcao = 2, opcaoSobre = 0, opcaoSair = 0;

		boolean loop = true;

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
					+ "\n________________________________________________________");

			do {
				try {
					System.out.println("\nDigite o número da opção desejada:");
					opcao = leia.nextInt();
					
					while (opcao < 1 || opcao > 3) {
						System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
						opcao = leia.nextInt();
					}
					
					loop = false;

				} catch (InputMismatchException erro) {
					System.out.println(
							"Ops... Parece que você tentou escrever uma palavra, digite apenas o número da opção desejada.");
					leia.nextLine();
					loop = true;
				}
			} while (loop);


			switch (opcao) {
			case 2:
				System.out.println(
						"\n<= VOLTAR AO MENU (Digite 0)\nEste é um jogo RPG onde nosso personagem principal, você, tem tomadas de decisões diante de diversos"
								+ "\ncenários em um mundo cheio de descobertas e aventuras chamado GeneratiON."
								+ "\n\nVOCÊ ESTÁ PRONTE!?"
								+ "\n\n\t\tIdealização e Roteiro:\n\t\t     ANA SOPHIA\n\n\t\t   Código Fonte:\n\n\t  Criação e implementação de métodos:\n\t\t JOÃO VICTOR MENDES"
								+ "\n\n\t   Execução das tomadas de decisão:\n\t\t     ANA SOPHIA\n\t\t  ELISSANDRO ABREU"
								+ "\n\t\t    GIULIA FARIA\n\t\t       JAINNA\n\t\t JOÃO VITOR MOLINARI"
								+ "\n\n\t\t  Criação do menu:\n\t\t JOÃO VICTOR MENDES");

				do {
					try {
						System.out.println("\n\n<= VOLTAR AO MENU (Digite 0)");
						opcaoSobre = leia.nextInt();

						while (opcaoSobre != 0) {
							System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
							opcaoSobre = leia.nextInt();
						}
						
						loop = false;

					} catch (InputMismatchException erro) {
						System.out.println(
								"Ops... Parece que você tentou escrever uma palavra, digite apenas o número da opção desejada.");
						opcaoSobre = leia.nextInt();
					}
				} while (loop);

				break;
			case 3:
				do {
					try {
						System.out.println("\nAh... Não vai, não... :/ \nTem certeza que deseja sair?\n1 - SIM\n2 - NÃO");
						opcaoSair = leia.nextInt();
						
						while (opcaoSair < 1 || opcaoSair > 2) {
							System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
							opcaoSair = leia.nextInt();
						}
						
						loop = false;

					} catch (InputMismatchException erro) {
						System.out.println(
								"Ops... Parece que você tentou escrever uma palavra, digite apenas o número da opção desejada.");
						opcaoSair = leia.nextInt();
					}
				} while (loop);
				
				

				if (opcaoSair == 1) {
					opcao = 0;
					System.out.println("Tudo bem... Não demore a voltar!");
				}
				break;
			}

		}

		while (opcao == 1) {

			Inventario acao = new Inventario();
			acao.criarPontos();

			int decisao = 0;
			boolean conversaThata = false;

			System.out.println(
					"\nVocê é um exploradore, que está em uma jornada em uma cidade interessante, chamada Generation.");
			System.out.println(
					"Você conhece uma pequena criança chamada Thata, ela quer que você se sinta acolhide na cidade.");
			System.out.println("Deseja conversar com ela? ");
			
			do {
				try {
					System.out.println("\n1- Para conversar com Thata.");
					System.out.println("\n2- Para não conversar com Thata");
					decisao = leia.nextInt();

					while (decisao < 1 || decisao > 2) {
						System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
						decisao = leia.nextInt();
					}
					
					loop = false;

				} catch (InputMismatchException erro) {
					System.out.println(
							"Ops... Parece que você tentou escrever uma palavra, digite apenas o número da opção desejada.");
					leia.nextLine();
					loop = true;
				}
			} while (loop);

			if (decisao == 1) {

				conversaThata = true;
				acao.ganharPontos("Comunicação", 1);

				System.out.println("Você conversa com ela, ela diz muitas coisas gentis para você,");
				System.out.println("diz sobre como você tem muita coragem de sair por aí se aventurando.");
				System.out.println("Ela te diz algo sobre uma caverna, mas você acaba não prestando muita atenção!!");
				System.out.println("Ela te dá uma flor amarela, diz que é para simbolizar a amizade. ");
				System.out.println("Você aceita?");
				System.out.println("\n1- Para aceitar a flor.");
				System.out.println("\n2- Para não aceitar a flor");
				decisao = leia.nextInt();

				while (decisao < 1 || decisao > 2) {
					System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
					decisao = leia.nextInt();
				}

				if (decisao == 1) {
					System.out.println("Você agradece pela flor e a guarda com você");
					acao.adicionarObjeto("Flor da Amizade");

				} else {
					System.out.println(
							"Você recusa com a desculpa que não teria como preservá-la, o que não é verdade...");
				}
			}

			System.out.println("\nVocê continua andando pela cidade, passa por algumas pessoas que são bem amigáveis,");
			System.out.println("até que encontra um homem chamado Yuri.");
			System.out.println("Deseja conversar com ele?");
			System.out.println("\n1- Para aceitar conversar com yuri.");
			System.out.println("\n2- Para não conversar com Yuri.");
			decisao = leia.nextInt();

			while (decisao < 1 || decisao > 2) {
				System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
				decisao = leia.nextInt();
			}

			if (decisao == 1) {
				System.out.println("\nEle pergunta se você é novo na cidade, você responde que sim, ");
				System.out.println(
						"quando é perguntado sobre o que faz aqui responde que está em busca de um pergaminho antigo,");
				System.out.println("chamado Java, ele responde que conhece tudo sobre o pergaminho, mas");
				System.out.println("que não poderia acompanhar na sua aventura, mas te dá muitas informações úteis,");
				System.out.println(" comenta sobre um labirinto e também te dá uma moeda, e diz que você");
				System.out.println("vai usar na loja do Luís. Você continua caminhando.");
				acao.ganharPontos("Comunicação", 1);
				acao.ganharMoedas(1);

			}

			if (conversaThata) {

				System.out.println(
						"Andando pela cidade você vê uma gruta estranha, você lembra sobre Thata comentar que havia algo lá dentro."
								+ " \nPode ser uma boa ideia entrar.");
			} else {
				System.out.println(
						"Andando pela cidade você vê uma gruta estranha, é bem assustadora.\nSerá que tem algo lá dentro?");
			}

			System.out.println("\n1 - Entrar na gruta estranha...\n2 - Continuar seu caminho");
			decisao = leia.nextInt();

			while (decisao < 1 || decisao > 2) {
				System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
				decisao = leia.nextInt();
			}

			if (decisao == 1) {

				System.out
						.println("Você entra na gruta, depois de caminhar um pouco você se depara com dois caminhos.");
				System.out.println(
						"O caminho da esquerda tem algumas pegadas.\nO caminho da direita não tem pegadas.\nPor qual caminho gostaria de seguir?");
				System.out.println("1 - Ir pelo caminho da esqueda.");
				System.out.println("2 - Ir pelo caminho da direita.");
				decisao = leia.nextInt();

				while (decisao < 1 || decisao > 2) {
					System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
					decisao = leia.nextInt();
				}

				if (decisao == 1) {

					System.out.println("Indo um pouco a fundo na gruta você encontra um esqueleto sentado com um baú.");
					System.out.println("O baú esá meio quebrado mas você vê algo brilhando.\nAbrir o baú?");
					System.out.println("1 - Sim\n2 - Não");
					decisao = leia.nextInt();

					while (decisao < 1 || decisao > 2) {
						System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
						decisao = leia.nextInt();
					}

					if (decisao == 1) {

						System.out.println(
								"O baú estava cheio de moedas, com um bilhete escrito\n'Para quem encontrar o meu tesouro, a este pertencerá.'");
						System.out.println("Você pega as moedas e sai da caverna.");
						acao.ganharMoedas(15);
						acao.ganharPontos("Orientação ao Detalhe", 4);

					} else {
						System.out.println(
								"Você achou melhor não mexer nos pertences de um esqueleto e decidiu sair da caverna.");
					}
				} else {
					System.out.println(
							"A caverna não levou a lugar nenhum, você se frusta e sai da caverna sem procurar mais.");
					acao.ganharPontos("Orientação ao Detalhe", -1);
				}

			} else {
				System.out.println("Você acha melhor não entrar na gruta estranha e assustadora.");
			}

			int item;

			System.out.println(
					"Andando pela cidade você se depara com uma loja, na frente há uma placa que diz “Vendinha do Luís”.");
			System.out.println("Deseja entrar?");
			System.out.println("1 - Sim \n2 - Não");
			decisao = leia.nextInt();

			while (decisao < 1 || decisao > 2) {
				System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
				decisao = leia.nextInt();
			}

			if (decisao == 1) {
				System.out.println(
						"Lá você encontra um comerciante muito simpático, ele diz para você dar uma olhada nos itens.");
				System.out.println("Você diz que é um aventureiro e ele diz que tem algo para te ajudar.");
				System.out.println("Você realmente quer um pingente de mangual e um mangual novo.");
				System.out.println();

				acao.criarItens();

				do {

					for (int i = 0; i < acao.getItens().size(); i++) {
						System.out.println((i + 1) + " - " + acao.getItens().get(i).getNome() + ", "
								+ acao.getItens().get(i).getValor() + " moedas.");
					}

					System.out.println();
					System.out.println("Digite a identificação do item que quer comprar:");
					item = leia.nextInt();

					while (item < 1 || item > 4) {
						System.out.println("Ops... Esse item não existe.\n\nDigite novamente:");
						item = leia.nextInt();
					}

					acao.comprarItem(item);

					Item pocao = new Item("Poção Estranha", 0);
					Item pingente = new Item("Pingente de Mangual", 0);
					Item mangual = new Item("Mangual", 0);
					itensComprados.add(pocao);
					itensComprados.add(pingente);
					itensComprados.add(mangual);

					if (item != 4) {
						itensComprados.get(item - 1).setValor(itensComprados.get(item - 1).getValor() + 1);
					}

					System.out.println("Deseja comprar algo mais?\n1 - Sim \n2 - Não");
					decisao = leia.nextInt();

					while (decisao < 1 || decisao > 2) {
						System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
						decisao = leia.nextInt();
					}

				} while (decisao == 1);
				System.out.println("Luís agradece a você pelas compras!...");

				if (acao.verificarMochila("Mapa")) {
					acao.ganharPontos("Responsabilidade Pessoal", 3);
				} else if (!acao.verificarMochila("Mapa")) {
					acao.ganharPontos("Responsabilidade Pessoal", -2);
				}

			} else {
				System.out.println("Andando mais pela cidade você encontra um homem muito bravo que esbarra em você.");
				System.out.println("Deseja enfrentá-lo ou acalmá-lo?");
				System.out.println();
				System.out.println("1 - ENFRENTÁ-LO \n2 - ACALMÁ-LO");
				decisao = leia.nextInt();

				while (decisao < 1 || decisao > 2) {
					System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
					decisao = leia.nextInt();
				}

				if (decisao == 1) {
					System.out.println("Vocês começam a discutir sobre quem está errado nessa situação.");
					System.out.println("Gritos e xingamentos ecoam pela cidade.");
					System.out.println("Nada de produtivo foi extraído disso.");
					acao.ganharPontos("Comunicação", -3);

				} else {
					acao.ganharPontos("Comunicação", 3);
					acao.ganharPontos("Empatia", 3);
					System.out.println(
							"Você de forma calma e gentil usa as técnicas não violentas que uma monja chamada Lélia havia lhe ensinado.");
					System.out.println(
							"O homem feliz por tê-lo acalmado lhe dá uma flor vermelha, e diz que simboliza que não será mais violento a partir deste momento.");
					System.out.println("Você aceita?");
					System.out.println();
					System.out.println("1 - SIM \n2 - NÃO");
					decisao = leia.nextInt();

					while (decisao < 1 || decisao > 2) {
						System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
						decisao = leia.nextInt();
					}

					if (decisao == 1) {
						acao.adicionarObjeto("Flor da Paz");
						System.out.println("Você aceita a flor e continua seu caminho.");
						acao.ganharPontos("Comunicação", 1);
						acao.ganharPontos("Empatia", 1);
					} else {
						System.out.println("Você diz que a verdadeira paz está dentro de nós e segue andando...");
						System.out.println("Você deveria ter aceitado.");
						acao.ganharPontos("Comunicação", -1);
						acao.ganharPontos("Empatia", -1);
					}
				}
			}

			System.out.println("Você está em sua jornada quando um homem lhe pede ajuda,\n"
					+ "ele quer que você o ajude a carregar um fardo, pois está muito pesado.");
			System.out.println("Ajudar?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");

			decisao = leia.nextInt();

			while (decisao < 1 || decisao > 2) {
				System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
				decisao = leia.nextInt();
			}

			if (decisao == 1) {
				System.out.println(
						"Você ajuda o homem a carregar o fardo, que realmente era muito pesado para uma só pessoa.\n"
								+ "Após isso o homem te agradece muito, e te dá uma flor azul, diz que representa o trabalho em equipe.");
				System.out.println("Você aceita?");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");

				decisao = leia.nextInt();

				while (decisao < 1 || decisao > 2) {
					System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
					decisao = leia.nextInt();
				}

				if (decisao == 1) {
					acao.adicionarObjeto("Flor do Trabalho em Equipe");
					acao.ganharPontos("Trabalho em Equipe", 3);

				} else if (decisao == 2) {
					System.out
							.println("Você não consegue pensar em uma desculpa convincente, recusa e continua andando."
									+ "Talvez não aceitar tenha sido uma má ideia");
					acao.ganharPontos("Trabalho em Equipe", 3);
				}
			}

			System.out.println(
					"Você encontra uma mulher feiticeira chamada Camis, ela diz que se você tiver todas as flores da cidade, "
							+ "ela lhe entregará um item muito útil para sua jornada para encontrar o pergaminho Java. Como ela sabe disso?");
			System.out.println("Confiar em Camis e entregar as flores?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");

			decisao = leia.nextInt();

			while (decisao < 1 || decisao > 2) {
				System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
				decisao = leia.nextInt();
			}

			if (decisao == 1) {
				if (acao.verificarMochila("Flor da Amizade") || acao.verificarMochila("Flor da Paz")
						|| acao.verificarMochila("Flor do Trabalho em Equipe")) {
					System.out.println(
							"Camis diz que você não é uma pessoa que sabe o valor das flores, e disse que para dominar Java teria que aprender mais."
									+ "Ela te dá um livrinho curto que fala sobre trabalho em equipe, comunicação não violenta e amizade e uma chave."
									+ "Logo após isso ela simplesmente desaparece. Que estranho.");
				} else if (acao.verificarMochila("Flor da Amizade") && acao.verificarMochila("Flor da Paz")
						&& acao.verificarMochila("Flor do Trabalho em Equipe")) {
					System.out.println(
							"Camis pega as flores e te entrega uma chave, antes que você se dê conta, ela desaparece. Que estranho.");
					acao.adicionarObjeto("Chave");
				}

			} else {
				System.out.println("Você diz a Camis que não tem nenhuma flor, ela parece desapontada, "
						+ "ela diz que você terá que aprender muitas coisas antes de dominar java,"
						+ "ela simplesmente desaparece depois disso. Que estranho.");
			}

			System.out.println("\nVocê sabe que está chegando ao fim de uma aventura, porém ainda há mais um desafio. "
					+ "Você está na entrada de um labirinto e sabe que dentro tem o que procura. Você entra.");

			if (acao.verificarMochila("Mapa")) {
				System.out.println(
						"\nVocê lembra que tem um mapa desse labirinto, seguindo minuciosamente você se depara com um altar.");
				if (acao.verificarMochila("Chave")) {
					System.out.println("\nVocê coloca a chave que Camis deu para você e abre o altar, "
							+ "dentro dele há uma estátua segurando o pergaminho java que você rapidamente pega.\r\n"
							+ "Sua jornada chegou ao fim, você lembra que sem as pessoas no seu caminho nada disso seria possível, "
							+ "você é muito grate à elas. Voltando para a cidade você vê todos os seus amigos, "
							+ "eles estão felizes em te ver de volta, mas você está mais ainda por ter os conhecido.\r\n");
					System.out.println("\nFim de jogo!");
					acao.imprimirPontos();

					System.out.println("Deseja refazer sua aventura?\n1 - Sim\n2 - Não");
					opcao = leia.nextInt();

					while (opcao < 1 || opcao > 2) {
						System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
						opcao = leia.nextInt();
					}

					if (opcao == 2) {
						System.out.println("Obrigado por jogar.");
					}

				} else {
					System.out.println(
							"\nVocê percebe que não tem nada para abrir o altar, com raiva você sai do labirinto, "
									+ "e continua a sua jornada. Você percebe que talvez as pessoas da cidade possam te ajudar, "
									+ "mas você pensa que já é tarde demais para isso.");

					System.out.println("Deseja refazer sua aventura?\n1 - Sim\n2 - Não");
					opcao = leia.nextInt();

					while (opcao < 1 || opcao > 2) {
						System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
						opcao = leia.nextInt();
					}
					if (opcao == 2) {
						System.out.println("Obrigado por jogar.");
					}
				}
			}

			else {
				System.out.println("\nVocê anda muito tempo no labirinto e se perde, "
						+ "eventualmente acha uma saída mas não acha o que estava procurando. "
						+ "Um mapa seria bom, mas o que se pode fazer se você tem apenas:");
				for (int i = 0; i < itensComprados.size(); i++) {
					if (itensComprados.get(i).getValor() > 0) {
						System.out.println(
								itensComprados.get(i).getValor() + " " + itensComprados.get(i).getNome() + ".");
					}
				}
				System.out.println("\nFim de jogo!");
				acao.imprimirPontos();

				System.out.println("Deseja refazer sua aventura?\n1 - Sim\n2 - Não");
				opcao = leia.nextInt();

				while (opcao < 1 || opcao > 2) {
					System.out.println("Ops... Essa opção é inválida.\n\nDigite novamente:");
					opcao = leia.nextInt();
				}
				if (opcao == 2) {
					System.out.println("Obrigado por jogar.");
				}

			}

		}

	}

}
