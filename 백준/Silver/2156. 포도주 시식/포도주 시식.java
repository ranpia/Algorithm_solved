import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int glassnum = sc.nextInt();
		Wine w = new Wine(glassnum);
		w.insertglass(sc);
		
		System.out.println(w.winedp());
	}

}

class Wine {
	private int[] glasses;
	private int[] dp;

	Wine(int glassnum) {
		this.dp = new int[glassnum];
		this.glasses = new int[glassnum];
	}

	public void insertglass(Scanner sc) {
		for (int i = 0; i < glasses.length; i++) {
			glasses[i] = sc.nextInt();
		}
		sc.close();
	}

	public int winedp() {
		dp[0] = glasses[0];
        if (dp.length>1)
		    dp[1] = glasses[0]+ glasses[1];
        if (dp.length>2)
		dp[2] = Integer.max(Integer.max(dp[1], glasses[0] + glasses[2]), glasses[1] + glasses[2]);
		for (int i = 3; i < dp.length; i++) {
			int ndi = dp[i - 1]; // not drink at i
			int di = dp[i - 2] + glasses[i]; // drink at i
			int dtwo = dp[i - 3] + glasses[i - 1] + glasses[i];
			dp[i] = Integer.max(Integer.max(ndi, di), dtwo);
		}
		return dp[dp.length-1];
	}
}