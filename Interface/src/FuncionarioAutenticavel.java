
public class FuncionarioAutenticavel extends Funcionario{

	int senha;
	
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
}
