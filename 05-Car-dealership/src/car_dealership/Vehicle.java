package car_dealership;

public class Vehicle {
	
	private String name;
	private String model;
	private double price;
 
	public Vehicle(String name, String model, double price) {
		this.name = name;
		this.model = model;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", model=" + model + ", price=" + price + "]";
	}
	
}
