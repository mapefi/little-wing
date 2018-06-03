
public class BalancoTrimestral {
	public static void main (String args[]){
		double gastosJaneiro = 15000;
		double gastosFevereiro = 23000;
		double gastosMarco = 17000;
		double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println(gastosTrimestre);
		
		double mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco) / 3;
		
		System.out.println("Media mensal: " + mediaMensal);
		
	}	


}
