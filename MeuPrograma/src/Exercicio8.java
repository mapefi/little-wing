
public class Exercicio8 {
	public static void main (String args[]){
    
		int k = 0;
		
		for (int i = 1; i<=10; i++){
			System.out.print(i + " ");
			
			k = 2;
		
			for (int j = i-1; j > 0; j--){
				
				System.out.print (i * k + " ");
				k++;
			}
		
			System.out.println("");
		}
		
	}

}
