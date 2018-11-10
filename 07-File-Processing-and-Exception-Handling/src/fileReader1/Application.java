package fileReader1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter some text");
//		String enteredText = input.nextLine();
//		System.out.println(enteredText);

		File file = new File("myfile.txt");

		Scanner input;
		try {
			input = new Scanner(file);

			while (input.hasNextLine()) {
				String line = input.nextLine();

				System.out.println(line);
			}

			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("File Not Found");
		}
		
		
		MyFileUtils myUtil = new MyFileUtils();
		
		try {
			System.out.println(myUtil.subtract10FromLargeNumber(11));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
