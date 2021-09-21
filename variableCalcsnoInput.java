public class variableCalcsnoInput {

    public static void main(String [] args) {
        
        //Variables
        //Quadratic formula
        int a = 1;
        int b = -1;
        int c = -6;
        //Basics 1 - double
        double y = 10;
        //Basics 2 - int and boolean
        boolean z;
		int d = 1;
		int e = 2;
		int f = 4;
		int g = 6;
        //Basics 3 - double with round
        double w = 43;
        //Basics 4 - boolean
        boolean t = false;
		boolean u = true;

        //Calculations
        //Quadratic formula
        double x = (-b +- Math.sqrt(Math.pow(b, 2)) - 4 * a * c) / 2 * a;
        //Basics 1 - double
        y = y - (y / 100) * 10;
        y = y + (y / 100) * 10;
        y *= 1;
        //Basics 2 - int and boolean
        int h = a*c+1; 
		z = ((d+e+f+g+h < 3*d-2*e+3*f) && f/g < 1) && true; 
        //Basics 3 - double with round
        w *= 5;
		w -= 5;
		w = 1 + (100 % ((w * 2) / ((w / 10) + 2)));
        //Basics 4 - boolean
        boolean v = ((t && u) && (t || u) ) || ((true && u) && false);

        //Print Result
        System.out.println("The result of the quadratic formula is " + x); //Quadratic formula
        System.out.println("The value of y is " + y); //Basics 1 - double
        System.out.println("The operations are " + z); //Basics 2 - int and boolean
        System.out.println("The value of w is " + Math.round(w));//Basics 3 - double with round
        System.out.println("The statement is " + v);//Basics 4 - boolean
    }
}