package com.br.zup;

public interface ContaInterface {
	void depositar (double moneyDepositado);
	void sacar( double valorSaque);
	void saldo();
	void transferir(double valorTransferencia, Conta conta);

}
