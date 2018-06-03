
public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	void adiciona(Tributavel t){
		System.out.println("Adicionando tributável: " + t.calculaTributos());
		this.total += t.calculaTributos();
	}
	
	public double getTotal(){
		return this.total;
	}
}
