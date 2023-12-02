
public class FlaecheBerechnen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] c = {{0, 0}, {1, 0}, {1, 1}, {0, 1}};
		float flaeche = flaecheBerechnen(c);
		System.out.println(flaeche);
	}
	
	
	public static float flaecheBerechnen(float[][] coord) {
		int laenge = coord.length;
		float flaeche = 0f;
		
		for (int i = 0; i < laenge; i++) {
			int indexI = (i+1) % laenge;
			
			float x = coord[i][0] + coord[indexI][0];
			float y = coord[indexI][1] - coord[i][1];
			
			flaeche += x*y;
			
		
		}
		return flaeche/2;
	
	}

}

