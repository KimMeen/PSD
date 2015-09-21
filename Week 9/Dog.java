/*  A Dog class, which inherits from Animal and makes a concrete class.

    Author: Matthew De Bono
    Date:   21/9/15
*/

public class Dog extends Animal {
    
    private String breed;
    private int age;
    
    public Dog(String name, String breed, int age) {
        super(name);
        this.breed = breed;
        this.age = age;
    }
    
    public String speak() {
        return "BARK!";
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString() {
        String s = this.getName() + " is a " + breed + " of age " + age;
        return s;
    }
    
}