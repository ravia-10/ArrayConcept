package ArrayConcepts;

public class SumOfOddNumber {

	public static void main(String[] args) {

		int oddNumber[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 121 };
		// put variableName[i] in if loop and also printing
		int res = 0;
		for (int i = 0; i < oddNumber.length; i++)
			if (oddNumber[i] % 2 != 0)
				res = res + oddNumber[i];
		System.out.println("odd number sum is :" + res);
	}

}
