
public class TestaCasa {
	public static void main (String args[]){
		Casa c = new Casa();
		c.cor = "Amarelo";
		c.porta1.aberta = true;
		c.porta1.cor = "Branco";
		c.porta1.dimensaoX = 2.00;
		c.porta1.dimensaoY = 1.2;
		c.porta1.dimensaoZ = 0.1;
		
		c.porta2.aberta = true;
		c.porta2.cor = "Verde";
		c.porta2.dimensaoX = 2.00;
		c.porta2.dimensaoY = 1.2;
		c.porta2.dimensaoZ = 0.1;
		
		c.porta3.aberta = true;
		c.porta3.cor = "Azul";
		c.porta3.dimensaoX = 2.00;
		c.porta3.dimensaoY = 1.2;
		c.porta3.dimensaoZ = 0.1;
		
		c.porta1.aberta = true;
		c.porta2.aberta = false;
		c.porta3.aberta = true;
		
		System.out.println("Cor da casa: " + c.cor);
		System.out.println("Cor da porta1: " + c.porta1.cor);
		System.out.println("Cor da porta2: " + c.porta2.cor);
		System.out.println("Cor da porta3: " + c.porta3.cor);
		System.out.println("Portas abertas: " + c.quantasPortasEstaoAbertas());
	}
}
