import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int AN = sc.nextInt();
		int AM = sc.nextInt();

		int[][] A = new int[AN][AM];

		for (int i = 0; i < AN; i++) {
			for (int j = 0; j < AM; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		int BN = sc.nextInt();
		int BM = sc.nextInt();
			

		int[][] B = new int[BN][BM];

		for (int i = 0; i < BN; i++) {
			for (int j = 0; j < BM; j++) {
				B[i][j] = sc.nextInt();
			}
		}

		int[][] total = new int[AN][BM];

		for (int k = 0; k < BN; k++) {
			for (int i = 0; i < total.length; i++) {
				for (int j = 0; j < total[i].length; j++) {
					total[i][j] += A[i][k] * B[k][j];
				}
			}
		}

		for (int i = 0; i < total.length; i++) {
			for (int j = 0; j < total[i].length; j++) {
				System.out.print(total[i][j]+" ");
			}
			System.out.println();
		}

	}

}
