package week7.day2;

public class LearnConstructor {
	//Enter the details of an employee
	
	public int empID;
	public String empName;
	
    //Default Constructor
	public LearnConstructor() {
		System.out.println("I am default constructor");
	}
	
	//Parameterized Constructor
	public LearnConstructor(int empID, String empName) {
		this.empID=empID; 
		this.empName=empName;
		
	}
	
	public static void main(String[] args) {
		//LearnConstructor lc=new LearnConstructor();
		
		LearnConstructor lc1=new LearnConstructor(7, "Vineeth");
		System.out.println(lc1.empID);
		System.out.println(lc1.empName);
		
	}
	
	

}
//Types of constructor
	//default Constructor
	//Parameterized Constructor
	
	//It is special method
	//name of the Constructor should be same Classname
	//Does not have the return type