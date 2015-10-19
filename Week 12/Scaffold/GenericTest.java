/*  An example of using generic methods and generic class.

    Generics allow your code to be much more general,
    and are incredibly powerful, but can be difficult to work with.
    
    Practice makes perfect!

    Author: Matthew De Bono
    Date:   19/10/15
*/

public class GenericTest {

	public static void main(String[] args) {
		
		Integer[] ints = {1, 2, 3, 4, 5};
		Double[] doubles = {1.0, 2.0, 3.0, 100.0};
		Character[] chars = {'H', 'E', 'L', 'L', 'O', 'W', 'O', 'R', 'L', 'D'};
		String[] strings = {"Hello", "World"};
		Person[] people = {new Person("Matt", 23), new Person("Peter", 30)};
		
		printArray(ints);
		printArray(doubles);
		printArray(chars);
		printArray(strings);
		printArray(people);

	}
	
	// Testing a generic method
	// Uses the generic type parameter to make a general method to print an array
	// There's a problem though...
	public static <T> void printArray(T[] array) {
		
		for (T t : array) {
			System.out.printf("%s ", t);
		}
		System.out.println();
		
	}

}
