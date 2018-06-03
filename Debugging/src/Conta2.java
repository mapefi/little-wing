
public class Conta2 {
	private double saldoReal;
	private double limite;

	public Conta2(double limite) {
		this.limite = limite;
		}

	public boolean saca(double valor) {
		if (!isSaldoSuficiente(valor)) {
			return false;
		} else {
			this.saldoReal = this.saldoReal - valor;
			return true;
		}
	}

	private boolean isSaldoSuficiente(double valor) {
		return (this.saldoReal + this.limite) > valor;
	}
}
