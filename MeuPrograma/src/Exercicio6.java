
public class Exercicio6 {
	public static void main (String args[]){
		
		int num = 0;
		int ant1 = 0;
		int ant2 = 0;
		
		for (int i = 0; i <10; i++){
			
			if (i == 0)
				num = 0;
			
			else{
				
				if (i == 1){
					num = 1;
					ant1 = 1;
					ant2 = 0;
				}
				
				else
				
				{
					num = ant1 + ant2;	
					ant2 = ant1;
					ant1 = num;
					}
				}

			System.out.println(num);
		}
		
	}

}
