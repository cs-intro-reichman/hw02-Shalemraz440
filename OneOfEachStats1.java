/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);

		double average = 0;
		int two = 0;
		int three = 0;
		int four_or_more = 0;

		for (int j = 0; j < T; j++) {
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
			count = count + 1;

			average = average + count;

			if (count == 2) {
				two = two + 1;
			}
			else if (count == 3) {
				three = three + 1;
			}
			else if (count >= 4) {
				four_or_more = four_or_more + 1;
			}
		}	

		System.out.println("Average: " + average / T + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two);
		System.out.println("Number of families with 3 children: " + three);
		System.out.println("Number of families with 4 or more children: " + four_or_more);
		
		int max = 0;
		if (two > max) {
			max = two;
		}
		if (three > max) {
			max = three;
		}
		if (four_or_more > max) {
			max = four_or_more;
		}

		if (max < 4) {
			System.out.println("The most common number of children is " + max + ".");
		}
		else {
			System.out.println("The most common number of children is 4 or more.");
		}
	}
}
