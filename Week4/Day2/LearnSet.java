package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		//HashSet
		//Set<String> mentors=new HashSet<String>();
		//System.out.println("The set is: "+mentors);
		
		//TreeSet
		//Set<String> mentors=new TreeSet<String>();
		
		//LinkedHashSet
		Set<String> mentors=new LinkedHashSet<String>();
		
		//add
		mentors.add("Bhuvanesh");
		mentors.add("Vinoth");
		mentors.add("Muthu");
		mentors.add("Mukesh");
		System.out.println("The set is: "+mentors);
		
		//             0        1         2     3
		//HashSet  [Vinoth, Bhuvanesh, Muthu, Mukesh]
		//              0        1       2      3
		//TreeSet  [Bhuvanesh, Mukesh, Muthu, Vinoth]
		//             0         1       2      3
		//Linked   [Bhuvanesh, Vinoth, Muthu, Mukesh]
		
		//Add the duplicate
         mentors.add("muthu");
         System.out.println("Set after adding duplicate: "+mentors);
         
         //Remove an element
         mentors.remove("Muthu");
         System.out.println("Set after removing: "+mentors);
         
         //Size
         int sizeOfSet = mentors.size();
         System.out.println("The size of set is: "+sizeOfSet);
         
         //addAll - add all the elements from one set to another set
         Set<String> trainers=new HashSet<String>();
         System.out.println("The trainers set is: "+trainers);
         trainers.addAll(mentors);
         System.out.println("The current trainers set is: "+trainers);
         
         //To retrieve an element
         //Covert Set into List
         //Create one empty list
         List<String> allTrainers=new ArrayList<String>(trainers);
         System.out.println("The trainers list is: "+allTrainers);
         
         //To retrieve element at index1
         String elementAtIndex1 = allTrainers.get(1);
         System.out.println(elementAtIndex1);
         
         //To declare a Integer Set
         Set<Integer> numbers=new HashSet<Integer>();
         
         //To declare the Character Set
         Set<Character> logo=new HashSet<Character>();
        }
}
