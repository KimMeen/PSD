/*  An ActionMovie class, which inherits from the Movie class.

    Author: Matthew De Bono
    Date:   12/9/15
*/

public class ActionMovie extends Movie {

    private int numberOfStunts;
    private boolean hasExplosions;
    
    public ActionMovie(int rank, String title, 
            int numberOfStunts, boolean hasExplosions) {
        super(rank, title);
        this.numberOfStunts = numberOfStunts;
        this.hasExplosions = hasExplosions;
    }
    
    public int getNumberOfStunts() {
        return this.numberOfStunts;
    }
    
    public boolean hasExplosions() {
        return this.hasExplosions;
    }
    
    public void setNumberOfStunts(int numberOfStunts) {
        this.numberOfStunts = numberOfStunts;
    }
    
    public void setExplosions(boolean hasExplosions) {
        this.hasExplosions = hasExplosions;
    }
    
    private boolean equals(ActionMovie movie) {
        return  super.equals(movie) &&
                this.numberOfStunts == movie.getNumberOfStunts() &&
                this.hasExplosions == movie.hasExplosions();
    }
    
    public boolean equals(Object o) {
        // If the two objects are the same class, then they can be equal
        // We then use our other (private) method to check equality
        if (o.getClass() == this.getClass()) {
            return this.equals((ActionMovie) o);
        }
        return false;
    }
    
    public String toString() {
        String s = super.toString();
        s += "This movie has " + numberOfStunts + " stunts and has ";
        
        if (hasExplosions) {
            s += "EXPLOSIONS.";
        } else {
            s += "no explosions.";
        }
        
        return s;
    }
    
}