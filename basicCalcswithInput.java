import java.util.Scanner;

public class basicCalcswithInput {
    
    public static void main(String [] args) {
        
        //Collection of variables
        Scanner key = new Scanner(System.in);
        System.out.print("What is the value of a? ");
        int a = key.nextInt();
		System.out.print("What is the value of b? ");
		int b = key.nextInt();  

        //Calculations
        double c = a + b;
		double result = Math.pow(c, 2);

        //Answer and error messages
        if(a != 0) {
			if (b != 0) {
				System.out.println("The rsult of (a+b+c)^2 is " + result);
            } else {
				System.out.println("The variable b cannot be 0");
            }
        } else{
			System.out.println("The variable a cannot be 0");
        }
		
		key.close();
    }
}