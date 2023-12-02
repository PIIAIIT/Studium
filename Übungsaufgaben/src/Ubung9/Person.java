package Ubung9;

public class Person {

	String vorname;
	int alter;
	
	public Person(String v, int a) {
		vorname = v;
		alter = a;
	}
	
	public String toString() {
		return vorname+"("+alter+")";
	}
}
