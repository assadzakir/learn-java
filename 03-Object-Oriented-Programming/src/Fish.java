
public class Fish extends Animal{

	public Fish(String name, int age, int height, String eyeColor) {
		super(name, age, height, eyeColor);
	}
	
//	public void fly() {
//		System.out.println(name + " is flying");
//	}
	
	public void move(){
		System.out.println("swimming");
	}
}
