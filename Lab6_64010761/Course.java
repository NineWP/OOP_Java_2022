import java.util.Arrays;

public class Course {
    private String courseName;
    private int Defult_Number = 3;
    private String [] student = new String[Defult_Number];
    private int numberOfStudents = 0;       

    Course(String courseName){
        this.courseName = courseName;
        numberOfStudents = 0;
    }

    public String getCourseName(){
        return courseName;
    }

    public String [] getStudents() {
        return student;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public void addStudent(String student){

        //Create new array when number of student > defult number

        if(numberOfStudents >= Defult_Number){
            String [] temp = new String[this.student.length + 1];
            for(int i = 0 ; i < this.student.length ; i++){
                temp[i] = this.student[i];
            }
            this.student = temp;
        }
        this.student[numberOfStudents++] = student;
    }

    public void dropStudent(String student){
        for(int i = 0 ; i < this.student.length ; i++){
            if(this.student[i].equals(student)){

                this.student[i] = null;
                //shift null array to the last index
                for(int j = i; j < numberOfStudents - 1 ; j++){
                    String temp = this.student[j];
                    this.student[j] = this.student[j+1];
                    this.student[j+1] = temp;
                }
                break;
            }
        }
        numberOfStudents--;
        if(this.student.length > Defult_Number){
            String [] temp = new String[this.student.length - 1];
            for(int i = 0 ; i < this.student.length-1 ; i++){
                temp[i] = this.student[i];
            }
            this.student = temp;
        }
    }

    public void clear(){
        for(int i = 0 ; i < student.length ; i++){
            student[i] = null;
            numberOfStudents--;
        }
    }

    public int getLength(){
        return student.length;
    }
}
