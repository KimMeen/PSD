/*  COMP90041 Week 5 Lab Question 1-3 Sample Solution
    
    Represents a single Movie

    Author: Matthew De Bono
    Date:   28/8/15
*/

public class Movie {

	// Instance variables should always be private
	// final is useful for making classes immutable
	private final String title;
	private final int rank;
	private final int runtime;
	private final Character mainCharacter;
	
	// Constructors
	public Movie(String title, int runtime, int rank, Character mainCharacter) {
		this.title = title;
		this.runtime = runtime;
		this.rank = rank;
		this.mainCharacter = mainCharacter;
	}
	
	// Constructors don't need to have arguments for every variable
	// but they every variable needs to be initialized befoe use
	public Movie(String title, int runtime) {
		this.title = title;
		this.runtime = runtime;
		this.rank = 1;
		this.mainCharacter = new Character("Captain Jack Sparrow", "Johnny Depp"
		    , 10, "Pirates of the Caribbean: Curse of the Black Pearl");
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

	private Character getMainCharacter() {
		return mainCharacter;
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
