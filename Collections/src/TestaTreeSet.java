import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestaTreeSet {
	
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();
		
		for (int i=1000; i >0; i--){
			lista.add(i);
		}
		
		NumeroComparator nc = new NumeroComparator();
		
		Collections.sort(lista, nc);
		
		Iterator<Integer> it = lista.iterator();
		
		while (it.hasNext()){
			System.out.println(it.next());		
		}
		
	}

}
