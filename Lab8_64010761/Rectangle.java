import java.lang.Comparable;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
    private double width;
    private double height;

    Rectangle(){
        width = 0;
        height = 0;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, Boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight(){
        return height;
    }
    
    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (width * 2) + (height * 2);
    }

    public int compareTo(Rectangle rec){    
        if(getArea() > rec.getArea()){
            return 1;
        }
        else if (getArea() < rec.getArea()){
            return 0;
        }
        else {
            return -1;
        }
    }

    public String toString(){
        return super.toString() + "\nWidth : " + width + "\nHeight : " + height + "\nArea : " + getArea() + "\nPerimeter : " + getPerimeter();
    }
}
