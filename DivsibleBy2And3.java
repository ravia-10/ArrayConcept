package ArrayConcepts;

public class DivsibleBy2And3 {

	public static void main(String[] args) {
		int divisible[] = { 2, 4, 6, 1, 11, 33, 66, 18, 2020, 2021 ,12};
		for (int i = 0; i < divisible.length; i++) {
			if (divisible[i] % 2 == 0 && divisible[i] % 3 == 0) {
				System.out.println("numbers is divisible by 2 and 3 is "+ divisible[i]);
			}
		}
	}
}
