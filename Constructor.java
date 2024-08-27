class Student {
    // Data Members
    private int studentId;
    private String studentName;
    private int studentAge;

    public Student() {
        this.studentId = 100;
        this.studentName = "Unknown";
        this.studentAge = 18;



    }

    void displayDetails(){
        System.out.println("Student Id : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);


    }
}

public class Constructor {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();


    }
}
