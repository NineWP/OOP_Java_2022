public class Square extends GeometricObject implements Colorable {
    private double sides;

    public Square(){
        sides = 0;
    }

    public Square(double sides, String color, boolean filled){
        this.sides = sides;
        setColor(color);
        setFilled(filled);
    }

    public double getArea(){
        return sides * sides;
    }

    public double getPerimeter(){
        return sides * 4;
    }

    public String howToColor(){
        return "Color all four sides.";
    }

    public String toString(){
        return super.toString() + "\nSide : " + sides + "\nArea : " + getArea() + "\nPerimeter : " + getPerimeter() + "\nHow to color : " + howToColor();
    }
}
