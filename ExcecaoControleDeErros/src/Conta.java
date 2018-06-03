
public class Conta {

	protected double saldo;
	private double limite;
	private Cliente titular;
	private int numero;
	private static int totalDeContas;

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo + this.limite;
	}

	public double getLimite() {
		return this.limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void deposita(double valor) {
		if (valor < 0) {
//			throw new IllegalArgumentException("Você tentou passar um valor negativo");
			throw new ValorInvalidoException(""+valor);

		} else {
			this.saldo += valor;
		}
	}

	/*
	 * Conta(Cliente titular) { this.titular = titular; }
	 * 
	 * Conta (int numero, Cliente titular){ this (titular); this.numero =
	 * numero; }
	 */

	Conta() {
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	boolean saca(double valor) {
		if (this.saldo < valor) {
			// throw new RuntimeException();
			// throw new IllegalArgumentException("Saldo Insuficiente");
			throw new SaldoInsuficienteException("Saldo Insuficiente " + this.saldo + " tente um valor menor");
		} else {
			this.saldo -= valor;
			return true;
		}
	}

}
