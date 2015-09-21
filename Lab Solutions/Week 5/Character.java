/*  COMP90041 Week 5 Lab Question 4 Sample Solution
    
    Represents a single Character in a movie

    Author: Matthew De Bono
    Date:   28/8/15
*/

public class Character {

	// Again, private and final for immutability
	private final String name;
	private final String actorName;
	private final int rating;
	private final String movieTitle;
	
	// Constructors
	public Character(String name, String actorName, int rating,
			String movieTitle) {
		this.name = name;
		this.actorName = actorName;
		this.rating = rating;
		this.movieTitle = movieTitle;
	}

	// Accessors/Getters
	public String getName() {
		return name;
	}

	public String getActorName() {
		return actorName;
	}

	public int getRating() {
		return rating;
	}

	public String getMovieTitle() {
		return movieTitle;
	}
	
	// The usual methods
	public String toString() {
		// Again, your toString can be any representation you like
		return "name=" + name + ", actorName=" + actorName
				+ ", rating=" + rating + ", movieTitle=" + movieTitle;
	}
	
	public boolean equals(Character c) {
		return  this.movieTitle.equals(c.getMovieTitle()) &&
				this.actorName.equals(c.getActorName()) &&
				this.rating == c.rating &&
				this.movieTitle.equals(c.getMovieTitle());
	}	
	
}
