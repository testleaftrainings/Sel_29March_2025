package week3.day2;

//          ChildClass  extends   ParentClass
public class Audi       extends    Car {

	public void advancedBraking() {
		System.out.println("Advanced braking");

	}
	
	public static void main(String[] args) {
		Audi audiOptions=new Audi();
		audiOptions.applyBrake();
		audiOptions.applyHorn();
		audiOptions.advancedBraking();
	}
	
	
}
