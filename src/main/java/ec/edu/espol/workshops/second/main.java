package ec.edu.espol.workshops.second;

public class main {
	public static void main(String args[]) {
		Customer cliente1 = new Customer(85,"M","201598762",true);
		System.out.println("Cliente 1: "+CarInsurance.calcularPremium(cliente1)); 
		
		Customer cliente2 = new Customer(50,"F","201598762",true);
		System.out.println("Cliente 2: "+CarInsurance.calcularPremium(cliente2));
		
		Customer cliente3 = new Customer(19,"M","201598762",false);
		System.out.println("Cliente 3: "+CarInsurance.calcularPremium(cliente3));
		
		Customer cliente4 = new Customer(40,"M","20158762",false);
		System.out.println("Cliente 4: "+CarInsurance.calcularPremium(cliente4));
		
		Customer cliente5 = new Customer(50,"S","201598762",true);
		System.out.println("Cliente 5: "+CarInsurance.calcularPremium(cliente5));
		
		Customer cliente6 = new Customer(16,"F","201598762",false);
		System.out.println("Cliente 6: "+CarInsurance.calcularPremium(cliente6));
		
		Customer cliente7 = new Customer(22,"F","201598769",false);
		System.out.println("Cliente 6: "+CarInsurance.calcularPremium(cliente7));
	}
}
