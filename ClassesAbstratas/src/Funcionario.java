
abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public void setNome (String nome){
		this.nome = nome;
	}
	
	public void setSalario (double salario){
		this.salario = salario;
	}
	
	abstract double getBonificacao();
	
}
