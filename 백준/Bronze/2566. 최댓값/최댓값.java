import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] dimension = new int[9][9];
		int maxval = -1;
		int[] loc = new int[2];
		
		for (int i=0; i<dimension.length; i++) {
			for (int j=0; j<dimension[i].length; j++) {
				dimension[i][j] = sc.nextInt();
				if (dimension[i][j]>maxval) {
					maxval = dimension[i][j];
					loc = new int[] {i+1,j+1};
				}
			}
		}
		
		System.out.println(maxval);
		System.out.println(loc[0]+" "+ loc[1]);
		

	}

}
