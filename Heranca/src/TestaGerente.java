
public class TestaGerente {

	public static void main(String args[]) {
		Gerente gerente = new Gerente();
		gerente.setNome("João da Silva");
		gerente.setSenha(4321);
		gerente.autentica(gerente.senha);
		gerente.setSalario(10000);
		// Double bonificacao = gerente.getBonificacao();

		Funcionario funcionario = gerente;
		funcionario.setSalario(5000);

		ControleDeBonificacoes controle = new ControleDeBonificacoes();

		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(5000);
		controle.registra(funcionario1);

		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(1000);
		controle.registra(funcionario2);

		System.out.println("Total de Bonificações: " + controle.getTotalBonificacoes());

		/*
		 * System.out.println("Nome: " + gerente.nome);
		 * System.out.println("Senha: " + gerente.senha);
		 * System.out.println("Bonificação: " + bonificacao);
		 * 
		 * System.out.println("Salário Funcionário: " + funcionario.salario);
		 */

	}
}
