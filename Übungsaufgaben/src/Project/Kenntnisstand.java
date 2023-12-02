package Project;

import java.util.Scanner;

public class Kenntnisstand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); /* Anzahl der Studierenden: muss durch 6 teilbar sein. */
		sc.close();
		
		double wissenstand = 0.0;
		
		if ( n % 6 != 0) {
			System.out.println("Die Anzahl der Studierenden muss durch 6 teilbar sein.");
		} else {
			double[] wissenGru = new double[n];
			for (int i = 0; i < n; i++) {
				wissenGru[i] = 0;
			}
			
			for (int woche = 1; woche <= 15; woche++) {
				for (int student = 0; student < n; student++) {
					wissenstand = vorlesung(wissenstand);
					wissenstand = nachBearbeitung(wissenstand);
					wissenstand = uebung(wissenstand);
//					wissenstand = warinGruppe(wissenGru,wissenGru[student]);
//					System.out.println(wissenstand);
					
					if (student % 2 == 0) {
						wissenGru[student] = wissenstand;
					}
				}
				for (int i = 0; i < n; i++) {
					System.out.print("Woche: "+woche);
					System.out.println();
					printIntList(wissenGru);
				}
				
			}
		}
		
		System.out.println(wissenstand);
		
	}
	
	public static double vorlesung(double wissen) {
		return wissen + 0.1;
	}
	public static double nachBearbeitung(double wissen) {
		return wissen + 0.2;
	}
	public static double uebung(double wissen) {
		return wissen + 0.3;
	}
	public static double warinGruppe(double[] gruppeWissen, double wissen) {
		System.out.println(" "+wissen);
		return wissen + 1 / (max(gruppeWissen) - wissen * 10);
	}
	
	private static double max(double[] g) {
		double max = 0;
		for (int i = 0; i < g.length; i++) {
			if (g[i] > max) {
				max = g[i];
				System.out.print(" "+ g[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Max: "+max);
		return max;
	}
	
	public static void printIntList(double[] r) {
		System.out.print("[");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i]);
			if (i != r.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		
	}
}
