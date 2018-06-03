import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	
	public static void main(String[] args) throws IOException{
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");

		Socket cliente = servidor.accept();
		System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());
		
		OutputStream os = new FileOutputStream("recebido.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		Scanner entrada = new Scanner(cliente.getInputStream());
		while (entrada.hasNextLine()){
			bw.write(entrada.nextLine());
		}
		
		bw.close();
		entrada.close();
		servidor.close();
	}

}
