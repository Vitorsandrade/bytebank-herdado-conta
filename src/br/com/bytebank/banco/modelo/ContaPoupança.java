package br.com.bytebank.banco.modelo;



public class ContaPoupanša extends Conta {
	
	
	public ContaPoupanša(int agencia, int numero) {
		super(agencia,numero);
	}
	
	@Override
	public String toString() {
		return "Conta Poupanša, " + super.toString();
	}

}
