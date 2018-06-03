
public class Exercicio5 {
	public static void main (String args[]){
		
		long num2 = 0;
		
		for (long num = 1; num <=20; num++){
			num2 = num;
			long fat = 1;
			
			while (num2 > 1){
				fat = num2 * fat;
				num2 --;
			}
				System.out.println(fat);
		}
		
	}

}
