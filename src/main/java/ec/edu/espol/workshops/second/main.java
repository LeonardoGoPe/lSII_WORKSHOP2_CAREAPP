package ec.edu.espol.workshops.second;

public class main {
	public static void main(String args[]) {
		Customer cliente1 = new Customer(30,"M","201508276",false);
		System.out.println("Cliente 1: "+CarInsurance.calcularPremium(cliente1)); 
		
		Customer cliente2 = new Customer(21,"M","201508212",false);
		System.out.println("Cliente 2: "+CarInsurance.calcularPremium(cliente2));
		
		Customer cliente3 = new Customer(50,"F","201508222",true);
		System.out.println("Cliente 3: "+CarInsurance.calcularPremium(cliente3));
		
		/*Customer cliente4 = new Customer("aa","M","20158762",false);
		System.out.println("Cliente 4: "+CarInsurance.calcularPremium(cliente4));*/
		
		Customer cliente5 = new Customer(85,"F","201598444",true);
		System.out.println("Cliente 5: "+CarInsurance.calcularPremium(cliente5));
		
		Customer cliente6 = new Customer(16,"F","201598555",false);
		System.out.println("Cliente 6: "+CarInsurance.calcularPremium(cliente6));
		
		Customer cliente7 = new Customer(50,"F","20159866",true);
		System.out.println("Cliente 7: "+CarInsurance.calcularPremium(cliente7));
		
		Customer cliente8 = new Customer(50,"S","201598777",true);
		System.out.println("Cliente 8: "+CarInsurance.calcularPremium(cliente8));
	}
}
