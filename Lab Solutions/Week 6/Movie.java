/*  COMP90041 Week 6 Lab Question 2 Sample Solution
    
    Represents a single Movie

    Author: Matthew De Bono
    Date:   31/8/15
*/

public class Movie {

    // Instance variables should always be private
    private String title;
    private int rank;
    private int runtime;
    private Character mainCharacter;
    
    // Constructors
    public Movie(String title, int runtime, int rank, Character mainCharacter) {
        this.title = title;
        this.runtime = runtime;
        this.rank = rank;
        this.mainCharacter = new Character(mainCharacter);
    }
    public Movie(String title, int runtime) {
        this.title = title;
        this.runtime = runtime;
        this.rank = 1;
        this.mainCharacter = new Character("Captain Jack Sparrow", "Johnny Depp"
            , 10, "Pirates of the Caribbean: Curse of the Black Pearl");
    }
    
    public Movie(Movie m) {
        this.title = m.getTitle();
        this.runtime = m.getRuntime();
        this.rank = m.getRank();
        this.mainCharacter = new Character(m.getMainCharacter());
    }
    
    // Accessors/Getters
    public String getTitle() {
        return title;
    }

    public int getRank() {
        return rank;
    }

    public int getRuntime() {
        return runtime;
    }

    // If we just returned mainCharacter, then other objects would have a
    // reference to the variable, which is a privacy leak. 
    // By creating a new copy, we create a separate version, and avoid the leak
    private Character getMainCharacter() {
        return new Character(mainCharacter);
    }
    
    // Mutators/Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    // Similar to getMainCharacter, if we simply assigned mainCharacter to our 
    // object, it could be modified by someone outside, which is a privacy leak.
    // We avoid the leak by creating a separate copy 
    private void setMainCharacter(Character mainCharacter) {
        this.mainCharacter = new Character(mainCharacter);
    }
    
    // Our usual methods
    public String toString() {
        // Your toString method does not have to do this
        // You can return any representation of this objects, and its variables
        String out = title + " is ranked #" + rank + " and runs for " 
            + runtime + " minutes.\n";
        out += "\tMain character: " + mainCharacter.toString();
        
        return out;
    }
    
    public boolean equals(Movie m) {
        return  this.title.equals(m.getTitle()) &&
                this.runtime == m.getRuntime() &&
                this.rank == m.getRank() &&
                this.mainCharacter.equals(m.getMainCharacter());                
    }
    
}
