package br.com.caelum.banco.util;
import br.com.empresa.banco.conta.Cliente;
import br.com.empresa.banco.conta.Conta;

public class TestaAcessoComPegaSaldo {
	public static void main (String args[]){
		Cliente carlos = new Cliente();
		carlos.nome = "Carlos";
	//	Conta minhaConta = new Conta(carlos);
	//	minhaConta.deposita(1000);
		int total = Conta.getTotalDeContas();
//		System.out.println("Saldo: " + minhaConta.getSaldo());
	//	System.out.println(minhaConta.getTitular().nome);
		System.out.println("Total de Contas: " + total);

	}
}
