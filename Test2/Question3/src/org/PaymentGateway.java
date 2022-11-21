package org;


public class PaymentGateway {

	public void checkMethod(long cred, int cvv, String name) throws InvalidCreditCard, InvalidCVV,InvalidName
	{
		String cred1 = Long.toString(cred);
		System.out.println(cred1);
		String cvv1 = Integer.toString(cvv);
		if(cred1.length() != 16) {
			throw new InvalidCreditCard("length of the credit card must be 16");
		}
	
		else if(cvv1.length() < 4) {
			throw new InvalidCVV("The CVV number number should be minimum 4 digit");
		}
		
		else if(name == "") {
			throw new InvalidName("The name of the customer should be not be null");
		}
		else {
			System.out.println("credit card "+cred1);
			System.out.println("cvv " + cvv1);
			System.out.println("name "+ name);
		}
		
	}
}