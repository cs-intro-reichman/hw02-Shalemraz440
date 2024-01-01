
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int gender = 0;
		int count = 0;
		boolean isBoy = true;
		if (Math.random() < 0.5) {
			gender = 0;
		}
		else {
			gender = 1;
		}

		if (gender == 1) {
			isBoy = false;
		}
		
		while (gender == 0) {
			count = count + 1;
			if (Math.random() < 0.5) {
				gender = 0;
			}
			else {
				gender = 1;
			}
		}
		while (gender == 1) {
			count = count + 1;
			if (Math.random() < 0.5) {
				gender = 0;
			}
			else {
				gender = 1;
			}
		}
		for (int i = 0; i < count; i++) {
			if (isBoy) {
				System.out.print("b ");
			}
			else {
				System.out.print("g ");
			}
		}
		if (isBoy) {
			System.out.print("g");
		}
		else {
			System.out.print("b");
		}
		System.out.println("");
		System.out.println("You made it... and you now have " + (count + 1) + " children.");
	}
}
