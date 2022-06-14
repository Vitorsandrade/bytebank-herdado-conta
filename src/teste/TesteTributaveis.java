package teste;

import modelo.CalculadorImposto;
import modelo.ContaCorrente;
import modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
	}
}
