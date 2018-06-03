public class Conta implements Comparable<Conta> {
	
	public double saldo;
	private double limite;
	private Cliente titular;
	private int numero;
	private static int totalDeContas;
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo + this.limite;
	}
	
	public double getLimite(){
		return this.limite;
	}
	
	public void setLimite(double limite){
		this.limite = limite;
	}
	
	public Cliente getTitular(){
		return this.titular;
	}
	
	public void setTitular(Cliente titular){
		this.titular = titular;
	}
	
	public void deposita(double valor){
		this.saldo+= valor;
	}

	/*Conta(Cliente titular) {
		this.titular = titular;
	}
	
	Conta (int numero, Cliente titular){
		this (titular);
		this.numero = numero;
	} */
	
	Conta (double saldo){
		this.saldo = saldo;
	}
	
	public static int getTotalDeContas(){
		return Conta.totalDeContas;
	}

	@Override
	public int compareTo(Conta outra) {
		if (this.saldo < outra.saldo)
			return -1;
		if (this.saldo > outra.saldo)
			return 1;
		return 0;
	}
	
}
