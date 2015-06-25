/**
 *  Given an array of integers, sort the integer values.
 * @author miaoguo
 *
 */
public class IntegerSorter {

	private int[] sortArray(int[] A) {

		int[] temp = new int[A.length];
		int[] index = new int[A.length];
		for(int i = 0;i<index.length;i++){
			
			index[i] = -1;
		}

		int min = A[0];
		int minid = 0;

		for (int m = 0; m < A.length; m++) {

			for (int n = 0; n < A.length; n++) {

				boolean sorted = false;
				for (int i : index) {

					if (n == i) {
						sorted = true;
						break;

					}

				}

				if (sorted) {

					continue;
				}
				
				//System.out.println("An "+A[n]);
				
				if (min > A[n]) {

					min = A[n];
					minid = n;
					//System.out.print(minid+"! ");
				}

			}

			temp[m] = min;
			index[m] = minid;
			min =  Integer.MAX_VALUE;
			

		}

		return temp;
	}

	public static void main(String[] args) {

		int[] nums = { 4, 3, 8, 20, 10, 12 };
		IntegerSorter sort = new IntegerSorter();

		System.out.println("Before sorting: ");
		for (int i : nums) {

			System.out.print(i + " ");
		}
		
		System.out.println("");
		System.out.println("After sorting: ");

		int[] sorted = sort.sortArray(nums);
		for (int i : sorted) {

			System.out.print(i + " ");
		}

	}

}
