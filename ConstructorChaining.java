package OPPs;

class person {
    String name;
    public person() {
        System.out.println("Person Class Constructor Invoked");
        name = "Ayline Tabish";

    }

}

class Employee extends person{
    String designation;
    public Employee(){
        designation = "Manager";


    }

}




public class ConstructorChaining {
    public static void main(String[] args) {
        Employee employee = new Employee();


    }
}
