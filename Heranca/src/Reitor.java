
public class Reitor extends EmpregadoDaFaculdade {
	boolean coxinha;
	
	String getInfo(){
		if (this.coxinha)
			return super.getInfo() + " e ele � um reitor coxinha";
		else
			return super.getInfo() + " e ele n�o � um reitor coxinha";
	}
	
}
