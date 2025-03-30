package week1.day2;

public class LearnOperators {
	
   public static void main(String[] args) {
		// Assignment Operator
		//Arithmetic Operator
		//Comparison Operator
		//Logical Operator
		//Increment/Decrement Operator
		
		// Assignment Operator (=) - assign a value to a variable
		
		int a=10;
		String name="MarchBatch";
		
		//Arithmetic Operator (Add, sub, mul, div)
		
		int b=7;
		int c=2;
		
		//Add (+)
		System.out.println(b+c);
		
		//Sub (-)
		System.out.println(b-c);
		
		//mul (*)
		System.out.println(b*c);
		
		//div Remainder, Quotient
		
		//To get the quotient (/)
		System.out.println(b/c);
		
		//To get the remainder (%)
		System.out.println(b%c);
		
		System.out.println("---------------");
		
		//Comparison Operator
		//Compare 2 values
		//If condition satisfies, It should return true
		//If condition not satisfies, Then it should return false
		//equalTo (==)
		//lessThan (<)
		//lessThanOrEqualTo  (<=)
		//greaterThan (>)
		//greaterThanOrEqualTo(>=)     
		
		int s=5;
		int t=6;
		
		System.out.println(s!=t);
		
		System.out.println(s==t);    //5==6  false
		
		System.out.println(s<t);     //5<6   true 
		
		System.out.println(s>t);      //5>6  false
		
		System.out.println(s<=t);     // 5<6   5==6

		System.out.println(s>=t);     //5>6    5==6
		
		System.out.println("----------------");
		
		//Logical Operator   -2 Conditions
		
		//And Operator (&&)   Condition1   and  Condition2 - True
		//Or Operator  (||)   Condition1    or  Condition2 - True
		
		int x=4;
		int y=5;
		
		
		//And
		System.out.println(x==y&&x>y);   //4==5    4>5
		
		//Or 
		System.out.println(x==y||x<y);   //4==5    4<5
		
		System.out.println("---------------");
		
		//Increment/Decrement Operator
		//Increment - preIncrement, postIncrement
		//Decrement - preDecrement, postDecrement
		
		//Increment - postIncrement - Increase the value by 1 (p++)
		int p=7;                //7
		System.out.println(p++); //7
		System.out.println(p);   //8
		
		//Increment - preIncrement - Increase the value by 1  (++p)
		System.out.println(++p); //9
		
		//Decrement - postDecrement - Decrease the Value by 1 (p--)
		System.out.println(p--); //9
		System.out.println(p);   //8
		
		//Decrement - preDecrement - Decrease the Value by 1  (--p)
		System.out.println(--p); // 7
		
	}

}