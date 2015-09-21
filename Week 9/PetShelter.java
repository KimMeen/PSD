/*  An example of using inheritance as a software design tool, and developing 
    code to match a specification.
    
    For this example, we need to develop the basic code structure for a pet
    shelter; we need to keep a record of a number of animals, each of which
    have their own specific attributes and methods.

    This example makes use of a number of classes that have not been defined.
    Our task is to provide the functionality the "user" is expecting.

    Author: Matthew De Bono
    Date:   21/9/15
*/

import java.util.Scanner;

public class PetShelter {
    
    private static final int MAX_ANIMALS = 10;
    
    private static final String VALID_ANIMALS[] = 
                            {"Dog", "Cat", "Horse"};
    
    public static void main(String args[]) {
        
        // Create our helpful Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Create our "database"
        Animal shelter[] = new Animal[MAX_ANIMALS];
        
        // A counter to record the number of animals
        int numberOfAnimals = 0;
        
        // Keep looping until the array is full, or the user exits
        while (numberOfAnimals < MAX_ANIMALS && isContinuing(scanner)) {
            // Let's ask the user for some input
            String type = getAnimalType(VALID_ANIMALS, scanner);
            
            shelter[numberOfAnimals] = getNewAnimal(type, scanner);
            
            numberOfAnimals++;
        }
        
        // Print out the details of the animals in our shelter
        displayAnimals(shelter, numberOfAnimals);
        
    }
    
    // Method to check if the user has more data to input
    public static boolean isContinuing(Scanner scanner) {
        System.out.println("Do you have any animals to add?");
        System.out.print("Y to add more, any other character to exit: ");
        
        String input = scanner.nextLine();
        
        if (input.equalsIgnoreCase("Y")) {
            System.out.println();
            return true;
        }
        
        return false;
    }
        
        
    
    // Prompts the user to enter the type of Animal they wish to add,
    // and continues to read data until a String that matches on of those
    // in the validTypes array is read
    public static String getAnimalType(String validTypes[], Scanner scanner) {
        System.out.println("Please input the type of animal to be added.");
        System.out.print("We can currently shelter: ");
        
        for (String s : validTypes) {
            System.out.print(s + " " );
        }
        System.out.println();
        
        // Keep reading until we get input that matches
        String type;
        do {
            System.out.print("Type of animal: ");
            
            type =  scanner.nextLine();
            
            if (isValidType(type, validTypes)) {
                    return type;
            } else {
                System.out.println("Please input one of the types above.");
            }
        } while (true);
    }
    
    // Checks if the user input an Animal type that we were expecting
    public static boolean isValidType(String type, String validTypes[]) {
        for (String s : validTypes) {
            if (s.equalsIgnoreCase(type)) {
                return true;
            }
        }
        
        return false;
    }
    
    // Calls the appropriate method to get a new Animal, depending on the input
    public static Animal getNewAnimal(String type, Scanner scanner) {
        // We could use a switch here, but the lab computers don't use Java 8...
        if (type.equalsIgnoreCase("Dog")) {
            return getNewDog(scanner);
        } else if (type.equalsIgnoreCase("Cat")) {
            return getNewCat(scanner);
        } else if (type.equalsIgnoreCase("Horse")) {
            return getNewHorse(scanner);
        }
        
        System.out.println("Something has gone terribly wrong!");
        System.exit(1);
        
        // To make the compiler happy
        return null;
    }
    
    // Gets a new Dog object from user input
    public static Dog getNewDog(Scanner scanner) {
        System.out.println("Please enter the Dog's information.");
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Breed: ");
        String breed = scanner.nextLine();
        
        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        
        return new Dog(name, breed, age);
    }
    
    // Gets a new Cat object from user input
    public static Cat getNewCat(Scanner scanner) {
        System.out.println("Please enter the Cat's information.");
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Indoor or outdoor: ");
        String indoor = scanner.nextLine().toLowerCase();
        
        return new Cat(name, indoor);
    }
    
    // Gets a new Horse object from user input
    public static Horse getNewHorse(Scanner scanner) {
        System.out.println("Please enter the Horse's information.");
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Owner: ");
        String owner = scanner.nextLine();
        
        System.out.print("Number of races: ");
        int numberOfRaces = Integer.parseInt(scanner.nextLine());
        
        return new Horse(name, owner, numberOfRaces);        
    }
    
    // Displays the details of each animal by calling each object's toString
    // and speak methods, making use of Java's polymorphism feature
    public static void displayAnimals(Animal shelter[], int numberOfAnimals) {
        for (int i = 0; i < numberOfAnimals; i++) {
            Animal a = shelter[i];
            System.out.println(a);
            System.out.println(a.getName() + " makes a " + a.speak() + 
                " noise.");
        }
    }
}