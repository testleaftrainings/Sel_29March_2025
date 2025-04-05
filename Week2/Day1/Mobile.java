package week2.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Call");
	}
	
	public void sendSms() {
		System.out.println("Message");
	}
	
	public static void main(String[] args) {
		//System.out.println("It a main method");
		//ClassName objName=new ClassName();
		Mobile mobileOptions=new Mobile();
		mobileOptions.makeCall();
		mobileOptions.sendSms();
		
	}
	
}

