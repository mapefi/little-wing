
public class Fibonnacci {
	
	int calculaFibonnacci(int i){
		if(i==1 || i==2)
		    return 1;
		 else
		    return calculaFibonnacci(i-1) + calculaFibonnacci(i-2); 
		}
}
