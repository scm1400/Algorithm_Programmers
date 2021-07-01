
import java.util.*;

public class test3 {

	ArrayList<Integer[]> arr = new ArrayList<>();

	public static void hanoi(int a, int b, int n) {
		if (n == 1) {
			System.out.println(a + " " + b);
			return;
		}
		hanoi(a, 6 - a - b, n - 1);
		System.out.println(a + " " + b);
		hanoi(6 - a - b, b, n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println((1 << a) - 1);
		hanoi(1, 3, a);
	}
}
