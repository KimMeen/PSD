/*  A slightly modified Movie class.

    Author: Matthew De Bono
    Date:   5/9/15
*/

import java.util.*;

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
    
    public boolean equals(Movie m) {
        return this.rank == m.getRank() &&
               this.title.equals(m.getTitle());
    }
    
    public String toString() {
        return rank + ". " + title + "\n";
    }
    
}