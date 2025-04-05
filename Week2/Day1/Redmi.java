package week2.day1;

public class Redmi {
	
	//void - return nothing
	//int  - number
	//String - String Value
	

	public int numberOfCamera() {
      //int number=7;
		
		return 7;
		
	}
	
	public String fileName() {
		return "mp4";

	}
	
	public static void main(String[] args) {
		Redmi redmiOptions=new Redmi();
		redmiOptions.numberOfCamera();
		//System.out.println(redmiOptions.numberOfCamera()+500);
	    int number = redmiOptions.numberOfCamera();
	    String file = redmiOptions.fileName();
	    System.out.println(file);

	}

}
