package br.com.zup.modelo;

import com.br.zup.ContaInterface;

public class Conta implements ContaInterface {
	
	// Atributos
	private String numeroConta;
	private String banco;
	private String agencia;
	private double saldo;
	
	// Construtor
	public Conta(String numeroConta, String banco, String agencia,
			double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.banco = banco;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	// Gets e Sets
	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// toString
	@Override
	public String toString() {
		
		String modelo = "";
		modelo += "\n - Número Conta -> " + this.getNumeroConta() + "\n";
		modelo += " -Banco ->" + this.getBanco() + "\n";
		modelo += " -Agência -> " + this.getAgencia() + "\n";
		modelo += " -Saldo -> " + this.getSaldo() + "\n";
		
		return modelo;
	}
	
	public void depositar (double moneyDepositado) {
		double dinTotal = this.getSaldo() + moneyDepositado;
		this.setSaldo(dinTotal);
		System.out.println("Voce depositou\n" + moneyDepositado);
		
		
		
	}

	@Override
	public void sacar(double valorSaque) {
	   if ( valorSaque < this.getSaldo()) {
		   this.setSaldo(this.getSaldo()-valorSaque);
		   System.out.println("Saque efetuado com sucesso");
	   }
	}

	@Override
	public void saldo() {
		System.out.println("Saldo atual\n"+this.getSaldo());	
	}

	
	@Override
	public void transferir(double valorTransferencia, Conta conta) {
		this.setSaldo(this.getSaldo()- valorTransferencia);
		conta.setSaldo(conta.getSaldo() + valorTransferencia);
		if (this.getSaldo() > valorTransferencia) {
			System.out.println(" Saldo insuficiente");
		}else {
			System.out.println(" Voce conseguiu transferir com sucesso");
			
		}
	}
}
