
public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// we cannot create instance of an abstract class

//		Animal cat = new Animal("nikko", 2, 3, "brown");
//		Animal cati = new Animal("cati", 5, 3, "green");
//		Animal faty = new Animal("faty", 10, 3, "black");
		
//		cat.speak();
//		System.out.println("----------------------------------------");
//		cati.speak();
//		System.out.println("----------------------------------------");
//		faty.speak();
		
		
		Bird kuku = new Bird("kuku", 2, 6, "gray");
		
		System.out.println("----------------------------------------");

		kuku.speak();

		System.out.println("----------------------------------------");

		Chicken chick = new Chicken("chick", 1, 1, "black");
		
		chick.speak();
		
		System.out.println("----------------------------------------");

		Sparrow spr = new Sparrow("some sparrow name", 6, 2, "white");
		
		spr.fly();
		
		System.out.println("----------------------------------------");
		
		kuku.move();
		
		System.out.println("----------------------------------------");

		Animal bird1 = new Bird("bird1", 2, 6, "gray");	
		Animal Nemo = new Fish("Nemo", 2, 6, "orange");	


		// Polymorphism
		moveAnimal(bird1);
		moveAnimal(Nemo);

	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
