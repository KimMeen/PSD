/*  A simple class that uses our interface so that we can use our generic method

    Author: Matthew De Bono
    Date:   19/10/15
*/

public class BetterPerson implements Stringable {

	private String name;
	
	private int age;
	
	public BetterPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String getString() {
		return name + " is " + age + " years old.";
	}
	
}
