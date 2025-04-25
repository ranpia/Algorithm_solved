import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		ArrayList<Integer> cards = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			int card = sc.nextInt();
			if (card < M) {
				cards.add(card);
			}
		}

		int maxvalue = 0;
		cards.sort((o1, o2) -> o1 - o2);
		for (int i = N - 1; i >= 2; i--) {
			for (int j = i - 1; j >= 1; j--) {
				if (cards.get(i) + cards.get(j) <= M) {
					for (int k = j - 1; k >= 0; k--) {
						int x = cards.get(i) + cards.get(j) + cards.get(k);
						if (x <= M && maxvalue<x) {
							maxvalue = x;
						}
					}
				}
			}
		}
		
		System.out.println(maxvalue);

	}

}
