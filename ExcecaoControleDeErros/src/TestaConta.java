
public class TestaConta {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.deposita(100);
		
		Conta cp = new ContaPoupanca();
		cp.deposita(100);
		
		try{
			cc.saca(50);
			System.out.println("Consegui sacar da corrente");
			
			cp.saca(50);
			System.out.println("Consegui sacar da poupança");
		}
		catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}
