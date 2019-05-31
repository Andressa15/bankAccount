package com.br.zup;

import br.com.zup.modelo.Conta;

public class TesteConta {

	public static void main(String[] args) {

		Conta conta1 = new Conta("12AII", "Santader", "122", 100);
		Conta contaDele= new Conta("123AII", "Santader", "125", 123);

		
		
		
		
		conta1.saldo();
		
		conta1.depositar(100);
		
		conta1.saldo();
		
		conta1.sacar(50);
		
		conta1.saldo();
		
		conta1.transferir(100, contaDele);
	}
}