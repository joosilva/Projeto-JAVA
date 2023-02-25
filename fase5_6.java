package fases;

import java.util.Scanner;

public class fase5_6 {

	public static void main(String[] args) {

		int decisao, item;

		Scanner leia = new Scanner(System.in);

		System.out.println(
				"Andando pela cidade você se depara com uma loja, na frente há uma placa que diz “Vendinha do Luís”.");
		System.out.println("Deseja entrar?");
		System.out.println("1 - SIM || 2 - NÃO");
		decisao = leia.nextInt();

		if (decisao == 1) {
			System.out.println(
					"Lá você encontra um comerciante muito simpático, ele diz para você dar uma olhada nos itens.");
			System.out.println("Você diz que é um aventureiro e ele diz que tem algo para te ajudar.");
			System.out.println("Você realmente quer um pingente de mangual e um mangual novo.");
			System.out.println();
			// mostrar a lista e valores dos itens
			System.out.println();
			System.out.println("Digite a identificação do ítem que quer comprar:");
			System.out.println("1 - Poção estranha 2");
			System.out.println("2 - Pingente de mangual ");
			System.out.println("3 - Mangual");
			System.out.println("4 - Mapa de labirinto");
			item = leia.nextInt();

			if (item == 1) {
				// adicionar pocao estranha
			} else if (item == 2) {
				// adicionar pingente de mangual
				// -2 pontos em responsa pessoal
			} else if (item == 3) {
				// adicionar mangual
				// -2 pontos em responsa pessoal
			} else if (item == 4) {
				// adicionar mapa de labirinto
				// +3 em responsa pessoal
			}
		} else {
			System.out.println("Andando mais pela cidade você encontra um homem muito bravo que esbarra em você.");
			System.out.println("Deseja enfrentá-lo ou acalmá-lo?");
			System.out.println();
			System.out.println("1 - ENFRENTÁ-LO || 2 - ACALMÁ-LO");
			decisao = leia.nextInt();

			if (decisao == 1) {
				System.out.println("Vocês começam a discutir sobre quem está errado nessa situação.");
				System.out.println("Gritos e xingamentos ecoam pela cidade.");
				System.out.println("Nada de produtivo foi extraído disso.");
				// -3 pontos em comunicação
			} else {
				System.out.println(
						"Você de forma calma e gentil usa as técnicas não violentas que uma monja chamada Lélia havia lhe ensinado.");
				System.out.println(
						"O homem feliz por tê-lo acalmado lhe dá uma flor vermelha, e diz que simboliza que não será mais violento a partir deste momento.");
				System.out.println("Você aceita?");
				System.out.println();
				System.out.println("1 - SIM || 2 - NÃO");
				decisao = leia.nextInt();

				if (decisao == 1) {
					// adicionar flor da paz no inventario
				} else {
					System.out.println("Você diz que a verdadeira paz está dentro de nós e segue andando...");
					System.out.println("Você deveria ter aceitado.");
					// adicionar 3 pontos em empatia e comunicação
				}
			}

		}

	}

}
