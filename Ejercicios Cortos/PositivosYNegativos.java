public class PositivosYNegativos {

	public static int[] countPositivesSumNegatives(int[] input) {
		int countPositives = 0;
		int sumNegatives = 0;
		if (input == null || input.length == 0) {
			int[] nullArray = new int[0];
			return nullArray;
		} else {
			for (int i : input)
				if (i > 0) {
					countPositives++;
				} else if (i < 0) {
					sumNegatives += i;
				}

		}
		return new int[] { countPositives, sumNegatives };
	}

	

	public static void main(String[] args) {
		int[] input = { 0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14 };
		for (int i : countPositivesSumNegatives(input)) {
			System.out.print(i + " ");
		}
	}


}
