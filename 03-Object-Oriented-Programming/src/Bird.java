//	Inheritance

public class Bird extends Animal {

	public Bird(String name, int age, int height, String eyeColor) {
		super(name, age, height, eyeColor);
	}
	
//	public void fly() {
//		System.out.println(name + " is flying");
//	}
	
	public void move(){
		System.out.println("moving wings");
	}


}
