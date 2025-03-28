import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] road = new int[N][2];
		int[][] yeonjung = new int[M][2];

		for (int i = 0; i < N; i++) {
			int length = sc.nextInt();
			int limit = sc.nextInt();

			road[i] = new int[] { length, limit };
		}
		for (int i = 0; i < M; i++) {
			int length = sc.nextInt();
			int speed = sc.nextInt();

			yeonjung[i] = new int[] { length, speed };
		}
		sc.close();

		int start = 0;
		int end = 0;
		int maxoverspeed = 0;

		for (int[] k : yeonjung) {
			start = end;
			end += k[0];
			int sectionstart = 0;
			int sectionend = 0;
			for (int[] j : road) {
				sectionstart = sectionend;
				sectionend += j[0];
				if (start < sectionend && start>= sectionstart) { // 구간에서 속도 변화
					if (k[1] > j[1]) {
						maxoverspeed = maxoverspeed < k[1]-j[1] ? k[1]-j[1] : maxoverspeed;
					}
				}
				else if (start <= sectionstart && end>sectionstart) {
					if (k[1] > j[1]) {
						maxoverspeed = maxoverspeed < k[1]-j[1] ? k[1]-j[1] : maxoverspeed;
					}
				}
			}
		}
		System.out.println(maxoverspeed);
		
	}

}
