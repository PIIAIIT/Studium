package Ubung6;

public class u6a9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(berechneJahr(7666));
		System.out.println(berechneJahr(1582));
		System.out.println(berechneJahr(10594));
		System.out.println(berechneJahr(366));
	}
	
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 == 0) || year % 400 == 0;
	}
	
	static int berechneJahr(int days) {
		int year = 1980; // 01.01.1980 ist der Tag 1
		while (days > 365) {
			if (isLeapYear(year)) {
				if (days >= 366) {
					days = days - 366;
					year = year + 1;
				}
			} else {
				days = days - 365;
				year = year + 1;
			}
		}
		return year;
	}

}
