/*  COMP90041 Week 5 Lab Test Code
    
    Performs some basic tests on the Character and Movie classes

    Author: Matthew De Bono
    Date:   28/8/15
*/

public class MovieTest {

	public static void main(String args[]) {
		
		// Create some Character objects to send to our Movie objects
		Character c1 = new Character("Tony Stark", "Robert Downy Jr.", 10, "Iron Man");
		Character c2 = new Character("Thor", "Chris Hemsworth", 7, "The Avengers");
		Character c3 = new Character("Tony Stark", "Robert Downy Jr.", 10, "Iron Man");
		
		// Let's run some tests on our Character class
		System.out.println("Beginning testing for Character class:");
		
		// Test the toString method
		System.out.println(c1.toString());
		System.out.println(c2);
		
		// Now the equals method
		// These should be false
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1));
		System.out.println(c3.equals(c2));
		
		// These should be true
		System.out.println(c1.equals(c1));
		System.out.println(c1.equals(c3));
		
		// Create some movies
		Movie m1 = new Movie("Iron Man", 123, 2, c1);
		Movie m2 = new Movie("The Avengers", 145, 1, c2);
		Movie m3 = new Movie("Iron Man", 123);
		Movie m4 = m1;
		
		// Now let's run some tests on our Movie class
		System.out.println("Beginning testing for Movie class:");
		
		// Test the toString method
		System.out.println(m1.toString());
		System.out.println(m2);
		
		// Now the equals method
		// These should be false
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m3.equals(m1));
		
		// These should be true
		System.out.println(m1.equals(m1));
		System.out.println(m1.equals(m4));
	}
}
