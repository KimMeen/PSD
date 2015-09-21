/*  COMP90041 Week 4 Lab Question 3 Sample Solution
    
    Java program to check if a given movie is contained in a list of movies

    Author: Matthew De Bono
    Date:   20/8/15
*/

public class Week04Q4 {
    
    public static void main(String args[]) {
        
        // This isn't the best way to do this, 
        // so remember this example when we learn arrays
        String favourites = "300,The Avengers,Batman: The Dark Knight," +
            "The Lord of the Rings,Last Vegas";
        
        printMovies(favourites);
    }
    
    // A class method to print a list of movies from a comma separated list
    public static void printMovies(String favourites) {
        
        // Store a copy of the list to manipulate
        String movies = favourites;
        String separator = ",";
        
        // Keep count of the number of movies
        int nMovies = 0;
        
        // If there is a comma left, there are still movies to print
        while (movies.contains(separator)) {
            // Count the movie
            nMovies++;
            
            // Get the movie's title, which we know starts at the beginning of
            // the string, and ends before the comma
            int index = movies.indexOf(separator);
            String title = movies.substring(0, index);
            
            // Print the movie
            printMovies(nMovies, title);
            
            // Now we "remove" the movie we just printed from the list
            movies = movies.substring(index + 1);
        }
        
        // Once we've finished the loop, there will still be one last movie 
        // left in the list
        nMovies++;
        printMovies(nMovies, movies);
    }
    
    // A class method to print my favourite movies
    public static void printMovies() {
        printMovies(1, "300");
        printMovies(2, "The Avengers");
        printMovies(3, "Batman: The Dark Knight");
        printMovies(4, "The Lord of the Rings");
        printMovies(5, "Last Vegas");
    }
    
    // A class method to print the rank and title of a given movie
    public static void printMovies(int rank, String title) {
        System.out.println(rank + ". " + title);
    }
    
}