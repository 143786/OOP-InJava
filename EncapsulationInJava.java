package OPPs;

class Person{
    private String firsName;
    private String lastName;

    public  String getFirstName(){
       return this.firsName;
    }
    public void setFirstName(String firsName) {
        this.firsName = firsName;
    }
    public  String getLastName() {
         return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName= lastName;
    }


}

public class EncapsulationInJava {
    public static void main(String[] args) {
        Person person = new Person();

    }
}
