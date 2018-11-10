package autoCloseable;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Myclass2 var = new Myclass2();) {

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

class Myclass2 implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub

		System.out.println("closing");

	}

}