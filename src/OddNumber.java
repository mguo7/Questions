
/**
 * Given an array of integers, print only odd numbers.
 * @author miaoguo
 *
 */
public class OddNumber {
	
	public static void main(String[] args){
		
		int[] nums = { 4, 11, 9, 22, 1, 12 };
		
		System.out.print("Odd numbers in the array [ " );
		for(int num:nums){
			
			System.out.print(num+" ");
		}
		
		System.out.print("] are:");
		
		for(int num:nums){
			
			if(num%2!=0){
				
				System.out.print(num+ " ");
			}
		}
	}

}
