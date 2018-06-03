
public class Conta {
	int numero = 1234;
	String dono = "Duke";
	String cpf = "123.456.789-10";
	double saldo = 1000;
	double limite = 1000;
	double salario = 5000;
	Cliente titular;
	
	Boolean saca(double quantidade){
		if (this.saldo < quantidade)
			return false;
		else{
			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo;
			return true;
		}
	}
	
	void deposita(double quantidade){
		this.saldo += quantidade;
	}
	
/*	void transfere (Conta destino, double valor){
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	} */
		
	boolean transfere (Conta destino, double valor){
			boolean retirou = this.saca(valor);
			if (retirou == false)
				return false;
			//não deu pra sacar!
			else{
				destino.deposita(valor);
				return true;
			}	
				
	}
	
}
