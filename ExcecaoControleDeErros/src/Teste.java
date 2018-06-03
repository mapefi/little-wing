
public class Teste {
	public static void metodo() {
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (java.io.FileNotFoundException e) {
			System.out.println("Não foi possível abrir o arquivo para leitura");
		}
	}

	/*
	 * public static void metodo() throws java.io.FileNotFoundException { new
	 * java.io.FileInputStream("arquivo.txt"); }
	 */

}
