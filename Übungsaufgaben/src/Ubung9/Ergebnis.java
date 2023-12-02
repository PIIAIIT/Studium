package Ubung9;

public class Ergebnis {

	Student stud;
	
	float note;
	int punktzahl;
	
	public Ergebnis(Student s, float n, int p) {
		stud = s;
		note = n;
		punktzahl = p;
	}
	
	public String toString() {
		return stud.vn + " " 
				+ stud.nn + " " 
				+ "("+stud.mn+") " 
				+ "Note="+ note+" "
				+ "Punktzahl="+ punktzahl;
	}
}
