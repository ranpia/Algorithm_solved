import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int[] arr=new int[K];
		int index=0;
		
		for(int i=0; i<K; i++) {
			int next = sc.nextInt();
			if (next!=0) {
				arr[index++]=next;
			}
			else {
				arr[--index]=0;
			}
		}
		
		int total=0;
		for (int j:arr) {
			total+=j;
		}
		System.out.println(total);

	}

}
