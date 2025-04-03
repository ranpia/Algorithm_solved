import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		
		ArrayList<Judgecustomer> joindatesort = new ArrayList<>();
		
		for (int i=0; i<line; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			joindatesort.add(new Judgecustomer(age, name, i));
		}
		Collections.sort(joindatesort);
		
		for (Judgecustomer j : joindatesort) {
			System.out.println(j.getage()+" "+j.getname());
		}
	}

}

class Judgecustomer implements Comparable<Object>{
	private int age;
	private String name;
	private int joinvalue;
	
	public Judgecustomer(int age, String name, int joinvalue) {
		this.age = age;
		this.name = name;
		this.joinvalue = joinvalue;
	}
	
	public int getage() {
		return this.age;
	}
	
	public String getname() {
		return this.name;
	}
	
	@Override
	public int compareTo(Object o) {
		Judgecustomer j = (Judgecustomer) o;
		if (this.age == j.age) {
			return this.joinvalue- j.joinvalue;
		}
		else {
			return this.age - j.age;
		}
	}
}