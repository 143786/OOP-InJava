package OPPs;
import java.util.Scanner;

class student {

    // Data Members
    private int studentId;
    private String studentName;
    private int studentAge;
    Scanner scanner = new Scanner("System.in");

    // Member Function
    void acceptDetails(){
        System.out.println("Enter Student Id : ");
        studentId = scanner.nextInt();
        System.out.println("Enter Student Name : ");
        studentName = scanner.next();
        System.out.println("Enter Student Age : ");
        studentAge = scanner.nextInt();

    }
    void displayDetails(){
        System.out.println("student Id : " + studentId);
        System.out.println("student Name : " + studentName);
        System.out.println("student Age : " + studentAge);

    }

    class Marks extends student {
        private float objectiveMarks;
        private float subjectiveMarks;
        
    }

}

public class InheritanceInJava {
    public static void main(String[] args) {

    }
}
