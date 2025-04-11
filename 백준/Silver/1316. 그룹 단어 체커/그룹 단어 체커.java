import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		int groupcounts = 0;
		
		for (int i=0; i<line; i++) {
			String word = sc.next();
			boolean isgroup = true;
			HashMap<Character, Integer> group = new HashMap<>();
			for (int j=0; j<word.length(); j++) {
				if (!group.containsKey(word.charAt(j))) {
					group.put(word.charAt(j), j);
				}
				else {
					if (group.get(word.charAt(j))+1==j){
						group.put(word.charAt(j), j);
					}
					else {
						isgroup = false;
					}
				}
			}
			if (isgroup) {
				groupcounts++;
			}
		}
		System.out.println(groupcounts);

	}

}
