public class Pro2_64010761 {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        System.out.println("Perimeter : " + polygon1.getPerimeter());
        System.out.printf("Area : %.2f\n", polygon1.getArea());

        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        System.out.println("Perimeter : " + polygon2.getPerimeter());
        System.out.printf("Area : %.2f\n", polygon2.getArea());

        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Perimeter : " + polygon3.getPerimeter());
        System.out.printf("Area : %.2f\n", polygon3.getArea());
    }
}
