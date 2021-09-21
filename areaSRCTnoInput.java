public class areaSRCTnoInput {

    public static void main(String [] args) {
        
        //Variables
        //Square
        double square_side = 10;
        //Rectangle
        double rectangle_height = 5;
        double rectangle_width = 10;
        //Circle
        double circle_radius = 10;  
        //Triangle
        double triangle_base = 10;
        double triangle_height = 20;

        //Calculation of the areas
        double square_area = Math.pow(square_side, 2); //Square
        double rectangle_area = rectangle_height * rectangle_width; //Rectangle
        double circle_area = Math.PI * Math.pow(circle_radius, 2); //Circle
        double triangle_area = (triangle_base * triangle_height) / 2;

        //Prints of the areas
        System.out.println("The square's area is " + (double) Math.round(square_area * 1000) / 1000 + "cm"); //Square
        System.out.println("The rectangle's area is " + (double) Math.round(rectangle_area * 1000) / 1000 + "cm"); //Rectangle
        System.out.println("The circle's area is " + (double) Math.round(circle_area * 1000) / 1000 + "cm"); //Circle
        System.out.println("The triangle's area is " + (double) Math.round(triangle_area * 1000) / 1000 + "cm"); //Triangle
    }
}