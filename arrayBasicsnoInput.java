public class arrayBasicsnoInput {
    
    public static void main(String [] args) {
        String str0 = "ABC", str1 = "ABCDE", str2 = "ABCDEFG";
		
		int[] x = {str0.length(),str1.length(),str2.length()};
		double a = x[2];
		int i;
		
		for (i=1; i<x.length; i++) {
			if(x[i-1] < x[i])
				x[i] = x[i-1];
			else
				x[i-1] = x[i];
			a += x[i];
		System.out.println("The value of a is " + a + " and the value of the array is " + x[i] + " in the iteration " + i);
		}
    }
}
