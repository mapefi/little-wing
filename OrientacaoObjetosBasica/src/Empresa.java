
public class Empresa {
	String nome;
	Funcionario[] empregados;
	String cnpj;
	
	void adiciona(Funcionario f, int pos){
		this.empregados[pos] = f;
	}
	
	void mostraEmpregados(){
		for (int i=0; i<this.empregados.length; i++){
			System.out.println("Funcion�rio na posi��o: " + i);
			System.out.println("Nome: " + this.empregados[i].nome);
			System.out.println("Departamento: " + this.empregados[i].departamento);
			System.out.println("RG: " + this.empregados[i].rg);	
			System.out.println("Sal�rio: " + this.empregados[i].salario);	
			System.out.println("Sal�rio anual: " + this.empregados[i].calculaGanhoAnual());
			System.out.println("Est� na empresa: " + this.empregados[i].estaNaEmpresa);
			System.out.println("");
		}
	}
	
}
