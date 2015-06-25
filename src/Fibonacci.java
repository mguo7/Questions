import java.util.ArrayList;

/**
 * Given an array of integers check the Fibonacci series.
 * 
 * @author miaoguo
 * 
 */
public class Fibonacci {

	private ArrayList<ArrayList<Integer>> list;

	public Fibonacci() {

		this.list = new ArrayList<ArrayList<Integer>>();
	}

	public void findFibonacci(int[] array, int startIndex) {

		int startId = -1;
		int endId = array.length;

		for (int i = startIndex; i < array.length; i++) {

			if (array[i] == array[i - 1] + array[i - 2]) {

				startId = i - 2;
				break;
			}
		}

		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		for (int i = startId+2; i< array.length-2; i++) {

			if (array[i + 2] != array[i] + array[i + 1]) {
				endId = i + 2;

				break;
			} else {

				continue;

			}

		}

		for (int i = startId; i < endId; i++) {

			fibonacci.add(array[i]);

		}

		list.add(fibonacci);
		if(endId<array.length-2){
		findFibonacci(array, endId+2);
		}

	}

	public static void main(String[] args) {

		int[] array = { 4, 1, 1, 2, 3, 5, 8, 9, 21, 34, 55, 89, 144, 1, 1, 2 };
		
		System.out.println("The array is: ");
		for(int n:array){
			
			System.out.print(n+ " ");
		}
		
		System.out.println("");
		if (array.length < 3) {

			System.out.println("the array is too short!");
		} else {

			Fibonacci fi = new Fibonacci();
			fi.findFibonacci(array, 2);
			System.out.println(fi.list.size()+" fibonacci series found: ");
			for(ArrayList<Integer> fib:fi.list){
				
				System.out.println(fib);
			}

		}

	}

}
