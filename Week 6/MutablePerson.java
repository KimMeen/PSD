/*  An example of writing a mutable class.

    An immutable class cannot be modified after its creation, which is useful 
    for avoiding privacy leaks - the ability for another object to modify ours
    without our permission, or in a way that we can't control.
    
    A mutable class, however, can be modified, so it is up to the programmer
    to ensure that bugs and "strange behaviour" are not introduced as a result
    of privacy leaks.

    Author: Matthew De Bono
    Date:   24/8/15
*/

import java.util.*;

public class MutablePerson {
    
    // We always use private for instance variables
    private String familyName;
    private String givenName;
    private int age;
    
    // This variable is a mutable object, so be careful about privacy
    private MutablePerson parent;
    
    public static void main(String args[]) {
        // Let's create a few objects
        MutablePerson p1 = 
            new MutablePerson("", "Mr. Incredible", 37, null);
        MutablePerson p2 = new MutablePerson("", "Elastigirl", 35);
        MutablePerson p3 = new MutablePerson("Parr", "Dash", 13, p1);   
        MutablePerson p4 = new MutablePerson("Parr", "Violet", 17, p1);
        MutablePerson p5 = p1;
        
        // We can use toString to print a representation of the object
        System.out.println("\nTESTING TOSTRING METHOD");
        System.out.println(p1.toString());
        
        // Java is smart enough that you don't actually need to call the method
        System.out.println(p2);
        System.out.println(p3);
        
        // Now let's try the equals method; this should print false
        System.out.println("\nTESTING EQUALS METHOD");
        System.out.println("Testing p1 with p4, expecting false as they are " +
            " different objects: " + p1.equals(p4));
        System.out.println("Testing p4 with p1, expecting false as they are " +
            " different objects: " + p4.equals(p1));
        System.out.println("Testing p1 with p2, expecting false as they are " +
            " different objects: " + p1.equals(p2));
        // This is true
        System.out.println("Testing p1 with p1, expecting true as they are " +
            " the same objects: " + p1.equals(p1));
        System.out.println("Testing p1 with p5, expecting true as they " +
            "point to the same object: " + p1.equals(p5));
        System.out.println("Testing parent of p3 with parent of p4, " +
            "expecting true, same parent: " +
            p3.getParent().equals(p4.getParent()));
        
        // We can now modify our objects because of the set methods
        System.out.println("\nTESTING SETTERS");
        // Here is the starting object
        System.out.println(p1);
        
        // Now we modify it and check again
        p1.setAge(20);
        System.out.println(p1);
        
        p1.setFamilyName("Parr");
        System.out.println(p5);
        
        // Let's make sure we've prevented privacy leaks
        System.out.println("\nTESTING PRIVACY LEAKS");
        System.out.println(p3);
        System.out.println(p4);
        p1.setFamilyName("");
        System.out.println(p3);
        System.out.println(p4);
        
        System.out.println("\nUh oh...");
        
    }
    
    // Constructors are used to construct or build a class
    public MutablePerson(String familyName, String givenName, int age,
        MutablePerson parent) {
        // Here we make use of 'this' to differentiate between variables
        // with the same name
        this.familyName = familyName;
        this.givenName = givenName;
        this.age = age;
        
        if (parent != null) {
        	this.parent = new MutablePerson(parent);
        }
    }    
    
    // We can even have multiple constructors
    // Constructors don't need to take information for every variable
    public MutablePerson(String familyName, String givenName, int age) {
        // Here we make use of 'this' to differentiate between variables
        // with the same name
        this.familyName = familyName;
        this.givenName = givenName;
        this.age = age;
        
        // We should always initialise every variable, 
        // even if we aren't given all the information
        this.parent = null;
    }    
    
    public MutablePerson(String familyName, String givenName) {
        this.familyName = familyName;
        this.givenName = givenName;
        this.age = 0;
        this.parent = null;
    }
    
    // A copy constructor is useful for avoiding privacy leaks
    public MutablePerson(MutablePerson person) {
        this.familyName = person.familyName;
        this.givenName = person.givenName;
        this.age = person.age;
        
        if (person.parent != null) {
            // When we have mutable objects as instance variables, we need to be
            // sure to get copies of those too, otherwise we will create aliases
            this.parent = new MutablePerson(person.parent);
        } else {
            this.parent = null;
        }
    }        
    
    // Accessors/Getters
    // These methods are fine, as they don't modify the class
    public String getFamilyName() {
        return familyName;
    }
    
    public String getGivenName() {
        return givenName;
    }
    
    public int getAge() {
        return age;
    }
    
    // We should never return references to mutable objects
    // Instead, we return a copy of our object so it remains private
    public MutablePerson getParent() {
        if (parent == null) {
            return null;
        }
        
        return new MutablePerson(parent);
    }
    
    // Mutators/Setters
    // These methods directly modify the class, so it is no longer immutable
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // When a mutable object is given as an argument, it's always safest to 
    // make a copy of it
    public void setParent(MutablePerson parent) {
        this.parent = new MutablePerson(parent);
    }
    
    // It's always useful to define these methods
    // toString should return a String that represents the object
    public String toString() {
        String out = givenName + " " + familyName + " is " 
            + age + " years old.";
            
        if (parent != null) {
            out += "\nParent: " + parent.toString();
        }
        
        return out;
    }
    
    // equals should return true only when the two objects are considered equal
    // Not all variables need to be equal though, you can decide on equality
    // however you like
    public boolean equals(MutablePerson p) {
        if (!this.familyName.equals(p.getFamilyName())) {
            return false;
        }
        if (!this.givenName.equals(p.getGivenName())) {
            return false;
        }
        if (this.age != p.getAge()) {
            return false;
        }
        if (this.parent != null && p.getParent() != null &&
            !this.parent.equals(p.getParent())) {
            return false;
        }
        if ((this.parent == null && p.getParent() != null) ||
            (this.parent != null && p.getParent() == null)) {
            return false;
        }   
        
        return true;
    }
}