import java.util.*;

public class Lauflaengenkodierung2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Integer> lInt = new ArrayList<Integer>();
		
		while (sc.hasNextInt()) {
			int i = sc.nextInt();
			lInt.add(i);
		}
		sc.close();
		
		List<String> maxKette = encodedChain(lInt);
		
		System.out.println(String.join(".", maxKette));
		
	}
	
	public static List<String> encodedChain(List<Integer> list) {
		
		int max_occurance = 1;
		
		int counter = 1;
		List<String> encodedlist = new ArrayList<String>();
		// 1 1 2 2 2 3 3 3 3 4 3 3 1 5 .
		for (int x = 1; x < list.size(); x++) {
			
			boolean isChain = list.get(x-1).equals(list.get(x));
			System.out.print(list.get(x-1)+":"+list.get(x));
			
			if (isChain) {
				counter++;
				if (counter > max_occurance) {
					max_occurance = counter;
					encodedlist.add(counter+"x"+list.get(x));
//					System.out.println(counter+" : "+list.get(x));
				}
				
			} else {
				encodedlist.add(counter+"x"+list.get(x-1));
				counter = 1;
//				System.out.println(counter+" : "+list.get(x));
			}
			System.out.println("\n"+x+""+list.get(x)+"");
		}
		return encodedlist;
		// 2x1.3x2.4x3.1x4.2x3.1x1.1x5.
	}
	

}
