import java.util.HashMap;

/**
 *  Print the unique numbers and also print the number of occurrences of duplicate numbers.
 * @author miaoguo
 *
 */
public class UniqueNumber {

	public static void main(String[] args){
    HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();
    int[] nums = { 4, 4, 19, 20, 45, 2, 13, 20, 20, 8};
		
		System.out.print("the array is " );
		for(int num:nums){
			
			System.out.print(num+" ");
			if(numbers.containsKey(num)){
				
				int counter = numbers.get(num)+1;
				numbers.put(num, counter);
			} else {
				
				numbers.put(num, 1);
			}
		}
		 
		System.out.println();
		System.out.println("The unique numbers are: ");
		for(Integer num:numbers.keySet()){
			
			if(numbers.get(num)==1){
			System.out.print(num+" ");
			}
			
		}
		System.out.println();
		System.out.println("The duplicate numbers are: ");
		for(Integer num:numbers.keySet()){
			
			if(numbers.get(num)>1){
			System.out.print(num+"("+numbers.get(num)+ " times); ");
			}
			
		}
		
	}
}
