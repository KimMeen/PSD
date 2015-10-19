/*  A simple class showing the use of generics for classes.

    Author: Matthew De Bono
    Date:   19/10/15
*/

public class GenericPerson <T> implements Stringable {
	
	// Since T can be any class, we can create GenericPerson objects
	// with pretty much any type of data!
	T favouriteItem;
	
	public GenericPerson(T favouriteItem) {
		this.favouriteItem = favouriteItem;
	}
	
	public String getString() {
		return favouriteItem.toString();
	}

}
