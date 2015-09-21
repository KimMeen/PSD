/*  A class to represent a Person, and their favourite movies.

    Author: Matthew De Bono
    Date:   5/9/15
*/

import java.util.*;

public class Person {
    
    // Magic numbers are bad, so let's define a constant, 
    private static final int MAX_NUM_FAVOURITES = 5;
    
    
    private Movie favourites[];
    private String name;
    private int numberOfFavourites = 0;
    private int maxFavourites;
    
    public Person(String name) {        
        // Since arrays are objects, we always need the "new" keyword before 
        // we can use them
        // Arrays are always fixed width, so we need to tell it how big to be
        favourites = new Movie[MAX_NUM_FAVOURITES];
        this.name = name;
    }
    
    public Person(String name, int maxFavourites) {
        // In this constructor, the user gets to decide how big their list is
        favourites = new Movie[maxFavourites];
        this.name = name;
    }
    
    // This method adds a new Movie to the first unfilled element in the array
    public boolean addFavourite(Movie m) {
        // Since we can only have a certain number of elements in an array,
        // we should make sure there is space before adding another
        if (numberOfFavourites == favourites.length) {
            
            // Tell the user their request failed
            return false;
        }
        
        // If there's space, add the new element, and increment our counter
        for (int i = 0; i < favourites.length; i++) {
            if (favourites[i] == null) {
                favourites[numberOfFavourites] = m;
                numberOfFavourites++;
                break;
            }
        }
        
        // Let the user know that their request was successful
        return true;
    }
    
    // This method adds a new Movie at the given index, overwriting the old one
    public boolean addFavourite(Movie m, int rank) {
        // Since arrays begin indexing at 0, and the favourites list begins at 1
        // we decrement the rank to correctly index the array
        rank--;
        
        // Make sure the requested position is in the bounds of our array
        if (rank >= 0 && rank < favourites.length) {
            
            // If the element is currently empty, make sure we update the count
            if (favourites[rank] == null) {
                numberOfFavourites++;
            }
            
            favourites[rank] = m;
            
            // Tell the user their request was successful
            return true;
        }
        
        // Let the user know that their request failed
        return false;
    }
    
    public String toString() {
        String out = name + " has " + numberOfFavourites + 
                    " favourite movies.\n";
        
        // Arrays (and other objects) can use a special kind of loop
        // The for-each loop is useful for objects that store many objects
        // of the same type
        for (Movie s : favourites) {
            if (s != null) {
                out += s.toString();
            }
        }
        
        return out;
    }
}