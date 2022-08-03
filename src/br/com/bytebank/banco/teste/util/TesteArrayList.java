package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Iterator;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		ArrayList<String> nomes = new ArrayList<String>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 11);
		lista.add(cc2);

		System.out.println(lista.size());

		Conta ref = lista.get(0);
		System.out.println(ref);
		
		
		lista.remove(0);
		System.out.println(lista.size());
		
		Conta cc3 = new ContaCorrente(2223, 12131);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(2122, 1123);
		lista.add(cc4);
		
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef+"\n");
		}
		
		System.out.println("----------------------------------");
		
		for (Conta conta : lista) {
			System.out.println(conta +"\n");
		}
		
		System.out.println("----------------------------------");

		//Lambda
		lista.forEach((contas)->System.out.println(contas + "\n") );
		
		System.out.println("----------------------------------");

		//iteração
		Iterator<Conta> it = lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}
}
