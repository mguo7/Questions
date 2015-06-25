import java.util.Scanner;

/*
 * Write  a Java program to calculate a to b I.e a power b.
 */
public class PowerCalculator {
	
	
	
	public void showMenu(){
		
		Scanner scanner = new Scanner(System.in);
		try{
		System.out.println("Please enter the first number as base");
		double a = scanner.nextDouble();
		System.out.println("Please enter the second number as exponent");
		double b = scanner.nextDouble();
		System.out.println(a + " power " + b + " is: ");
		System.out.println(Math.pow(a,b));
		System.out.println("Continue?yes or no");
		String s = scanner.next();
		if(s.equals("yes")){
			
			showMenu();
		}else{
			System.out.println("Thanks for using!");
		}
		} catch(Exception e){
			
			System.err.println("Error!Please try again!");
		} finally {
			
			scanner.close();
		}
		
	}
	
	
	public static void main(String[] args){
		
		
		PowerCalculator cal = new PowerCalculator();
		cal.showMenu();
	}

}
