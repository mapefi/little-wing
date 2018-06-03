package package2;

public class ContaCorrente implements ContaTributavel{
	
	double saldo;

	public void atualiza (double taxa){
		this.saldo += this.saldo * taxa * 2;
	}
	
	public void deposita (double valor){
		this.saldo += valor - 0.10;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double saque) {
		this.saldo -= saque;
		
	}

	public double calculaTributos() {
		return 100;
	}

}
