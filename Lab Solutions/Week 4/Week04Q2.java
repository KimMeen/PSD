/*  COMP90041 Week 4 Lab Question 2 Sample Solution
    
    Java program to print out a list of movies using a more generic print method 

    Author: Matthew De Bono
    Date:   20/8/15
*/

public class Week04Q2 {
    
    public static void main(String args[]) {
        printMovies();
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