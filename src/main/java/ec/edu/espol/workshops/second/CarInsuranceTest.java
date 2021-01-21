package ec.edu.espol.workshops.second;

import static org.junit.Assert.*;
import org.junit.Test;


public class CarInsuranceTest {

	@Test
	public void testCalcularPremium() {}
	
	@Test
	public void testCalcularPremiumClient1() {
		Customer cliente1 = new Customer(30,"M","201508276",false);
		assertEquals("Client 1 must be 400", 400, CarInsurance.calcularPremium(cliente1));
	}
	
	@Test
	public void testCalcularPremiumClient2() {
		Customer cliente2 = new Customer(21,"M","201508212",false);
		assertEquals("Client 2 must be 2000", 2000, CarInsurance.calcularPremium(cliente2));
	}
	
	@Test
	public void testCalcularPremiumClient3() {
		Customer cliente3 = new Customer(50,"F","201508222",true);
		assertEquals("Client 3 must be 200", 200, CarInsurance.calcularPremium(cliente3));
	}
	
	@Test
	public void testCalcularPremiumClient4() {
		/*Customer cliente4 = new Customer("aa","M","20158762",false);
		assertEquals("Client 1 must be 400", 400, CarInsurance.calcularPremium(cliente1));*/
	}
	
	@Test
	public void testCalcularPremiumClient5() {
		Customer cliente5 = new Customer(85,"F","201598444",true);
		assertEquals("Client 5 must be -1", -1, CarInsurance.calcularPremium(cliente5));
	}
	
	@Test
	public void testCalcularPremiumClient6() {
		Customer cliente6 = new Customer(16,"F","201598555",false);
		assertEquals("Client 6 must be -1", -1, CarInsurance.calcularPremium(cliente6));
	}
	
	@Test
	public void testCalcularPremiumClient7() {
		Customer cliente7 = new Customer(50,"F","20159866",true);
		assertEquals("Client 7 must be -1", -1, CarInsurance.calcularPremium(cliente7));
	}
	
	@Test
	public void testCalcularPremiumClient8() {
		Customer cliente8 = new Customer(50,"S","201598777",true);
		assertEquals("Client 8 must be -1", -1, CarInsurance.calcularPremium(cliente8));
	}

}
