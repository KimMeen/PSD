/*  A Cat class, which inherits from Animal and makes a concrete class.

    Author: Matthew De Bono
    Date:   21/9/15
*/

public class Cat extends Animal {
    
    private String type;
    
    public Cat(String name, String type) {
        super(name);
        this.type = type;
    }
    
    public String speak() {
        return "MEOW!";
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String toString() {
        String s = this.getName() + " is an " + type + " cat";
        return s;
    }
    
}