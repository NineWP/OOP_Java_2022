public class Pro2_64010761 {
    public static void main(String[] args) {
        Course course = new Course("math");
        course.addStudent("kim");
        course.addStudent("jack");
        course.addStudent("anna");
        course.addStudent("laura");

        course.dropStudent("kim");

        //course.dropStudent("anna");

        for(int i = course.getNumberOfStudents() ; i > 0; i--){
            System.out.println(course.getStudents()[course.getNumberOfStudents()-i]);
        }

        //System.out.println(course.getLength());
    }
}
