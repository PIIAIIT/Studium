package Ubung9;

public class Getraenkekarte {
	
	
	Getraenk[] g_list = new Getraenk[0];

	public void neuesGetraenk(Getraenk g) {
		Getraenk[] g_list2 = new Getraenk[g_list.length+1];
		for (int i = 0; i < g_list.length; i++) {
			g_list2[i] = g_list[i];
		}
		g_list2[g_list2.length-1] = g;
		g_list = g_list2;
	}
	
	public String toString() {
		String str = "";
		for (Getraenk g: g_list) {
			str += g.toString()+ "\n";
		}
		return str;
	}
	
	public Getraenk suchen(String g) {
		for (Getraenk g1: g_list) {
			if (g1.name == g) {
				return g1;
			}
		}
		return null;
	}
}
