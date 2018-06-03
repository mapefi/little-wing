import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaCollections2 {
	
	public static void main(String[] args) {
		
		Conta c = new Conta(200);
		
		List lista = new LinkedList();
		lista.add("a");
		lista.add("b");
		lista.add("c");
		
		Collections.reverse(lista);
		
		System.out.println(lista);
		
		Collections.shuffle(lista);
		
		System.out.println(lista);
		
		Collections.rotate(lista, 2);
		
		System.out.println(lista);
		
		Random ran = new Random();
		
		lista.add(ran.nextInt());
		
		System.out.println(lista);
		
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString());
			}
		
		
	}
	
}
