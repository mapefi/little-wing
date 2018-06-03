
public class TestaSaldoInsuficienteException {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.deposita(10);

		try {
			cc.saca(100);
		}
		// catch(IOException | SQLException e)
		catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("Executo isso mesmo assim");
		}
	}
}
