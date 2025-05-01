import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();

		Queue<Integer> que = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			que.add(i);
		}

		while (!que.isEmpty()) {
			int x = que.poll();
			if (que.isEmpty()) {
				System.out.println(x);
			} else {
				que.add(que.poll());
			}
		}

	}

}
