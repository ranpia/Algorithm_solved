import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int N = sc.nextInt();

		char[] lan = str.toCharArray();
		int tenary = 0;

		for (int i = 0; i < lan.length; i++) {
			char c = lan[i];
			int digits = 1;
			for (int j = i+1; j < lan.length; j++) {
				digits *= N;
			}
			if (c >= 'A' && c <= 'Z') {
				tenary += (c - 55) * digits;
			} else {
				tenary += (c - 48) * digits;
			}
		}

		System.out.println(tenary);

	}

}
