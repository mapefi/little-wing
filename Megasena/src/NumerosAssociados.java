
public class NumerosAssociados implements Comparable<NumerosAssociados>{

	int quantidade;
	int numeroAssociado;
	 
	   public int compareTo(NumerosAssociados numero) {
	        if (this.quantidade > numero.quantidade) {
	            return -1;
	        }
	        if (this.quantidade < numero.quantidade) {
	            return 1;
	        }
	        return 0;
	    }	
	
	}

