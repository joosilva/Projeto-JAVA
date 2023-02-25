package trilhaGenRpg;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

	ArrayList<String> mochila = new ArrayList<String>();
	List<Item> itens = new ArrayList<Item>();
	List<Pontos> pontuacao;
	private int moedas = 2;
	private String florDaAmizade;
	private String florDaPaz;
	private String florDoTrabalhoEmEquipe;
	private String chave;

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

	public ArrayList<String> getMochila() {
		return mochila;
	}

	public void setMochila(ArrayList<String> mochila) {
		this.mochila = mochila;
	}

	public List<Pontos> getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(List<Pontos> pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getFlorDaAmizade() {
		return florDaAmizade;
	}

	public void setFlorDaAmizade(String florDaAmizade) {
		this.florDaAmizade = florDaAmizade;
	}

	public String getFlorDaPaz() {
		return florDaPaz;
	}

	public void setFlorDaPaz(String florDaPaz) {
		this.florDaPaz = florDaPaz;
	}

	public String getFlorDoTrabalhoEmEquipe() {
		return florDoTrabalhoEmEquipe;
	}

	public void setFlorDoTrabalhoEmEquipe(String florDoTrabalhoEmEquipe) {
		this.florDoTrabalhoEmEquipe = florDoTrabalhoEmEquipe;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public void ganharPontos(String tipoPonto, int quantidadePonto) {
		Pontos comunicacao = new Pontos("Comunicação", 0);
		Pontos proatividade = new Pontos("Proatividade", 0);
		Pontos orientacaoAoDetalhe = new Pontos("Orientação ao Detalhe", 0);
		Pontos responsabilidadePessoal = new Pontos("Responsabilidade Pessoal", 0);
		Pontos empatia = new Pontos("Empatia", 0);
		Pontos trabalhoEmEquipe = new Pontos("Trabalho em Equipe", 0);

		switch (tipoPonto) {
		case "Comunicação":
			comunicacao.setValor(comunicacao.getValor() + quantidadePonto);
			break;
		case "Proatividade":
			proatividade.setValor(proatividade.getValor() + quantidadePonto);
			break;
		case "Orientação ao Detalhe":
			comunicacao.setValor(orientacaoAoDetalhe.getValor() + quantidadePonto);
			break;
		case "Responsabilidade Pessoal":
			responsabilidadePessoal.setValor(responsabilidadePessoal.getValor() + quantidadePonto);
			break;
		case "Empatia":
			empatia.setValor(empatia.getValor() + quantidadePonto);
			break;
		case "Trabalho em Equipe":
			trabalhoEmEquipe.setValor(trabalhoEmEquipe.getValor() + quantidadePonto);
			break;
			
		}
		
		pontuacao.add(comunicacao);
		pontuacao.add(proatividade);
		pontuacao.add(orientacaoAoDetalhe);
		pontuacao.add(responsabilidadePessoal);
		pontuacao.add(empatia);
		pontuacao.add(trabalhoEmEquipe);

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
		System.out.println("\nParabéns! Você ganhou " + valor + " e agora possui " + moedas + " moedas!");
		return moedas;
	}

	public List<Item> criarItens() {
		Item pocao = new Item("Poção Estranha", 5);
		Item pingente = new Item("Pingente de Mangual", 3);
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

			moedas -= valor;
			System.out.println(objeto.getNome() + " foi adicionado ao seu inventário." + 
			"\nVocê ainda possui " + moedas	+ " moedas.");
			mochila.add(objeto.getNome());
		}

		return moedas;
	}
	
	public void adicionarFlorDaAmizade() {
		mochila.add("Flor da Amizade");
	}

	public void adicionarFlorDaPaz() {
		mochila.add("Flor da Paz");
	}
	
	public void adicionarFlorDoTrabalhoEmEquipe() {
		mochila.add("Flor do Trabalho em Equipe");
	}

	public void adicionarChave() {
		mochila.add("Chave");
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
