
class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public void print () {
        System.out.println("Name :  " + this.name);
        System.out.println("Age :  " + this.age);
    }
}

class Employee extends Person {
    String designation;
    float salary;
    public Employee(String designation, float salary){
        this.designation = designation;
        this.salary = salary;
        
    }



}




public class MethodOverriding {
    public static void main(String[] args) {

    }
}
