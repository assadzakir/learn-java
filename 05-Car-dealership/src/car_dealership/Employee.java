package car_dealership;

public class Employee {

	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle){
		
		if (vehicle.getPrice() <= cust.getCashonHand()) {
			// customer pays in cash
			processTransaction(cust, vehicle);
		} else if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashonHand();
			runCreditHistory(cust, loanAmount);
		} else {
			System.out.println("Customer will need more money to purchase vehicle " + vehicle);
		}
		
	}
	
	public static void runCreditHistory(Customer cust, double loanAmount){
		System.out.println("Ran Credit History for customer...");
		System.out.println("Customer has been approved to purchase the vehicle");

	}
	
	public static void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle " + vehicle + " for the "
				+ "price " + vehicle.getPrice());
	}
}
