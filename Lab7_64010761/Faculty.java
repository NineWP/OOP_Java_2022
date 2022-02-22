public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email, int office, double salary, String officeHours, String rank) {
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

    public String getOfficeHours() {
		return officeHours;
	}

    public String getRank() {
		return rank;
	}

    public String toString() {
		return "Faculty\n" + super.toString() + " Faculty{Office hours=" + officeHours + ", Rank=" + rank + "}";
	}
}
