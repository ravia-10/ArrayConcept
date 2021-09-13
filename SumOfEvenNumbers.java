package ArrayConcepts;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int evenNumber[] = { 0, 1, 2, 3, 45, 6, 7, 8, 9, 11, 12, 334, 5, 67, 27 };
		int res = 0;
		for (int i = 0; i < evenNumber.length; i++)

			if (evenNumber[i] % 2 == 0)

				res = res + evenNumber[i];

		System.out.println("sum is " + res);

	}
}
