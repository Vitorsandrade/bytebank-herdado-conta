package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class Teste {

	public static void main(String[] args) {

		System.out.println("x");
		System.out.println(7);
		System.out.println(false);
		
		Object cc = new ContaCorrente(2, 11);
		Object cp = new ContaPoupança(231, 21);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		//println(cc);
	}

	static void println() {

	}

	static void println(int a) {

	}

	static void println(boolean a) {

	}
	static void println(Object conta) {
		
	}
}
