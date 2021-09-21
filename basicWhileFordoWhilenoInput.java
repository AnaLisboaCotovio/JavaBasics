public class basicWhileFordoWhilenoInput {
    
    public static void main(String[] args) {

        // Variables
        int x = 2;
		int i = 1;
        int y = 1;
		int j;
        int k1 = 0;
        int k2 = 0;
        int k3 = 0;
        int w = 3;
        int v = 1;
		
        // While
		while (i<7) {
			i*= x;
			x*= i;
			x++;
			i--;
            k1++;

            System.out.println("The value of i is " + i + " and x is " + x + " in the iteration " + k1);
		}

        System.out.println("The while stopped");
        System.out.println(" ");
		
        // For
		for (j = 0; j < 6; j = j +2) {
			y *= y + j;
            k2++;
		
            // Prints
		System.out.println("The value of y is " + y + " and j is " + j + " in the iteration " + k2);		
		}

        System.out.println("The for stopped");
        System.out.println(" ");

        // Do-While
        do {
            v *= w;
		    w = v *5;
            k3++;
            System.out.println("The value of w is " + w + " and v is " + v + " in the iteration " + k3);
		} while (w < 35);

        System.out.println("The do-while stopped");
    }
}
