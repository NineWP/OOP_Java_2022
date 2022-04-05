import java.util.Scanner;

public class Lab10_Pro2_64010761 {
    static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {

        boolean repeatInput = true;
        do{
            System.out.print("Enter side length of the triangle : ");
			double side1 = sc.nextDouble();		
			double side2 = sc.nextDouble();		
			double side3 = sc.nextDouble();

            System.out.print("Enter color of the triangle : ");
            String color = sc.next();
            
            System.out.print("Is the triangle filled (true / false)? : ");
            boolean filled = sc.nextBoolean();

            try {
				Triangle triangle = new Triangle(side1, side2, side3);
				repeatInput = false;	
				triangle.setColor(color);
                triangle.setFilled(filled);
		
				System.out.println(triangle.toString());
				System.out.println("Area: " + triangle.getArea());
				System.out.println("Perimeter: " + triangle.getPerimeter());
				System.out.println("Color: " + triangle.getColor());
				System.out.println("Triangle is" + (triangle.getFilled() ? "" : " not ") + "filled");
			}
			catch (IllegalTriangleException ex) {
				System.out.println(ex.getMessage());
			}
        }while(repeatInput);
        
            

    }
}
