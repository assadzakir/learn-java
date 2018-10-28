public abstract class Animal {

	String name;
	int age;
	int height;
	String eyeColor;
	
	public Animal(String name, int age, int height, String eyeColor) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.eyeColor = eyeColor;
	}
	
	public void speak() {
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My Height is " + height);
		System.out.println("My Eye color is " + eyeColor);
	}
	
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	public abstract void move();
	
	
}
