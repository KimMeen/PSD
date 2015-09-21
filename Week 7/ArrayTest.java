/*  An example of using arrays.

    Arrays are a much more convenient way of storing multiple objects of the
    same type, and means we don't need to create many variables to achieve this.

    Author: Matthew De Bono
    Date:   5/9/15
*/

import java.util.*;

public class ArrayTest {
    
    public static void main(String args[]) {
        
        // First we create some Person objects
        System.out.println("CREATING OBJECTS");
        Person p1 = new Person("Matt");
        Person p2 = new Person("Peter", 10);
        
        System.out.println(p1);
        System.out.println(p2);
        
        // And some Movie objects for them to have as favourites
        Movie m1 = new Movie(1, "The Avengers");
        Movie m2 = new Movie(2, "Iron Man");
        Movie m3 = new Movie(2, "The Incredible Hulk");
        Movie m4 = new Movie(2, "Thor");
        Movie m5 = new Movie(4, "Captain America");
        
        // Let's try our add method, and see if adds to the bottom of the list
        System.out.println("ADDING MOVIE TO LIST");
        p1.addFavourite(m1);
        p2.addFavourite(m1);
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println("ADDING MORE MOVIES");
        p1.addFavourite(m2);
        p2.addFavourite(m3);
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println("LAST ADDITIONS");
        p1.addFavourite(m4, m4.getRank());
        p2.addFavourite(m5, m5.getRank());
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println("ERROR TESTING");
        Movie m6 = new Movie(6, "One Direction On Tour");
        // This will fail, because p1 can only have 5 favourites,
        // and index 6 does not exist
        System.out.println(p1.addFavourite(m6, m6.getRank()));
        // This will succeed, since Peter's list is bigger
        System.out.println(p2.addFavourite(m6, m6.getRank()));
        
        // If we try to use an index less than 0, it will also fail
        // We also don't need to assign an object to a variable to assign it
        System.out.println(
            p1.addFavourite(new Movie(5, "The Amazing Spiderman"), -2));
        
        // And finally, because the Movie class is mutable, and the Person class
        // does not use the copy constructor, we have introduced another leak
        System.out.println("\nA WILD PRIVACY LEAK APPEARED");
        System.out.println(p1);
        System.out.println(p2);
        m1.setRank(10);
        m1.setTitle("The Avengers: Age of Ultron");
        System.out.println(p1);
        System.out.println(p2);
        
    }
}