package patterProgrames;

public class WaterGlass {
	public static void main(String[] args) {
		pattern(5);
	}

	public static void pattern(int num) {
		for (int i = 1; i < 2 * num; i++) {

			for (int j = 1; j <= 2 * num; j++) {

				if ((i <= j && i + j <= 2 * num) || (i + j >= 2 * num && i >= j)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
