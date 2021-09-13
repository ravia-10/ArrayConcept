package ArrayConcepts;

public class ArrayEvenIndex {

	public static void main(String[] args) {
		int evenNumber[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100 ,120,130};

		for (int i = 0; i < evenNumber.length; i++) {
			if (evenNumber[i] % 2 == 0) {

				System.out.println("even index value number is :" + i);
			}

		}
	}

}
