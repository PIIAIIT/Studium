import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lcp = longestCommonPrefix(args);
		System.out.println(lcp);
	}
	/**
	 * @param strs: Eine Liste an Strings
	 * @return ans: den gemeinsamen Prefix der Strings
	 */
	public static String longestCommonPrefix(String[] strs) {
		String ans = "";
		
		/*
		 * Sortiere die Liste um nur die erste und letzte Einheit in dem Feld nachzusehen!
		 */
		Arrays.sort(strs);
		
		/*
		 * Initialisiere first: das Erste Wort in der Liste
		 * 				 last:  das Letzte Wort in der Liste
		 */
		String first = strs[0];
		String last = strs[strs.length-1];
		
		/*
		 * Gehe beide Listen durch und check den i-te char der Listen
		 * 
		 */
		for ( int i=0; i < Math.min(first.length(), last.length());i++) {
			/*
			 * Wenn die Beide Listen an der i-ten Stelle des Wortes 
			 * nicht gleich sind: 
			 * return ans
			 */
			if ( first.charAt(i) != last.charAt(i)) {
				return ans;
			}
			/*
			 * Wenn die beiden chars an dem String gleich 
			 * sind ans mit dem char erweitern
			 */
			ans += first.charAt(i);
		}
		
		return ans;
	}
}
