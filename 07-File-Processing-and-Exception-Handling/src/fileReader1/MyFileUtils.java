package fileReader1;

import com.assad.exceptions.FooRunTimeException;

public class MyFileUtils {

//	public int subtract10FromLargeNumber(int num) throws Exception {
//		if(num < 10) {
//			throw new Exception("The number passed was smaller than 10");
//		}else {
//			return num -10;
//		}
//		
//	}
	
	
	public int subtract10FromLargeNumber(int num) throws FooRunTimeException {
		if(num < 10) {
			throw new FooRunTimeException("The number passed was smaller than 10");
		}else {
			return num -10;
		}
		
	}
	
//	public class FooRunTimeException extends Exception{
//		public FooRunTimeException(String message) {
//			super(message);
//		}
//	}
}
