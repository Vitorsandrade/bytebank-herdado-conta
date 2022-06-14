package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200);
		try {
			conta.saca(220);
		}catch (SaldoInsuficienteException e) {
			System.out.println("Ex: " + e.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}
}
