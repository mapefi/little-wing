
public class Casa {
	String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3 = new Porta();
	
	void pinta (String s) {
		this.cor = s;
	}
	
	int quantasPortasEstaoAbertas(){
		int cont = 0;
		if (porta1.aberta)
			cont++;
		if (porta2.aberta)		
			cont++;			
		if (porta3.aberta)		
			cont++;					
		return cont;
	}
	
}
