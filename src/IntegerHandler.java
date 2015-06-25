/*
 * Given an array of integers move all even numbers to the beginning of the array.
 */
public class IntegerHandler {

	public int[] moveInteger(int[] A, int evenid) {

		int oddid = -1;
		int oddnum = -1;

		for (int i = 0; i < A.length; i++) {

			if (A[i] % 2 != 0) {

				oddid = i;
				oddnum = A[i];
				break;
			}
		}

		for (int i = evenid; i < A.length; i++) {

			if (A[i] % 2 == 0 && i > oddid) {

				A[oddid] = A[i];
				A[i] = oddnum;
				evenid = oddid;
				moveInteger(A, i);
				break;
			}
		}

		return A;
	}

	public static void main(String[] args) {

		int[] array = { 2, 3, 9, 6, 21, 23, 24, 8 };
		int evennum = 0;
		int oddnum = 0;

		System.out.println("The original array is: ");

		for (int n : array) {

			System.out.print(n + " ");
		}

		for (int num : array) {

			if (num % 2 == 0) {

				evennum++;
			} else {

				oddnum++;
			}
		}

		if (evennum == 0) {

			System.out.println("No even Integer!");
		} else if (oddnum == 0) {

			System.out.println("No odd Integer!");
		} else {

			IntegerHandler handler = new IntegerHandler();
			array = handler.moveInteger(array, 0);
			System.out.println("");
			System.out.println("Now the array is...");
			for (int n : array) {

				System.out.print(n + " ");
			}

		}

	}

}
