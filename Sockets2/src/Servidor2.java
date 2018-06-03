import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Servidor2 {
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		
		System.out.println("Porta 12345 aberta!");
		
		Socket cliente = new Socket("127.0.0.1",12345);
		System.out.println("O cliente se conectou ao servidor!");
		
		Scanner teclado = new Scanner(System.in);
		
		while (teclado.hasNextLine()){
			System.out.println(teclado.nextLine());
		}
		
		teclado.close();
		cliente.close();
		servidor.close();
	}
}
