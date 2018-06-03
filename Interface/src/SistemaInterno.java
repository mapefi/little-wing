
public class SistemaInterno {

	void login (InterfaceAutenticavel ia){
		int senha = 1234;
		boolean ok = ia.autentica(senha);
		System.out.println(ok);
	}
	
}
