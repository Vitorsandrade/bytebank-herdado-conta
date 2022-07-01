package br.com.bytebank.banco.teste.util;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		
		Integer idadeRef = new Integer(29);//autoboxing
		System.out.println(idadeRef.intValue());//unboxing
		
		Double dRef = Double.valueOf(3.2);//autoboxing
		System.out.println(dRef.doubleValue());//unboxing
	}
}
