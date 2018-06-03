
public class testaAlgunsMetodos {
	public static void main (String args[]){
		//criando a conta
		Conta minhaConta;
		minhaConta = new Conta();
		
		//alterando os valores de minhaConta
		minhaConta.dono = "Duke";
		minhaConta.saldo  = 1000.0;
		
		//saca 200 reais
	//	minhaConta.saca(200.0);
		
		//deposita 500 reais
	//	minhaConta.deposita(500.0);
//		System.out.println(minhaConta.saldo);
		
		
		boolean consegui = minhaConta.saca(2000.0);
		
		if (consegui)
			System.out.println("Consegui sacar");
		else
			System.out.println("Não consegui sacar");
		//System.out.println("Saldo atual: " + minhaConta.saldo);
		
		
	}
}
