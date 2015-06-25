/*
 *  Given a string print the reverse of the string
 */
public class RevrseString {
	
	public static void main(String[] args){
		
		
		String words = "Hello World";
		String[] temp = new String[words.length()];
		
		for(int i = 0;i<words.length();i++){
			
			System.out.print(words.substring(i,i+1));
			temp[temp.length-i-1] = words.substring(i,i+1);
			
		}
		
		System.out.println();
		for(String w:temp){
			
			System.out.print(w);
			
		}
		
	}

}
