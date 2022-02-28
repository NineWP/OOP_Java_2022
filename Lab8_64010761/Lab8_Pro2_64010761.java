public class Lab8_Pro2_64010761 {
    public static void main(String[] args) {
        GeometricObject [] geometricObject = {  new Triangle(5,5,5,"Green",true),
                                                new Square(5,"Blue",true),
                                                new Square(9,"Black",false),
                                                new Triangle(5,12,13,"Red",false),
                                                new Square(20,"Yellow",true)
                                            };

        for(int i = 0 ; i < geometricObject.length ; i++){
            System.out.println(geometricObject[i].toString());
        }
    }
}
