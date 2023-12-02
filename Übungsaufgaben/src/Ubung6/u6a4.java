package Ubung6;

public class u6a4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("INT_____BYTE_____FLOAT");
		
		for (int x = 10; x <= 200; x+= 10) {
			System.out.print(x+"\t");
			byte x1 = (byte) x;
			System.out.print(x1+"\t");
			float x2 = (float) x;
			System.out.print(" "+x2+"\t\n");
			
		}
	}

}
