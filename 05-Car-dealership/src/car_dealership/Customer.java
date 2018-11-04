package car_dealership;

public class Customer {
	
	private String name;
	private String address;
	private double cashonHand;
	
	public Customer(String name, String address, double cashonHand) {
		this.name = name;
		this.address = address;
		this.cashonHand = cashonHand;
	}


	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCashonHand() {
		return cashonHand;
	}
	public void setCashonHand(double cashonHand) {
		this.cashonHand = cashonHand;
	}
	
	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		emp.handleCustomer(this, finance, vehicle);
	}

}
