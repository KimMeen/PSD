/*  A Horse class, which inherits from Animal and makes a concrete class.

    Author: Matthew De Bono
    Date:   21/9/15
*/

public class Horse extends Animal {
    
    private String owner;
    private int numberOfRaces;
    
    public Horse(String name, String owner, int numberOfRaces) {
        super(name);
        this.owner = owner;
        this.numberOfRaces = numberOfRaces;
    }
    
    public String speak() {
        return "NEIGH!";
    }
    
    public String getOWner() {
        return owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public int getNumberOfRaces() {
        return numberOfRaces;
    }
    
    public void setNumberOfRaces(int numberOfRaces) {
        this.numberOfRaces = numberOfRaces;
    }
    
    public String toString() {
        String s = this.getName() + " is owned by " + owner + 
                    " and has competed in " + numberOfRaces + " races";
        return s;
    }
    
}