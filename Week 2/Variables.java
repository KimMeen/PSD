/* A simple example showing the use of variables in Java, some operations we
can perform on variabels, and how to use/access methods of variables. 

An important point to remember is that String variables are objects, whereas
ints, doubles and booleans are primitive types; we'll talk about the difference
in a few weeks.

    Author: Matthew De Bono
    Date:   2/8/15
*/

public class Variables {
    
    public static void main(String args[]) {
        // Let's create a few primitive variables
        boolean isEqual;
        // We can define multiple variables at the same time
        int x, y;
        // We can also initialise variables when we define them
        double u = 1.0, v = 2.0000000000000001/2;
        // Defining "objects" is the same as primitives
        String s1, s2;
        
        // We should initialize x and y before we do anything with them
        x = 10;
        y = 5;
        
        // You can perform operations to assign new values to variables
        y = 2*y;
        
        // There are a lot of applications where you want to check two things
        // are equal
        System.out.println(x + " equals " + y + ": " + (x == y));
        
        // You can also assign values to booleans with equality
        isEqual = (x == y);
        System.out.println(x + " equals " + y + ": " + isEqual);
        
        // But you should never do this with doubles!
        // Look carefully at u and v, are they be equal?
        isEqual = (u == v);
        System.out.println(u + " equals " + v + ": " + isEqual);
        
        // Don't use == on objects either! We have a different technique
        s1 = "Hello";
        s2 = "Hello";
        System.out.println(s1 + " equals " + s2 + ": " + s1.equals(s2));        
    }
    
}