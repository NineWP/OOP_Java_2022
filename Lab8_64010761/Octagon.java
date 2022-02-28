public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
    private double sides;

    Octagon(){
        sides = 0;
    }

    public Octagon(double sides){
        this.sides = sides;
    }

    public Octagon(double sides, String color, boolean filled){
        this.sides = sides;
        setColor(color);
        setFilled(filled);
    }

    public double getSide(){
        return sides;
    }

    public void setSide(double sides){
        this.sides = sides;
    }

    public double getArea(){
        return (2 + 4/22) * sides * sides;
    }

    public double getPerimeter(){
        return sides * 8;
    }

    public int compareTo(Octagon oct){
        if(getArea() > oct.getArea()){
            return 1;
        }
        else if (getArea() < oct.getArea()){
            return 0;
        }
        else {
            return -1;
        }
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String toString(){
        return super.toString() + "\nSides : " + sides + "\nArea : " + getArea() + "\nParimeter : " + getPerimeter();
    }

}
