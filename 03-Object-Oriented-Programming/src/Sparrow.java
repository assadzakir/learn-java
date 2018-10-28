
public class Sparrow extends Bird implements Flyable {

	public Sparrow(String name, int age, int height, String eyeColor) {
		super(name, age, height, eyeColor);
	}
	
	public void fly() {
		System.out.println(name + " can fly");
	}

}
