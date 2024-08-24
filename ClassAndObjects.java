package OPPs;

import java.util.Scanner;

class Student {
    // DATA MEMBERS
    int studentId;
    String studentName;
    int studentAge;
    Scanner scanner = new Scanner(System.in);


    // MEMBER FUNCTION

    public void acceptDetails(){
        System.out.print("Enter Student Id :  ");
        studentId = scanner.nextInt();
        System.out.print("Enter Student Name :  ");
        studentName = scanner.next();
        System.out.print("Enter Student Age : ");
        studentAge = scanner.nextInt();


    }
    public void displayDetails(){
        System.out.println("Student Id : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);


    }
}

public class ClassAndObjects {
    public static void main(String[] args) {
        // Creating an object of Class Student
        Student student = new Student();
        student.acceptDetails();
        student.displayDetails();

       /* Student student1 = new Student();
        student1.acceptDetails();
        student1.displayDetails();

        Student student2 = new Student();
        student2.acceptDetails();
        student2.displayDetails();

        */



    }
}
