package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust = new Customer("Assad zakir hussain", "st 1590", 300000);
		Vehicle veh = new Vehicle("Honda", "2019", 400000);
		Employee emp = new Employee();

		cust.purchaseCar(veh, emp, true);


	}

}
