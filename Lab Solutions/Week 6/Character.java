/*  COMP90041 Week 6 Lab Question 1 Sample Solution
    
    Represents a single Character in a movie

    Author: Matthew De Bono
    Date:   31/8/15
*/

public class Character {

    // These variables are not final, so they can be modified
    private String name;
    private String actorName;
    private int rating;
    private String movieTitle;
    
    // Constructors
    public Character(String name, String actorName, int rating,
            String movieTitle) {
        this.name = name;
        this.actorName = actorName;
        this.rating = rating;
        this.movieTitle = movieTitle;
    }
    
    public Character(Character c) {
        this.name = c.getName();
        this.actorName = c.getActorName();
        this.rating = c.getRating();
        this.movieTitle = c.getMovieTitle();
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
    
    // Mutators/Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
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
