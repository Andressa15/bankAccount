package br.com.zup.teste;

import java.util.ArrayList;
import java.util.List;

import com.br.zup.Conta;

import br.com.zup.modelo.Brasileiro;

public class TestePessoa {

	public static void main(String[] args) {
		
		// Criando Lista
		List<Brasileiro> listaPessoas = new ArrayList<Brasileiro>();
		
		// Primeiro de conta
		Conta conta = new Conta("0000-0", "Itaú", "8786", 100.000);

		// Criar Brasileiro
		Brasileiro br = new Brasileiro("Joao", "Anastácio", 25, "Português", true, conta);
		
		listaPessoas.add(br);
		
		for (Brasileiro brasileiro : listaPessoas) {
			System.out.println(brasileiro);
		}
		
	}

}
