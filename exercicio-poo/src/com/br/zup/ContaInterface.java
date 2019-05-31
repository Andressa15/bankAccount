package com.br.zup;

import br.com.zup.modelo.Conta;

public interface ContaInterface {
	void depositar (double moneyDepositado);
	void sacar( double valorSaque);
	void saldo();
	void transferir(double valorTransferencia, Conta conta);

	//	 void depositar(double valor);
	//	 void sacar(double valor);
	//	 void saldo();
	//	 void transferencia (Conta conta, double valor);
}
