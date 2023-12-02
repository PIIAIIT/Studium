package Ubung4;

public class u4a7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ein Rattenpärchen kann jeden Monat ca. 12 kleine Ratten werfen, die nach ca. zwei 
Monaten selbst geschlechtsreif sind.Unter der Annahme, dass genau gleich viele männliche wie 
weibliche Ratten in einem Wurf sind und Ratten niemals sterben: wieviele Ratten existieren 
mit obigen Annahmen nach n Monaten, wenn ein Wurf genau 12 kleine Ratten hat und die 
Geschlechteraufteilung gleichmäßig ist und wir davon ausgehen, dass das erste Rattenpärchen 
bereits im ersten Monat einen Wurf Junge bekommt?*/
//		2 Ratten = 12 kleine Ratten => 2 Monaten geschlechtsreif . 6 M & 6 W
		
		existierendeRatten(6);
	}

	public static int existierendeRatten(int month) {
		int Ratten = 2; //Ratten nach dem ersten Monat -- sind geschlechtsreif

		int kinder = 0;
		int babies = 0;
		int gesamtpopu;
		int monate = 12;
		
		for (int x = 0; x <= monate ;monate++) {
			
			gesamtpopu = (Ratten + kinder + babies);
			
			gesamtpopu += kinder;
			
			kinder = babies;
			
			babies = gesamtpopu*6;
			
			System.out.println("Anzahl Ratten nach " + monate + " Monaten ist " + gesamtpopu);
			
		}
		
		
		return 0;
	}
}
