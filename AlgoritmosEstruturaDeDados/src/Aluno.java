
public class Aluno{

	private String name;
	private double notaRelatorio;

	public Aluno(String name, double relatorio) {
		this.name = name;
		this.notaRelatorio = relatorio;
	}
	
	public double getNotaRelatorio(){
		return this.notaRelatorio;
	}
	
	public String getNome(){
		return this.name;
	}


}
