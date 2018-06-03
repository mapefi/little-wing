import java.util.ArrayList;

public class Elemento implements Comparable<Elemento>{
	
	int numero;
    ArrayList<NumerosAssociados> numassociado = new ArrayList<NumerosAssociados>();
    
    public int compareTo(Elemento e) {
        if (this.numero < e.numero) {
            return -1;
        }
        if (this.numero > e.numero) {
            return 1;
        }
        return 0;
    }
    
}
