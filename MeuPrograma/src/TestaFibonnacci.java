
public class TestaFibonnacci {
	public static void main (String args[]){
		Fibonnacci fib = new Fibonnacci();
		
		for (int j=1; j<=6; j++){
			System.out.println(fib.calculaFibonnacci(j) + " ");
		}
	}
}
