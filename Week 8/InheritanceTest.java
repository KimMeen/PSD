/*  An example of using inheritance as a software design tool.

    In the provided class we define Movie as a superclass, and then multiple 
    different types of Movie subclass that are more specific examples of Movie. 

    Author: Matthew De Bono
    Date:   12/9/15
*/

public class InheritanceTest {
    
    public static void main(String args[]) {
        
        // First, a simple example of inheritance
        Movie m1 = new Movie(1, "Casino Royale");
        ActionMovie m2 = new ActionMovie(1, "Casino Royale", 9999, true);
        
        // While ActionMovie is a subclass of Movie (so they are related), 
        // they are different classes, so can never be equal, even with the
        // same information
        System.out.println(m1.equals(m2));
        System.out.println(m2.equals(m1));
        
        // Because we have a slightly different implementation of equals,
        // it pays to make sure it works correctly
        System.out.println(m1.equals(m1));
        System.out.println(m2.equals(m2));
        
        // More inheritance!
        ComedyMovie m3 = new ComedyMovie(2, "Bruce Almighty", 9999, 
            "Q: How many programmers does it take to change a light bulb?\n" +
            "A: None, that's a hardware problem.");
        
        // Different subclasses should never be equal to each other
        System.out.println(m2.equals(m3));
        System.out.println(m3.equals(m2));
        
        // Even more inheritance!
        // A subclass object can be "upcast" to exist inside its parent class,
        // which is useful for storing different subclasses in, say, an array
        // However, m4 now loses its ability to act as an Animated Movie
        // Trying to do something like "m4.setCreator("Pixar");" now won't work,
        // try it out!
        Movie m4 = new AnimatedMovie(3, "How To Train Your Dragon", 90000000,
            398, "DreamWorks");
        
        // Going the other way (downcasting), is possible, but only when it
        // makes sense to do so. An AnimatedMovie that has been upcast to a 
        // Movie can be downcast back to an AnimatedMovie, but a Movie that
        // began as a Movie can never be cast to any of its subclasses
        AnimatedMovie m5 = (AnimatedMovie) m4;
        
        // Now let's see what's inside our objects
        System.out.println(m1 + "\n");
        System.out.println(m2 + "\n");
        System.out.println(m3 + "\n");
        System.out.println(m4 + "\n");
        System.out.println(m5 + "\n");
    }
}