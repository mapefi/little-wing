import java.io.*;

public class TestaSaida {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("saida.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			bw.write("Caelum");
			
			bw.close();

			System.out.println("Arquivo gravado");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
