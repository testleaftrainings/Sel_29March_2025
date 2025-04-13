package week3.day2;
//       inheritedClass extends BaseClass
//             SubClass extends SuperClass
//           ChildClass extends ParentClass
public class     Car    extends     Vehicle {
	
	
	public void applyHorn() {
		System.out.println("Horn applied");

	}
	
	

	public static void main(String[] args) {
		
		Car carOptions=new Car();
		carOptions.applyHorn();
		carOptions.applyBrake();

	}

}
