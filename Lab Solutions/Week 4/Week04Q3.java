/*  COMP90041 Week 4 Lab Question 3 Sample Solution
    
    Java program to check if a given movie is contained in a list of movies

    Author: Matthew De Bono
    Date:   20/8/15
*/

public class Week04Q3 {
    
    public static void main(String args[]) {
        
        // This isn't the best way to do this, 
        // so remember this example when we learn arrays
        String favourites = "300, The Avengers, Batman: The Dark Knight, " +
            "The Lord of the Rings, Last Vegas";
        
        System.out.println(isAFavourite(favourites, "300"));
        System.out.println(isAFavourite(favourites, "The Avengers"));
        System.out.println(isAFavourite(favourites, 
            "Taylor Swift's Big Day Out"));
    }
    
    // A class method to check if movie is in the list of favourites
    public static boolean isAFavourite(String favourites, String movie) {
        return favourites.contains(movie);
    }
    
}