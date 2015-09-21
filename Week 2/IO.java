/*  An example of using the Scanner class to accept user input, and various ways
    of processing the input.

    Author: Matthew De Bono
    Date:   2/8/15
*/

// Without this line, we won't be able to use the Scanner class
import java.util.Scanner;

public class IO {
    
    public static void main(String args[]) {
        
        // Create a new object
        Scanner scanner = new Scanner(System.in);
        
        // Tell the user we want some information; you should usually use
        // prompts when you are getting input from an external source
        System.out.println("Hello there! Who is your favourite Avenger?");
        
        // Now we get the input
        String userFavourite = scanner.nextLine();
        String mattFavourite = "Iron Man";
        
        // We can now use the input to do some "stuff"
        if (!userFavourite.equals(mattFavourite)) {
            System.out.println("I'm afraid I have to disagree with you...");
            System.out.println(userFavourite + " could never compete with "
                + mattFavourite.toUpperCase() + "!");
        }
        
        // How about some numbers?
        
        // One way to process numbers is to get Scanner to do the work
        System.out.println("\nIn what year was your favourite Marvel movie?");
        int year = scanner.nextInt();
        // Need to make sure we eat up the "newline" character after the number
        scanner.nextLine();
        
        // Or, we can do the work ourselves
        System.out.println("\nHow highly would you rate \"Avengers: " +
            "Age of Ultron\" out of 10.0?");
        String ratingString = scanner.nextLine();
        double ratingNum = Double.parseDouble(ratingString);
        
        System.out.println("Only " + ratingNum + "/10.0? It was definitely " +
            "10.0/10.0!");
        
        System.out.println("\nThis interview is over, I'm off to watch Ant-Man!");
    }
    
}