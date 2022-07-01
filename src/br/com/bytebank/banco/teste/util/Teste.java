package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		
		int idade = 29;//Integer
		Integer idadeRef = new Integer(29);//autoboxing
		
		System.out.println(idadeRef.doubleValue());
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);//Autoboxing
		numeros.add(idadeRef);
		
		String s = args[0];//"10"
		
		
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
	
		
	}
}
