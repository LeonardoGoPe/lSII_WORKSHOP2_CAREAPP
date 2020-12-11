package ec.edu.espol.workshops.second;

public final class CarInsurance {
	
	public static final int  BASE = 600; //cambio 7
	private CarInsurance() {}
	
	public static int calcularPremium(Customer c) {
		int total= BASE;
		if(c.validar()==false ) return -1;
		if(c.edad<65 && c.edad> 45) total-=100;
		if(c.sexo.equals("M") && c.casado==false && c.edad<25 ) total+=1500;
		else if(c.sexo.equals("F") && c.casado==true) total-=200;
		
		return total;
	}
}
