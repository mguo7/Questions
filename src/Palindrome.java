

public class Palindrome {
/*
 *Given an integer check if it is a Palindrome  
 */
public static void main(String[] args){
		
	
	    
		Integer number = 1221;
		String num = number.toString();
		String temp =  "";
		
		System.out.println("The integer is "+number);
		
		for(int i = num.length();i>0;i--){
			
			 
			temp += num.substring(i-1,i);
			
		}
		 
		
		 Integer newnumber = Integer.parseInt(temp);
		  
		 if(!newnumber.equals(number)){
			 
			 System.out.print("It is not a Palindrome.");
		 } else {
			 
			 System.out.print("It is a Palindrome.");
		 }
		
	}
}
