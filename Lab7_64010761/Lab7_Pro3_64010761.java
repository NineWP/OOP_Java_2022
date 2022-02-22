public class Lab7_Pro3_64010761 {
    public static void main(String[] args) {
        Person person = new Person("nine", "bangkok", "1525245", "nine@gmail.com");
		Student student = new Student("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789", "somsak@mymail.com", Student.FRESHMAN);
    	Employee employee = new Employee("lol", "near thailand", "4535215214","lol@gmail.com", 650, 30000);
        Faculty faculty = new Faculty("haha", "nort pluto", "09522255555","haha@mail.com", 2000, 50000, "15-21 pm", "Professor");
        Staff staff = new Staff("jerry", "TV", "0101010101","jerry@mail.com", 65, 65000, "cartoon charactor");

		System.out.println(person.toString()+"\n");
		System.out.println(student.toString()+"\n");
		System.out.println(employee.toString()+"\n");
		System.out.println(faculty.toString()+"\n");
		System.out.println(staff.toString()+"\n");
    }
}
