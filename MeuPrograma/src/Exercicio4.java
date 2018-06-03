
public class Exercicio4 {
	public static void main (String args[]){
		
		int num2 = 0;
		
		for (int num = 1; num <=10; num++){
			num2 = num;
			int fat = 1;
			
			while (num2 > 1){
				fat = num2 * fat;
				num2 --;
			}
				System.out.println(fat);
		}
		
	}

}
