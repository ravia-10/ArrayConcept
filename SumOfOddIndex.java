package ArrayConcepts;

public class SumOfOddIndex {

	public static void main(String[] args) {
		int oddNumber[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 1001, 111 };
		int res = 0;
		for (int i = 0; i < oddNumber.length; i++)
			if (oddNumber[i] % 2 != 0)
				res = res + i;
		System.out.println("odd index value is :" + res);
	}

}
