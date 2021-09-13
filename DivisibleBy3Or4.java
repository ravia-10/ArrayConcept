package ArrayConcepts;

public class DivisibleBy3Or4 {

	public static void main(String[] args) {
		int divisible[] = { 2, 4, 6, 1, 11, 33, 66, 18, 2020, 2021, 12 };
		for (int i = 0; i < divisible.length; i++) {
			if (divisible[i] % 4 == 0 || divisible[i] % 3 == 0) {
				System.out.println("numbers is divisible by 4 or  3 is "+ divisible[i]);
			}
		}
	}

}
