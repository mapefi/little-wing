
public class MeuPrograma {
	public static void main(String[] args) {
		GeraPDF gerapdf = new GeraPDF();
		/*Thread threadDoPdf = new Thread(gerapdf);
		threadDoPdf.start(); */
		gerapdf.run();
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
		/*Thread threadDaBarra = new Thread(barraDeProgresso);
		threadDaBarra.start();*/
		barraDeProgresso.run();
		
	}

}
