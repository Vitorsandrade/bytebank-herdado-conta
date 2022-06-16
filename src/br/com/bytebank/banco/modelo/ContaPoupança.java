package br.com.bytebank.banco.modelo;



public class ContaPoupança extends Conta {
	
	
	public ContaPoupança(int agencia, int numero) {
		super(agencia,numero);
	}
	
	@Override
	public String toString() {
		return "Conta Poupança, " + super.toString();
	}

}
