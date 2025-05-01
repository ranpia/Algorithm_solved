import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		LinkedList<Integer> round = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			round.add(i);
		}

		int index = -1;
		System.out.print("<");
		while (!round.isEmpty()) {
			int curindex = index + K;
			if (curindex >= round.size()) {
				curindex = curindex % round.size();
			}
			System.out.print(round.get(curindex));
			round.remove(curindex--);
			if (round.isEmpty()) {
				System.out.print(">");
			}
			else {
				System.out.print(", ");
			}
			index = curindex;
		}
		

	}

}
