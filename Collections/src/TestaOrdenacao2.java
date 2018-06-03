import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestaOrdenacao2 {
	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<>();
		conjunto.add("item 1");
		conjunto.add("item 2");
		conjunto.add("item 3");
		// retorna o iterator
		
		Iterator<String> i = conjunto.iterator();
		
		while (i.hasNext()){
			String palavra = i.next();
			System.out.println(palavra);
		}
	}
}
