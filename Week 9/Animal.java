/*  An example of using an abstract class to build a basic super class from
    which to inherit with subclass. 
    
    Abstract classes can never be instantiated 
    (as in, new Animal will not work) but are useful for creating "general"
    classes that define some aspects common to all subclasses.

    Author: Matthew De Bono
    Date:   21/9/15
*/

public abstract class Animal {
    
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public abstract String speak();
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}