import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int even = 0, odd = 0;
			for (int i = 0; i < n; i++) {
				int bag = fs.nextInt();
				if (bag % 2 == 0) {
					even += bag;
				} else {
					odd += bag;
				}
			}
			System.out.println((even > odd ? "YES" : "NO"));
		}
		fs.close();
	}
}
