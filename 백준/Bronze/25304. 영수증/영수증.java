import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();

		int line = sc.nextInt();

		for (int i = 0; i < line; i++) {
			int price = sc.nextInt();
			int count = sc.nextInt();
			total -= price * count;
		}
		
		if (total ==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
