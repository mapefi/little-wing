import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class NumerosMagicos  implements Comparator<Elemento>{

	static HashMap<Integer, Integer> lista = new HashMap<Integer, Integer>();
	static ValueComparator bvc = new ValueComparator(lista);
    static TreeMap<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>(bvc);
    static TreeSet<Elemento> listaAssociados = new  TreeSet<Elemento>();
    static LinkedList<Jogo> vetorJogo = new LinkedList<Jogo>();
    

	public static void main(String[] args) {

		InputStream is = null;
		try {
			is = new FileInputStream("historico.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner entrada = new Scanner(is);
		// Scanner entrada = new Scanner(System.in);

		String[] linhaArray;
		int numJogos = 0;

		while (entrada.hasNextLine()) {
			linhaArray = entrada.nextLine().split(";");
			int numInt;
			Jogo j = new Jogo();
			numJogos++;

			for (String num : linhaArray) {
				numInt = Integer.parseInt(num);
				if (lista.containsKey(numInt)) {
					lista.put(numInt, lista.get(numInt) + 1);
					//System.out.println("aqui");
				} else {
					lista.put(numInt, 1);
					//System.out.println("aqui2");
				}
				
				j.vetorCadaJogo.add(numInt);
			}
			
			vetorJogo.add(j);
			int num;
			
			for (int i=0; i< linhaArray.length; i++){
				
				num = Integer.parseInt(linhaArray[i]);
				Elemento e = retornaElemento(num);
				
				if (e == null){
					incluiElemento(num, linhaArray);
				}
				
				else{
					incluiAssociado(e, linhaArray);
				}
				
			}
			
		}

		entrada.close();
	
	    sortedMap.putAll(lista);
	    System.out.println("results: " + sortedMap);

	    int soma;
	    int somaTudo=0;
	    double media;
	    
	    for (Jogo j : vetorJogo){
	    	
	    	soma = 0;
	    	
	    	for (Integer num : j.vetorCadaJogo){
	    		soma += lista.get(num);
	    	}
	    	
	    	media = soma / 6;
	    	somaTudo += media;
	    	System.out.println(media);
	    }
	    
	    System.out.println("Média final: " + (double) somaTudo / numJogos);
	    
	    for (Elemento el : listaAssociados){
	    	System.out.println("Número: " + el.numero);
		    Collections.sort(el.numassociado);
	    	
	    	for (NumerosAssociados num : el.numassociado){
	    		System.out.println(num.numeroAssociado + "-" + num.quantidade);
	    		break;
	    	} 
	    	
	    	System.out.println("");
	    	
	    } 
	    
	    

	}
	
	public static Elemento retornaElemento(int num){
		
		for (Elemento e : listaAssociados){
			if (e.numero == num){
				return e;
			}
		}
		return null;
	}
	
	public static void incluiElemento(int num, String[] linhaArray){
				
		int numArray;
		Elemento e = new Elemento();
		e.numero = num;
		
		for (int i=0; i<linhaArray.length;i++){
			
			numArray = Integer.parseInt(linhaArray[i]);
			NumerosAssociados numAssociado = new NumerosAssociados();
			
			if (numArray != num){
				numAssociado.numeroAssociado = numArray;
				numAssociado.quantidade = 1;
				e.numassociado.add(numAssociado);
			//	System.out.println(e.numero + ";" + numArray);
			}
		}
		
		listaAssociados.add(e);
	}
	
	public static void incluiAssociado(Elemento e, String[] linhaArray){
		
		int numArray;
		boolean novoAssociado;
		
		for (int i=0; i<linhaArray.length;i++){
			
			numArray = Integer.parseInt(linhaArray[i]);
			novoAssociado = true;
			
			if (numArray != e.numero){
				
				for (NumerosAssociados num : e.numassociado){
					if (num.numeroAssociado == numArray){
						num.quantidade++;
						novoAssociado = false;
					}
				}
				
				if (novoAssociado == true){
					NumerosAssociados numAssociado = new NumerosAssociados();
					numAssociado.numeroAssociado = numArray;
					numAssociado.quantidade = 1;
					e.numassociado.add(numAssociado);					
				}
								
			}
		}
		
	}

	@Override
	public int compare(Elemento e1, Elemento e2) {
		if (e1.numero< e2.numero)
			return 1;
		if (e1.numero > e2.numero)
			return -1;
		return 0;
	}	
	
}				