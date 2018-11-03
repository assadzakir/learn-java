package for_loop;

public class ForLoop {

	public static void main(String[] args) {

		int counter = 0;
		for(int d = 0; d < 100; d++) {
			for(int j=0; j<100; j++) {
				System.out.println("d = " +	d + " and j = " + j);
				counter++;
			}
		}
		System.out.println(counter);
	}

}
