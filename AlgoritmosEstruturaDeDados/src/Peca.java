
public class Peca {
	private String nome;
	private boolean defeituosa;
	
	public Peca(String nome, boolean defeituosa) {
		this.nome = nome;
		this.defeituosa = defeituosa;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public boolean getDefeituosa(){
		return this.defeituosa;
	}
	
	public String isDefeituosa(){
		if (this.defeituosa)
			return "defeituosa";
		else
			return "perfeita";
	}
}
