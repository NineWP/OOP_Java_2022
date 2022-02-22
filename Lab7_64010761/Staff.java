public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phone, String email, int office, double salary, String title) {
		super(name, address, phone, email, office, salary);
		this.title = title;
	}

    public String getTitle() {
        return title;
    }

    public String toString() {
		return "Staff\n" + super.toString() + "Staff{Title=" + title + "}";
	}
}
