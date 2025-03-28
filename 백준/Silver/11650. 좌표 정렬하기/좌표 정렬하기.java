import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int line = sc.nextInt();
		ArrayList<Board> arr = new ArrayList<>();

		for (int i = 0; i < line; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			arr.add(new Board(x, y));
		}

		Collections.sort(arr);

		for (Board b : arr) {
			b.print();
		}

	}

}

class Board implements Comparable<Object> {

	private int x;
	private int y;

	Board(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Object o) {
		Board b2 = (Board) o;

		if (b2.x == this.x)
			return this.y - b2.y;
		else
			return this.x - b2.x;
	}

	public void print() {
		System.out.println(x + " " + y);
	}

}