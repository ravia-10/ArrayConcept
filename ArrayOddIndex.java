package ArrayConcepts;

public class ArrayOddIndex {

	public static void main(String[] args) {
		int oddNumber[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 1001,111 };
//put variableName[i] only in if condition
		for (int i = 0; i < oddNumber.length; i++) {
			if (oddNumber[i] % 2 != 0) {

				System.out.println("odd index value is :" + i);
			}

		}
	}

}
