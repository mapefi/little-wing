
public class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data dataEntrada;
	String rg;
	boolean estaNaEmpresa;
	
	void recebeAumento(double aumento){
		this.salario = this.salario + aumento;
	}
	
	double calculaGanhoAnual(){
		return this.salario * 12;
	}
	
	void demite(){
		this.estaNaEmpresa = false;
	}
	
	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		System.out.println("Dia: " + this.dataEntrada.dia);
		System.out.println("Mes: " + this.dataEntrada.mes);
		System.out.println("Ano: " + this.dataEntrada.ano);
		System.out.println("RG: " + this.rg);
		System.out.println("Está na empresa: " + this.estaNaEmpresa);
		System.out.println("Data de entrada " + this.dataEntrada.dia + "/" + this.dataEntrada.mes + "/" + this.dataEntrada.ano);
		
	}
	
}
