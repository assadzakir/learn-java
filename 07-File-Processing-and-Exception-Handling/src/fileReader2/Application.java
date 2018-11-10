package fileReader2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("myFile.txt");
		BufferedReader bufferedReader = null;
		FileReader fileReader;

		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("File Not Found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Problem reading the file" + file.getName());

		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("Unable to close file" + file.getName());
			}
//			catch (NullPointerException e) {
//				// TODO Auto-generated catch block
////					e.printStackTrace();
//				System.out.println("File was probably never opened " + file.getName());
//			}
		}
		;
	}

}
