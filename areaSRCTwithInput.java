import java.util.Scanner;

public class areaSRCTwithInput {
    
    public static void main(String[] args) {
    
        // Welcome message
        Scanner s = new Scanner(System.in);
		System.out.println("Calculation of Areas");

        // Collection
        // What polygon will have the area calculated
        System.out.println("1: Triangle's Area \n2: Square's Area \n3: Circle's Area \n4: Rectangle's Area");
		System.out.print("Type your option: ");
		double option = s.nextDouble();

        //Result
        if (option == 1) {
			System.out.println("Please, inform the base of the Triangle: ");
			double b = s.nextDouble();
			
			System.out.println("Please, inform the height of the Triangle: ");
			double h = s.nextDouble();

            double result_t = (b * h) / 2;
			System.out.println("The result is: " + (double)Math.round(result_t * 1000) / 1000);
		} else {
			if (option == 2) {
				System.out.println("Please, inform the side of the Square: ");
				double a = s.nextDouble();
				
				double result_s = Math.pow(a , 2);
				System.out.println("The result is: " + (double)Math.round(result_s * 1000) / 1000);
			} else {
				if (option == 3) {
					System.out.println("Please, inform the radius of the Circle: ");
					double r = s.nextDouble();
					
					double result_c = Math.PI * Math.pow(r , 2);
					System.out.println("The result is: " + (double)Math.round(result_c * 1000) / 1000);
				} else {
					if (option == 4) {
						System.out.println("Please, inform the width of the Rectangle: ");
						double w = s.nextDouble();
						
						System.out.println("Please, inform the height of the Rectangle: ");
						double h = s.nextDouble();
						
						double result_r = w * h;
						System.out.println("The result is: " + (double)Math.round(result_r * 1000) / 1000);
					} else
						System.out.println("The number you type has to be between 1 and 4");
				}
            }
        }

        s.close();
    }
}
