/*  An example of writing class methods.
    Class methods are "actions" that may be performed by a class, 
    without the need for an object to be created.
    
    Examples of class methods are Math.pow, Math.sqrt, Integer.parseInt, 
    and more. Notice how you use the class' name, and not an object, to call 
    these methods. 
    
    We use class methods when the action does not depend on any "instance 
    variables", meaning the action is not applied to an object.

    Author: Matthew De Bono
    Date:   17/8/15
*/

import java.util.*;

public class Methods {
    
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please tell me which method you would like to use");
        
        int num = scanner.nextInt();
        
        // Depending on the number input, we will use one of our class methods
        switch(num) {
        case 0:
        // If the user inputs a 0, we will call the printGuardians class method
            Methods.printGuardians();
            break;
        case 1:
        // If the user inputs a 1, we will call the printAvengers class method
        // Notice that we can call methods without the class name if we're in
        // that class
            printFantasticFour();
            break;
        case 2:
        // If the user inputs a 2, we will call the overloaded
        // printAvengers class method
            printAvengers();  
            break;
        case 3:
        // If the user inputs a 3, we will call the second version
        // of the printAvengers class method
            System.out.println("The Avengers have changed over time; enter the "
                + "year of the movie to see who the Avengers were at the time");
            int year = scanner.nextInt();
            printAvengers(year);
            break;
        default:
        // Finally, if we don't know what they entered, we can use a class
        // method to print an error
            printError();
            
    }
    
    // This method prints out the members of the Guardians of the Galaxy
    public static void printGuardians() {
        System.out.println("The Guardians of the Galaxy are Peter Quill, " +
            "Gamora, Drax the Destroyer, Groot and Rocket");
    }
    
    // This method prints out the members of the Fantastic Four
    public static void printFantasticFour() {
        System.out.println("The Fantastic 4 are Mr. Fantastic, the Thing, " + 
            "the Invisible Woman, and the Human Torch");
    }
    
    // This method prints out the original members of the Avengers
    public static void printAvengers() {
        System.out.println("The original Avengers were Iron Man, Captain " +
            "America, The Incredible Hulk, Thor, Black Widow, and Hawkeye");
    }
    
    public static void printAvengers(int year) {
        
        if (year == 2012) {
            System.out.println("The original Avengers were Iron Man, Captain " +
            "America, The Incredible Hulk, Thor, Black Widow, and Hawkeye");
        } else if (year == 2015) {
            System.out.println("The new Avengers are Captain America, Black " +
                "Widow, War Machine, The Vision, Falcon, and Scarlet Witch");
        } else {
            System.out.println("I don't know what you're referring to...");
        }
    }
    
    // This method prints an error message for the user
    public static void printError() {
        System.out.println("Incorrect input, please try again.");
    }
    
}