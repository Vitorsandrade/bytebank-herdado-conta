package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
//
//		Conta cc = new ContaCorrente(333, 444);
//		Conta cc2 = new ContaCorrente(333, 444);
//		
//		boolean igual = cc.ehIgual(cc2);
//		System.out.println(igual);
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(333, 444);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(222, 111);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(222, 111);
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe? "+ existe);
		
		
		for (Conta conta : lista) {
			System.out.println(conta +"\n");
		}
		

	}
}
