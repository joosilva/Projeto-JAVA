package trilhaGenRpg;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

	private List<String> mochila = new ArrayList<String>();
	private List<Item> itens = new ArrayList<Item>();
	private List<Pontos> pontuacao = new ArrayList<Pontos>();
	private int moedas = 2;
	private String objeto;

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public List<Pontos> getPontos() {
		return pontuacao;
	}

	public void setPontos(List<Pontos> pontos) {
		this.pontuacao = pontos;
	}

	public int getMoedas() {
		return moedas;
	}

	public void setMoedas(int moedas) {
		this.moedas = moedas;
	}

	public List<String> getMochila() {
		return mochila;
	}

	public void setMochila(List<String> mochila) {
		this.mochila = mochila;
	}

	public List<Pontos> getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(List<Pontos> pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public void criarPontos() {
		Pontos comunicacao = new Pontos("Comunicação", 0);
		Pontos proatividade = new Pontos("Proatividade", 0);
		Pontos orientacaoAoDetalhe = new Pontos("Orientação ao Detalhe", 0);
		Pontos responsabilidadePessoal = new Pontos("Responsabilidade Pessoal", 0);
		Pontos empatia = new Pontos("Empatia", 0);
		Pontos trabalhoEmEquipe = new Pontos("Trabalho em Equipe", 0);

		pontuacao.add(comunicacao);
		pontuacao.add(proatividade);
		pontuacao.add(orientacaoAoDetalhe);
		pontuacao.add(responsabilidadePessoal);
		pontuacao.add(empatia);
		pontuacao.add(trabalhoEmEquipe);

	}
	
	public List<Pontos> ganharPontos(String tipoPonto, int quantidadePontos) {
		
		switch (tipoPonto) {
		case "Comunicação":
			pontuacao.get(0).setValor(pontuacao.get(0).getValor() + quantidadePontos);
			break;
		case "Proatividade":
			pontuacao.get(1).setValor(pontuacao.get(1).getValor() + quantidadePontos);
			break;
		case "Orientação ao Detalhe":
			pontuacao.get(2).setValor(pontuacao.get(2).getValor() + quantidadePontos);
			break;
		case "Responsabilidade Pessoal":
			pontuacao.get(3).setValor(pontuacao.get(3).getValor() + quantidadePontos);
			break;
		case "Empatia":
			pontuacao.get(4).setValor(pontuacao.get(4).getValor() + quantidadePontos);
			break;
		case "Trabalho em Equipe":
			pontuacao.get(5).setValor(pontuacao.get(5).getValor() + quantidadePontos);
			break;
		
		}
		
		return pontuacao;

	}

	public void imprimirPontos() {
		System.out.println("\nVocê finalizou com um total de:");

		for (int i = 0; i < pontuacao.size(); i++) {
			System.out.println("\n" + pontuacao.get(i).getValor() + " pontos em " + pontuacao.get(i).getTipo() + ".");
			if (pontuacao.get(i).getValor() <= 2) {
				System.out.println("Você precisa melhorar sua habilidade de " + pontuacao.get(i).getTipo() + "...");
			} 
		}

	}
	
	public int ganharMoedas(int valor) {
		int moedas = this.moedas + valor;
		setMoedas(moedas);
		System.out.println("\nParabéns! Você ganhou " + valor + " moedas e agora possui " + moedas + " moedas!");
		return moedas;
	}

	public List<Item> criarItens() {
		Item pocao = new Item("Poção Estranha", 3);
		Item pingente = new Item("Pingente de Mangual", 5);
		Item mangual = new Item("Mangual", 10);
		Item mapa = new Item("Mapa do Labirinto", 15);

		itens.add(pocao);
		itens.add(pingente);
		itens.add(mangual);
		itens.add(mapa);

		return itens;
	}

	public int comprarItem(int identificacao) {
		Item objeto = itens.get(identificacao - 1);
		int moedas = this.moedas, valor = objeto.getValor();

		if (moedas < valor) {

			System.out.println("\nVocê não possui moedas suficientes para comprar esse item.");

		} else {

			setMoedas(moedas -= valor);
			System.out.println("\n" + objeto.getNome() + " foi adicionado ao seu inventário." + 
			"\nVocê ainda possui " + moedas	+ " moedas.");
			mochila.add(objeto.getNome());
		}

		return moedas;
	}
	
	public void adicionarObjeto(String objeto) {
		mochila.add(objeto);
	}
	
	public boolean verificarMochila(String item) {
		boolean existe;
		
		if (mochila.contains(item)) {
			existe = true;
		} else {
			existe = false;
		}
			
		return existe;
	}
	

}
