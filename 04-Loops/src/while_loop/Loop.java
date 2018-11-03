package while_loop;
public class Loop {

	public static void main(String[] args) {
		
		String str = "We have a large inventory of things in our warehouse falling"
				+ "the category:apperal and the slighty "
				+ "more in demand category:makeup along with the category:furniture and ...";
		
		printCategory(str);

	}
	
	
/*	public static void printCategory(String str){
		String[] newStr = str.split(":");
		for(int i=1;i<newStr.length;i++)
	      System.out.println(newStr[i].split(" ")[0]);
	    };*/
	
	public static void printCategory(String str) {
		int i = 0;
		while(true) {
			int found = str.indexOf("category:", i);
			if(found == -1) break;
			int start = found+9;
			int end  = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			i = end+1;
		}
	}
	

}
