import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaScanner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			PrintStream ps = new PrintStream("arquivo.txt");
			
			while (s.hasNextLine()){
				ps.println(s.hasNextLine());
			}
			
			//ps.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		finally{
			s.close();
		}
		
	}	
}
