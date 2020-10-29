package ec.edu.espol.workshops.second;

public class CarInsurance {
	
	public static int  BASE = 500;
	private CarInsurance() {}
	
	public static int calcularPremium(Customer c) {
		int total= BASE;
		if(c.edad<65 && c.edad> 45) total-=100;
		if(c.sexo=="M" && c.Casado==false && c.edad<25 ) total+=1500;
		else if(c.sexo=="F" && c.Casado==true) total-=200;
		return total;
	}
}
