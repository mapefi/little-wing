import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {
	
	public static void main(String[] args) throws FileNotFoundException {
		InputStream is = new FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(is);
		//Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua mensagem:");
		
		
		
		while(entrada.hasNextLine()){
			System.out.println(entrada.nextLine());
		}
		
		entrada.close();
		
	}

}
