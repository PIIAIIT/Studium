package Ubung9;

public class Student {

	String vn;
	String nn;
	int mn;
	
	public Student(String vorname, String nachname, int martikelnummer) {
		vn = vorname;
		nn = nachname;
		mn = martikelnummer;
	}
	
	public String toString() {
		return vn + " " + nn + " " + "("+mn+")";
	}

}
