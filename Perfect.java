/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
		String perfect = N + " is a perfect number since " + N + " = ";
		int sum = 0;

		for (int i = 1; i < N; i++) {
			if (N % i == 0) {
				perfect = perfect + i;
			}
			if ((N % i == 0) && (i < N/2)) {
				perfect = perfect + " + ";
			}
		}
		for (int i = 1; i < N; i++) {
			if (N % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == N) {
			System.out.println(perfect);
		}
		else {
			System.out.println(N + " is not a perfect number");
		}
	}
}
