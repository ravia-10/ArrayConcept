package ArrayConcepts;

public class SumOfArray {

	public static void main(String[] args) {
		int sum[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int res=0;
		for (int i = 0; i < sum.length; i++) {
			 res = res+sum[i];
		}
		System.out.println("sum of array is " + res);

	}

}
