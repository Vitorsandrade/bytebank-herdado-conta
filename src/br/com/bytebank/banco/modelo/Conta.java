package br.com.bytebank.banco.modelo;

public abstract class Conta{

	private double saldo;
    private int agencia;
    private int numero;
    private static int total = 0;
    

    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas � " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    
    public void saca(double valor)  throws SaldoInsuficienteException{
    
        if(this.saldo < valor) {
        	//problema
        	throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
        
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public static int getTotal(){
        return Conta.total;
    }

}