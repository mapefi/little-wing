import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class Servidor3 {
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		
		System.out.println("Porta 12345 aberta!");
		
		Socket cliente = new Socket("127.0.0.1",12345);
		System.out.println("O cliente se conectou ao servidor!");
		
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		Scanner teclado = new Scanner(System.in);
		
		while (teclado.hasNextLine()){
			saida.println(teclado.nextLine());
		}
		
		saida.close();
		teclado.close();
		cliente.close();
		servidor.close();
	}
}
