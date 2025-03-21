import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		sc.close();
		
		StringBuffer sb = new StringBuffer(str1);
		
		String str2 = sb.reverse().toString();
		
		if (str1.equals(str2)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
