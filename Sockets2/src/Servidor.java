import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Servidor {
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		
		System.out.println("Porta 12345 aberta!");
		
		Socket cliente = servidor.accept();
		//imprime o ip do cliente
		System.out.println("Nova conex�o com o cliente " + cliente.getInetAddress().getHostAddress());
		
		Scanner sc = new Scanner(cliente.getInputStream());
		
		while (sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		cliente.close();
		servidor.close();
	}
}
