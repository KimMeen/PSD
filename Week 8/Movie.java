/*  A slightly modified Movie class, where the equals method now expects 
    an Object variable, not a Movie.

    Author: Matthew De Bono
    Date:   12/9/15
*/

public class Movie {

    private int rank;
    private String title;
    
    public Movie(int rank, String title) {
        this.rank = rank;
        this.title = title;
    }
    
    public int getRank() {
        return rank;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    private boolean equals(Movie m) {
        return this.rank == m.getRank() &&
               this.title.equals(m.getTitle());
    }
    
    public boolean equals(Object o) {
        // If the two objects are the same class, then they can be equal
        // We then use our other (private) method to check equality
        if (o.getClass() == this.getClass()) {
            return this.equals((Movie) o);
        }
        return false;
    }
    
    public String toString() {
        return rank + ". " + title + "\n";
    }
    
}