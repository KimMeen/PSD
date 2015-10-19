/*  A simple class to use in our generics example.

    Author: Matthew De Bono
    Date:   19/10/15
*/

public class Person {

	private String name;
	
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " is " + age + " years old.";
	}
	
}
