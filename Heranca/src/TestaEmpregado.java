
public class TestaEmpregado {

	public static void main (String args[]){
		EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade();
		empregado.setNome("João Paulo");
		empregado.setSalario(3000);
		
		ProfessorDaFaculdade professor = new ProfessorDaFaculdade();
		professor.setHorasDeAula(160);
		professor.setNome("Maria Rita");
		professor.setSalario(5000);
		
		Reitor reitor = new Reitor();
		reitor.coxinha = true;
		reitor.setNome("Francisco Silva");
		reitor.setSalario(10000);
		
		GeradorDeRelatorio relatorio = new GeradorDeRelatorio();
		relatorio.adiciona(empregado);
		relatorio.adiciona(professor);
		relatorio.adiciona(reitor);				
	}
}
