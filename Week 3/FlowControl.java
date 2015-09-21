/* An example of using the Scanner class to accept user input, and using loops
and branching to control the flow of execution

    Author: Matthew De Bono
    Date:   10/8/15
*/

// Without this line, we won't be able to use the Scanner class
import java.util.Scanner;

public class FlowControl {
    
    public static void main(String args[]) {
        
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // This loop will continue running forever, so we need be sure it stops
        do {
        
            // Inform the user you are talking to them
            System.out.print("Please tell me your favourite Avenger: ");
            
            String input = scanner.nextLine();
            
            System.out.println("Are you sure " + input + " is your favourite?");
            System.out.print("I'll give you a chance to reconsider: ");
            
            String oldInput = input;
            input = scanner.nextLine();
            
            // We can use an if to check if the user changed their input
            if (input != oldInput) {
                System.out.println("I see you changed your mind! But did you" +
                    " get the correct answer?");
            } else {
                System.out.println("You must be really sure of yourself...");
            }
            
            // The switch is like an if, but works by checking through a number
            // of potential options (cases), rather than computing a boolean
            // expression
            switch (input) {
                case "The Hulk":
                case "Hulk":
                    System.out.println("The Hulk is pretty cool, " +
                        "but not the best Avenger");
                    // The continue statement tells the program to restart the
                    // nearest loop, which in this case is the while
                    continue;
                case "Thor":
                    System.out.println("Now that's just silly!");
                    continue;
                case "Captain America":
                    System.out.println("Try again...");
                    continue;
                case "Hawkeye":
                    System.out.println("He does have a cool bow I suppose!");
                    continue;
                case "Black Widow":
                    System.out.println("I won't blame you for that :)");
                    continue;
                // Even though these two cases catch the same input, they still
                // need to be written seperately
                case "Iron Man":
                case "Ironman":
                    System.out.println("Correct answer! You can go now.");
                    // The break statement ends the switch, and allows it to 
                    // continue further into the program
                    break;
                // You don't always need a default case, 
                // but sometimes it can be useful
                default:
                    System.out.println("You clearly don't know your Avengers..."
                        + " Let me give you a refresher.");
                    printAvengers();
                    continue;
            }
            
            // Only after you input Iron Man will the program reach this point
            return;
            
        } while(true);
    }
    
    public static void printAvengers() {
        
        // We create an array of Strings
        String avengers[] = {"Thor", "Black Widow", "Hawkeye", "The Hulk", 
        "Captain America", "Iron Man"};
        
        // Now we use a loop to print each String
        // This is a special for loop for "iterable" objects, like arrays
        System.out.println("The Avengers are: ");
        for (String s : avengers) {
            System.out.println(s);
        }
    }
}