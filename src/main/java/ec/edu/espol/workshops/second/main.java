package ec.edu.espol.workshops.second;

public class main {
	public static void main(String args[]) {
		Customer cliente1 = new Customer(30,"M","201508276",false);
		System.out.println("Cliente 1: "+CarInsurance.calcularPremium(cliente1)); 
		
		Customer cliente2 = new Customer(19,"M","201508212",false);
		System.out.println("Cliente 2: "+CarInsurance.calcularPremium(cliente2));
		
		Customer cliente3 = new Customer(18,"M","201508619",false);
		System.out.println("Cliente 3: "+CarInsurance.calcularPremium(cliente3));
		
		Customer cliente4 = new Customer(79,"M","201502000",false);
		System.out.println("Cliente 4: "+CarInsurance.calcularPremium(cliente4));
		
		Customer cliente5 = new Customer(80,"M","201503000",false);
		System.out.println("Cliente 5: "+CarInsurance.calcularPremium(cliente5));
		
		Customer cliente6 = new Customer(50,"F","201508222",true);
		System.out.println("Cliente 6: "+CarInsurance.calcularPremium(cliente6));
		
		/*
		Customer cliente7 = new Customer("aa","F","201508333",true);
		System.out.println("Cliente 7: "+CarInsurance.calcularPremium(cliente7));
		*/
		
		Customer cliente8 = new Customer(81,"F","201508444",true);
		System.out.println("Cliente 8: "+CarInsurance.calcularPremium(cliente8));
		
		Customer cliente9 = new Customer(17,"F","201508555",false);
		System.out.println("Cliente 9: "+CarInsurance.calcularPremium(cliente9));
		
		Customer cliente10 = new Customer(50,"F","20150866",true);
		System.out.println("Cliente 10: "+CarInsurance.calcularPremium(cliente10));
		
		Customer cliente11 = new Customer(50,"S","201508777",true);
		System.out.println("Cliente 11: "+CarInsurance.calcularPremium(cliente11));
	}
}
