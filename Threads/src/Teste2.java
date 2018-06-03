
public class Teste2 {
	public static void main(String[] args) {
//Runnable r = new Runnable() {
		Runnable r = () ->{
			for (int i =0; i<10000; i++){
				System.out.println("programa 1 valor " + i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();		
	}
}
