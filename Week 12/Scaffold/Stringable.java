/*  A simple interface to show the use of parameterised generics.

    Author: Matthew De Bono
    Date:   19/10/15
*/

public interface Stringable {

	// getString instead of toString, 
	// since Object already has toString so it won't force an override
	public String getString();

}
