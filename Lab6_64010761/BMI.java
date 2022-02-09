public class BMI {
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;

    public BMI(String name, int age, double weight, double feet, double inches){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    public double getBMI(){
        double w = this.weight * 0.45359237;
        double h = this.inches * 0.0254;
        return w / (h*h);
    }

    public String getInterpretation(){
        double bmi = getBMI();
        if(bmi >= 30)
            return "Obese";
        else if(bmi >=25)
            return "Overweight";
        else if(bmi >= 18.5)
            return "Normal";
        else
            return "Underweight";
    }
}
