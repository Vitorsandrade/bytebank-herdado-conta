package br.com.bytebank.banco.modelo;



public class ContaPoupan�a extends Conta {
	
	
	public ContaPoupan�a(int agencia, int numero) {
		super(agencia,numero);
	}
	
	@Override
	public String toString() {
		return "Conta Poupan�a, " + super.toString();
	}

}
