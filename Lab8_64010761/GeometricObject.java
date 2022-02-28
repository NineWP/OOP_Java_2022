import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){
        color = "";
        filled = true;
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean getFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public String getDateCreate(){
        return dateCreated.toString();
    }

    public String toString(){
        return "\nDate create : " + dateCreated + "\ncolor : " + color + "\nfilled : " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
