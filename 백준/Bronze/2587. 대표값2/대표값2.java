import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = new int[5];
		int total = 0;
		
		for (int i=0; i<nums.length; i++) {
			nums[i]= sc.nextInt();
			total+=nums[i];
		}
		sc.close();
		
		Arrays.sort(nums);
		System.out.println(total/nums.length);
		System.out.println(nums[nums.length/2]);
	}

}
