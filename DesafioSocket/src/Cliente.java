import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	
	public static void main(String[] args) throws UnknownHostException, IOException{
		Socket cliente = new Socket("127.0.0.1", 12345);
		System.out.println("O cliente se conectou ao servidor!");
		
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		
		InputStream is = new FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(is);
		
		
		while(entrada.hasNextLine()){
			saida.println(entrada.nextLine());
		}
		
		saida.close();
		entrada.close();
		
	}

}
