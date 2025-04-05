package week2.day1;

public class Access1 {
	
	public void depositAmount() {
		System.out.println("10 Lakhs");

	}
	
	private void withdrawAmount() {
		System.out.println("2 Lakhs");

	}
	
public static void main(String[] args) {
	Access1 bankOptions=new Access1();
	bankOptions.depositAmount();
	bankOptions.withdrawAmount();
	

	}

}
