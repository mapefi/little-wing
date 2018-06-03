
public class Reitor extends EmpregadoDaFaculdade {
	boolean coxinha;
	
	String getInfo(){
		if (this.coxinha)
			return super.getInfo() + " e ele é um reitor coxinha";
		else
			return super.getInfo() + " e ele não é um reitor coxinha";
	}
	
}
