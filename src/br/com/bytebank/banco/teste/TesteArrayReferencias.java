package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupan�a;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//int[] idades = new int[5];
		Object[] referencias = new Object[5];
		
		System.out.println(referencias.length);
		
		
		
		ContaCorrente cc1 = new ContaCorrente(10, 230);
		
		ContaPoupan�a cc2 = new ContaPoupan�a(10, 245);
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		referencias[0] = cc1;
		referencias[1] = cc2;
		
		System.out.println(((Conta) referencias[0]).getNumero());
		
		for (Object contaCorrente : referencias) {
			System.out.println(contaCorrente);
		}
		
		ContaPoupan�a ref = (ContaPoupan�a) referencias[1];
		System.out.println(ref);
		

	}
}
