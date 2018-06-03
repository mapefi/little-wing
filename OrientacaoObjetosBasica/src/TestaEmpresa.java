public class TestaEmpresa {
	
	public static void main (String args[]){
		
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		data.dia = 1;
		data.mes = 1;
		data.ano = 2012;
		f1.dataEntrada = data;
		f1.departamento = "RH";
		f1.estaNaEmpresa = true;
		f1.nome = "Ricardo Oliveira";
		f1.rg = "452348753";
		f1.salario = 5000.0;
		
		Funcionario f2 = new Funcionario();
		Data data2 = new Data();
		data2.dia = 6;
		data2.mes = 10;
		data2.ano = 2015;
		f2.dataEntrada = data;
		f2.departamento = "Marketing";
		f2.estaNaEmpresa = true;
		f2.nome = "Marcia Lima";
		f2.rg = "342348765";
		f2.salario = 4000.0;
		
		Funcionario f3 = new Funcionario();
		Data data3 = new Data();
		data3.dia = 17;
		data3.mes = 6;
		data3.ano = 2014;
		f3.dataEntrada = data;
		f3.departamento = "TI";
		f3.estaNaEmpresa = true;
		f3.nome = "Bruna Martins";
		f3.rg = "459874333";
		f3.salario = 6000.0;
		
		Empresa emp = new Empresa();
		emp.cnpj = "9993335556664444";
		emp.nome = "Teste SA";
		emp.empregados = new Funcionario[3];
		emp.adiciona(f1,0);
		emp.adiciona(f2,1);
		emp.adiciona(f3,2);
		
		emp.mostraEmpregados();
		
	}
}
