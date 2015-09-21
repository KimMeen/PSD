/*  A ComedyMovie class, inherits from the Movie class.

    Author: Matthew De Bono
    Date:   12/9/15
*/

public class ComedyMovie extends Movie {

    public int numberOfJokes;
    public String bestJoke;
    
    public ComedyMovie(int rank, String title, 
            int numberOfJokes, String bestJoke) {
        super(rank, title);
        this.numberOfJokes = numberOfJokes;
        this.bestJoke = bestJoke;
    }
    
    public int getNumberOfJokes() {
        return this.numberOfJokes;
    }
    
    public String getBestJoke() {
        return this.bestJoke;
    }
    
    public void setNumberOfJokes(int numberOfJokes) {
        this.numberOfJokes = numberOfJokes;
    }
    
    public void setBestJoke(String bestJoke) {
        this.bestJoke = bestJoke;
    }
    
    private boolean equals(ComedyMovie movie) {
        return  super.equals(movie) &&
                this.numberOfJokes == movie.getNumberOfJokes() &&
                this.bestJoke.equals(movie.getBestJoke());
    }
    
    public boolean equals(Object o) {
        // If the two objects are the same class, then they can be equal
        // We then use our other (private) method to check equality
        if (o.getClass() == this.getClass()) {
            return this.equals((ComedyMovie) o);
        }
        return false;
    }
    
    public String toString() {
        String s = super.toString();
        s += "This movie has " + numberOfJokes + " jokes, the best joke is " +
            bestJoke;
        
        return s;
    }
    
}