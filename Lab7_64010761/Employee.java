import java.util.Date;

public class Employee extends Person {
    private int office;
    private double salary;
    private Date date;

    Employee(){
        office = 0;
        salary = 10000;
        date = new Date();
    }

    public Employee(String name, String address, String phone, String email, int office, double salary){
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.date = new Date();
    }

    public int getOffice(){
        return office;
    }

    public double getSalary(){
        return salary;
    }

    public String getDate(){
        return date.toString();
    }

    public String toString() {
		return super.toString() + " Employee{Office=" + office + ", Salary=" + getSalary() + ", Date hired=" + getDate() + "}";
	}
}
