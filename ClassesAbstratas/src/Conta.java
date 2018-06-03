
public abstract class Conta {
	
	protected double saldo = 0;
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void deposita (double saldo){
		this.saldo += saldo;
	}
	
	public void saca (double saque){
		if (saque > this.saldo)
			System.out.println("Saldo insuficiente para saque");
		else
			this.saldo -= saldo;
	}
	
	abstract void atualiza (double taxa);

}
