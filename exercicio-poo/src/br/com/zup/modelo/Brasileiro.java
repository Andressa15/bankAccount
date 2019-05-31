package br.com.zup.modelo;

import com.br.zup.Conta;

public class Brasileiro extends Pessoa {
	
	// Atributos
	private String idioma;
	private boolean gostaFeijoada;
	private Conta conta;
	
	// Construtor
	public Brasileiro(String nome, String sobrenome, int idade, String idioma, 
			boolean gostaFeijoada, Conta conta) {
		super(nome, sobrenome, idade);
		this.idioma = idioma;
		this.gostaFeijoada = gostaFeijoada;
		this.conta = conta;
	}
	
	// Gets e Sets
	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public boolean isGostaFeijoada() {
		return gostaFeijoada;
	}

	public void setGostaFeijoada(boolean gostaFeijoada) {
		this.gostaFeijoada = gostaFeijoada;
	}
	
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	// toString
	public String toString() {
		
		String modelo = "";
		
		modelo += "Nome -> " + super.getNome() + "\n";
		modelo += "Sobrenome -> " + super.getSobrenome() + "\n";
		modelo += "Idade -> " + super.getIdade() + "\n";
		modelo += "Idioma -> " + this.getIdioma() + "\n";
		modelo += "Gosta de Feijoada? -> " + this.isGostaFeijoada() + "\n";
		modelo += "Conta Bancária -> " + this.getConta() + "\n";
		
		return modelo;
	}
}
