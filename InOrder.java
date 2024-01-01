/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int max = 0;
		while (max < 10) {
			int rand = (int) (Math.random() * 10);
			if (rand >= max) {
				System.out.println(rand);
			}
			else {
				break;
			}
			max = rand; 
		}
	}
}