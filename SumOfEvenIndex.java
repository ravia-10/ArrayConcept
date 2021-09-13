package ArrayConcepts;

public class SumOfEvenIndex {

	public static void main(String[] args) {
		int evenNumber[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100, 120, 130 };
		int res = 0;
		for (int i = 0; i < evenNumber.length; i++)
			if (evenNumber[i] % 2 == 0)
				res = res + i;
		System.out.println("sum of even index value number is :" + res);
	}

}
