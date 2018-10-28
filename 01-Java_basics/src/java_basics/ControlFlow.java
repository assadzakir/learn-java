package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if else
		boolean isTrue = false;

		if (isTrue) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}

		int rating = 5;

		if (rating == 5) {
			System.out.println("Awesome Rating");
		} else if (rating == 4) {
			System.out.println("Good Rating");
		} else if (rating == 3) {
			System.out.println("Average Rating");
		} else {
			System.out.println("Poor Rating");
		}

		// Nested if else

		int favTemp = 75;
		int currentTemp = 30;

		String opinion;

		if (favTemp == currentTemp) {

			if (currentTemp <= favTemp - 20) {
				opinion = "cold";
			} else {
				opinion = "Good Day";
			}

		} else {
			opinion = "unknown temp";
		}

		System.out.println(opinion);

		// switch statement
		int month = 1;
		String monthString;

		switch (month) {
		case 1:
			monthString = "Jan";
			break;
		case 2:
			monthString = "Feb";
		default:
			monthString = "unknown month";
			break;
		}

		System.out.println(monthString);

	}

}
