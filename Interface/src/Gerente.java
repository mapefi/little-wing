
public class Gerente extends Funcionario implements InterfaceAutenticavel {
	int senha;
	int numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha){
		if (this.senha == senha){
			System.out.println("Acesso permitido");
			return true;
		}
		else{
			System.out.println("Acesso negado");
			return false;			
		}
	}
	
	public void setSenha(int senha){
		this.senha = senha;
	}
	
	public int getSenha(){
		return this.senha;
	}

	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
		
	}
	
}
