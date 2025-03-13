import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			if (n == 0 && m == 0) {
				break;
			}
			else {
				MultiorFactor is = new MultiorFactor(n, m);

				is.neither();
			}
		}
		sc.close();
	}

}

class MultiorFactor {
	int n;
	int m;

	public MultiorFactor(int n, int m) {
		this.m = m;
		this.n = n;
	}

	public boolean neither() {
		if (this.isitfactor() || this.isitmulti()) {
			return false;
		}
		else {
			System.out.println("neither");
			return true;
		}
	}

	public boolean isitmulti() {
		if (n % m == 0) {
			System.out.println("multiple");
			return true;
		} else {
			return false;
		}
	}

	public boolean isitfactor() {
		if (m % n == 0) {
			System.out.println("factor");
			return true;
		} else {
			return false;
		}
	}

}