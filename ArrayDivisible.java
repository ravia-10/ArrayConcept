package ArrayConcepts;

public class ArrayDivisible {

	public static void main(String[] args) {
		int divisible[] = { 1, 5, 44, 55, 10, 50, 38, 59, 100, 45, 15, 11 };
		for (int i = 0; i < divisible.length; i++) {
			if (divisible[i] % 5 == 0) {
				System.out.println("numbers is divisible by 5 is "
						+ divisible[i]);
			}
		}
	}
}