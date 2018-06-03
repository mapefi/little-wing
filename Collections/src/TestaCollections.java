import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCollections {
	
	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		lista.add("Manuel");
		lista.add("Joaquim");
		lista.add("Maria");
		
		System.out.println(lista);
		
		Collections.sort(lista);
		
		System.out.println(lista);
		
		Conta c1 = new Conta(100);
		Conta c2 = new Conta(200);		
		Conta c3 = new Conta(300);
		
		List<Conta> contas = new ArrayList<Conta>();
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		System.out.println(contas.size());
		
		System.out.println (c1.compareTo(c2));
		
		for (int i=0; i<contas.size(); i++){
			System.out.println(contas.get(i).getSaldo());
		}
		
	}

}
