/**
 * Given a string in the same flow, but reversing each word of it
 * 
 * @author miaoguo
 *
 */
public class ReveseStringFlow {
	
	public static void main(String[]args){
		
		String words = "Hello World";
		System.out.println(words);
		String[] wordlist = words.split("\\s+");
		for(String word: wordlist){
			 
			for(int i = word.length();i>0;i--){
				
				System.out.print(word.substring(i-1,i));
				
			}
			System.out.print(" ");
		}
		
	}

}
