import java.util.*;

public class LaengsteKette2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Integer> listOfInt = new ArrayList<Integer>();
		
		while (sc.hasNextInt()) {
			int i = sc.nextInt();
			listOfInt.add(i);
		}
		sc.close();
		
		int maxKette = leangsteKette(listOfInt);
		
		System.out.println(maxKette);
	
	}
	
	public static int leangsteKette(List<Integer> list) {
		if (list.isEmpty()) return 0;
		
		int index_of_maxoccurance = 1;
		
		int counter = 1;
		// 1 1 2 2 2 3 3 3 3 4 3 3 1 5 .
		for (int x = 1; x < list.size(); x++) {
			
			boolean isChain = list.get(x-1).equals(list.get(x));
			
			if (isChain) {
				counter++;
				if (counter > index_of_maxoccurance) index_of_maxoccurance = counter;
				
			} else {
				counter = 1;
			}
		}
		
		
		return index_of_maxoccurance;
		
	}
}
