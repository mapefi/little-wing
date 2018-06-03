
public class TestaPorta {
	public static void main (String args[]){
		Porta p = new Porta();
		p.aberta = true;
		p.aberta = false;
		p.pinta("Amarelo");
		p.pinta("Vermelho");
		p.pinta("Verde");
		p.dimensaoX = 2;
		p.dimensaoY = 1.2;
		p.dimensaoZ = 0.1;
		
		if (p.estaAberta())
			System.out.println("Aberta");
		else
			System.out.println("Fechada");	
		
		System.out.println("Cor: " + p.cor);
		System.out.println("Altura: " + p.dimensaoX + " Comprimento: " + p.dimensaoY + " Largura: " + p.dimensaoZ);		
		
	}
}
