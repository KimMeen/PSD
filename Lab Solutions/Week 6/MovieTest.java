/*  COMP90041 Week 6 Lab Test Code
    
    Performs some basic tests on the Character and Movie classes

    Author: Matthew De Bono
    Date:   31/8/15
*/

public class MovieTest {

    public static void main(String args[]) {
        
        // Create some Character objects to send to our Movie objects
        Character c1 = new Character("Tony Stark", "Robert Downy Jr.", 
            10, "Iron Man");
        Character c2 = new Character("Thor", "Chris Hemsworth", 7, 
            "The Avengers");
        Character c3 = new Character(c1);
        
        // Let's run some tests on our Character class
        System.out.println("\nTESTING CHARACTER CLASS:");
        
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
        
        // We can now modify our Character objects
        c1.setMovieTitle("The Avengers");
        System.out.println(c1);
        
        // Create some movies
        Movie m1 = new Movie("The Avengers", 123, 1, c1);
        Movie m2 = new Movie("The Avengers: Age of Ultron", 145, 2, c2);
        Movie m3 = new Movie("Iron Man", 123);
        Movie m4 = new Movie(m1);
        Movie m5 = m1;
        
        // Now let's run some tests on our Movie class
        System.out.println("\nTESTING MOVIE CLASS:");
        
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
        
        // We can also modify the Movie objects
        m1.setTitle("The Avengers: Age of Ultron");
        System.out.println(m1);
        System.out.println(m4);
        System.out.println(m5);
        
        // Notice that m1 and m5 both change, but m4 remains the same
        // m1 and m5 are aliases, they both point to the same object
        // However, m4 was created with a copy constructor, 
        // so it exists on it's own
        
        // Finally, let's see if we have any privacy leaks
        System.out.println("\nTESTING PRIVACY LEAKS");
        c1 = new Character("Tony Stark", "Robert Downy Jr.", 10, "Iron Man");
        m1 = new Movie("Iron Man", 126, 1, c1);
        
        // Print our initial objects
        System.out.println("Character:\n" + c1);
        System.out.println("Movie:\n" + m1);
        
        c1.setMovieTitle("The Avengers");
        m2 = new Movie("The Avengers", 146, 2, c1);
        
        System.out.println("Character:\n" + c1);
        System.out.println("Movie:\n" + m1);
        System.out.println("Movie:\n" + m2);
        
        // Because mainCharacter is an object of type Character, we have the
        // potential for a privacy leak; by modifying c1, a privacy leak would
        // result in the mainCharacter of m1 changing, now having its title as
        // "The Avengers" and matching m2.
        
        // But when we print the objects, c1 has changed, but the character in
        // m1 remains the same. We've avoided privacy leaks!
        System.out.println("\nYAY!");
    }
}
