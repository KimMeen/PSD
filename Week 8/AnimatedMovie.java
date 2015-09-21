/*  An AnimatedMovie class, which inherits from the Movie class.

    Author: Matthew De Bono
    Date:   12/9/15
*/

public class AnimatedMovie extends Movie {
    
    private int hoursToRender;
    private int numberOfTerabytes;
    private String creator; 
    
    public AnimatedMovie(int rank, String title, int hoursToRender,
            int numberOfTerabytes, String creator) {
        super(rank, title);
        this.hoursToRender = hoursToRender;
        this.numberOfTerabytes = numberOfTerabytes;
        this.creator = creator;
    }
    
    public int getHoursToRender() {
        return this.hoursToRender;
    }
    
    public int getNumberOfTerabytes() {
        return this.numberOfTerabytes;
    }
    
    public String getCreator() {
        return this.creator;
    }
    
    public void setHoursToRender(int hoursToRender) {
        this.hoursToRender = hoursToRender;
    }
    
    public void setNumberOfTerabytes(int numberOfTerabytes) { 
        this.numberOfTerabytes = numberOfTerabytes;
    }
    
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    private boolean equals(AnimatedMovie movie) {
        return  super.equals(movie) &&
                this.hoursToRender == movie.getHoursToRender() &&
                this.numberOfTerabytes == movie.getNumberOfTerabytes() &&
                this.creator.equals(movie.getCreator());
    }
    
    public boolean equals(Object o) {
        // If the two objects are the same class, then they can be equal
        // We then use our other (private) method to check equality
        if (o.getClass() == this.getClass()) {
            return this.equals((AnimatedMovie) o);
        }
        return false;
    }
    
    public String toString() {
        String s = super.toString();
        s += "This movie took " + hoursToRender + " to render, " +
            "takes up " + numberOfTerabytes + " terabytes of storage, " +
            "and was created by " + creator;
        
        return s;
    }
    
    
}