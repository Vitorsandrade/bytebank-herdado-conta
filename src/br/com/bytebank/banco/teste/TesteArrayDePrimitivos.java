package br.com.bytebank.banco.teste;

import java.util.Iterator;

public class TesteArrayDePrimitivos {

	//Array []
	public static void main(String[] args) {
		
		int[] idades = new int[5]; //inicializa o array com os valores padr�es
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			System.out.println(idades[i]);
		}
	
		
	}
}
