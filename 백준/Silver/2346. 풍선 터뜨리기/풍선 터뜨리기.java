import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] paper = new int[N];
		boolean[] visited = new boolean[N];

		String[] input = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			paper[i] = Integer.parseInt(input[i]);
		}

		int pos = 0;
		int count = 0;

		while (count < N) {
			visited[pos] = true;
			bw.write((pos + 1) + " ");
			count++;

			if (count == N) break;

			int move = paper[pos];
			int step = 0;

			if (move > 0) {
				while (step < move) {
					pos = (pos + 1) % N;
					if (!visited[pos]) step++;
				}
			} else {
				while (step < -move) {
					pos = (pos - 1 + N) % N;
					if (!visited[pos]) step++;
				}
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
