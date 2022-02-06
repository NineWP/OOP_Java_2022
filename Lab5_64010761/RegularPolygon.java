import java.lang.Math;
public class RegularPolygon {
    private int n; 
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        this.n = 3;
        this.side = 1.0;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public double getPerimeter(){
        return side * n;
    } 

    public double getArea(){
        return (n*side*side)/(4*(Math.tan(Math.PI/n)));
    }
}
