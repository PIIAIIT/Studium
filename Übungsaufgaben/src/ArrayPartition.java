import java.util.Arrays;

public class ArrayPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,4,3,2};
		System.out.println(arrayPartition(x));

	}
	public static int arrayPartition(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		
		for ( int i = 0; i < nums.length; i+=2) {
			sum += nums[i];
//			System.out.println(""+nums[i]);
		}
		return sum;
	}
	
	
	public static int arrayPartition2(int[] nums) {
		int[] temp = new int[20001];
		for (int i: nums) {
			temp[i+10000]++;
		}
		int sum = 0;
		int p = 0;
		for (int i=0; i<20001; i++) {
			if (temp[i] == 0) {
				continue;
			}
			while(temp[i] != 0) {
				if (p%2 == 0) {
					sum += (i- 10000);
				}
				p++;
				temp[i]--;
			}
		}
		return sum;
	}
}
