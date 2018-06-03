
public class Porta {
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	void abre(){
		this.aberta = true;
	}
	
	void fecha(){
		this.aberta = false;
	}
	
	void pinta(String s){
		this.cor = s;
	}
	
	boolean estaAberta(){
		return this.aberta;
	}
	
}
