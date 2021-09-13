package ArrayConcepts;

public class ArrayEvenNumber {

	public static void main(String[] args) {
		int evenNumber[] = { 0, 1, 2, 3, 22, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < evenNumber.length; i++) {
			if (evenNumber[i] % 2 == 0) {

				System.out.println("even number is :" + evenNumber[i]);
			}
		}

	}
}
