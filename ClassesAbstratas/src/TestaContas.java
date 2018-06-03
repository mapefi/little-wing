
public class TestaContas {

	public static void main(String args[]) {
		/*
		 * Conta c = new Conta(); ContaCorrente cc = new ContaCorrente();
		 * ContaPoupanca cp = new ContaPoupanca();
		 */

		// Conta[] c = new Conta[10];
		Conta c = new ContaCorrente();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		c.atualiza(0.1);
		cc.atualiza(0.1);
		cp.atualiza(0.1);

		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}
}
