public class PositivosYNegativos {

	public static int[] countPositivesSumNegatives(int[] input) {
		ArrayList<Integer> positives = new ArrayList<Integer>();
		ArrayList<Integer> negatives = new ArrayList<Integer>();
		for (int i : input)
			if (i > 0) {
				positives.add(i);
			} else if (i < 0) {
				negatives.add(i);
			}
		int aux = 0;
		for (int i : negatives) {
			aux += i;
		}
		int[] result = { positives.size(), aux };
		return result; // return an array with count of positives and sum of negatives
	}

	public static void main(String[] args) {
		int[] input = { 0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14 };
		for(int i : countPositivesSumNegatives(input)) {
			System.out.print(i + " ");
		}
	}

}
