import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		sc.close();

		int i = 0;

		while (true) {
			StringBuilder sb = new StringBuilder(str.substring(0, i++));
			sb = sb.reverse();
			String str2 = new String(str + sb.toString());

			char[] strarr = str2.toCharArray();
			boolean ispale = true;

			for (int j = 0; j < strarr.length / 2; j++) {
				if (strarr[j] != strarr[strarr.length - j - 1]) {
					ispale = false;
					break;
				}
			}

			if (ispale) {
				System.out.println(str2.length());
				break;
			}
		}

	}

}
