package ec.edu.espol.workshops.second;

public class main {
	public static void main(String args[]) {
		Customer cliente1 = new Customer(20,"M","201598762",true);
		System.out.println(CarInsurance.calcularPremium(cliente1)); //Si vale
		
		Customer cliente2 = new Customer(50,"M","201598762",true);
		System.out.println(CarInsurance.calcularPremium(cliente2)); //Si vale
		
		Customer cliente3 = new Customer(85,"M","201598762",true);
		System.out.println(CarInsurance.calcularPremium(cliente3)); //No vale
	}
}
