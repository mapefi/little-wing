
public class TestaFuncionario {
	public static void main (String args[]){
		Funcionario f1 = new Funcionario();
		
	/*	f1.nome = "Hugo";
		f1.salario = 180;
		f1.recebeAumento(50); */
	
		
		f1.nome = "Daniel";
		f1.salario = 100;
		Data data = new Data();
		data.dia = 1;
		data.mes = 1;
		data.ano = 2012;
		f1.dataEntrada = data;
		
		
		Funcionario f2 = new Funcionario();
		
		/*f2.nome = "Daniel";
		f2.salario = 100; */
		
		f2 = f1;
		
		if (f1 == f2){
			System.out.println("Iguais");
		}
		else{
			System.out.println("Diferentes");			
		}
		
		
		System.out.println("Salario atual: " + f1.salario);
		System.out.println("Ganho anual: " + f1.calculaGanhoAnual());
		
		if (f1.salario > 200){
			f1.demite();
			System.out.println("Funcionário demitido");
		}
		else
			System.out.println("Funcionário mantido");
		
		f1.mostra();
		
	}
}
