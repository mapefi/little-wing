import java.io.*;

public class TestaEntrada {
	public static void main(String[] args) throws IOException {
		/*
		 * FileInputStream is = new FileInputStream("arquivo.txt"); int b =
		 * is.read();
		 */

		try {

			// InputStream is = new FileInputStream("arquivo.txt");
			// InputStream is = System.in;
			InputStream is = new FileInputStream("arquivo2.txt");
			InputStreamReader isr = new InputStreamReader(is);
			// int c = isr.read();
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();

			while (s != null) {
				System.out.println(s);
				s = br.readLine();
			}

			// br.close();

		}

		catch (IOException e) {
			// System.out.println("Erro na leitura do arquivo");
			System.out.println(e);
		}

	}

}
