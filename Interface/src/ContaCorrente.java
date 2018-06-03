
public class ContaCorrente extends Conta implements Tributavel{

	public void atualiza (double taxa){
		this.saldo += this.saldo * taxa * 2;
	}
	
	public void deposita (double valor){
		this.saldo += valor - 0.10;
	}

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

}
