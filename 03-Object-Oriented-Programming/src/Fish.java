
public class Fish extends Animal{

	public Fish(String name, int age, int height, String eyeColor) {
		super(name, age, height, eyeColor);
	}
	
	// overriding the method defined in bird
	// Override = Replace
//	public void fly() {
//		System.out.println("Not able to fly");
//	}
	
	public void move(){
		System.out.println("swimming");
	}
}
