package OPPs;

import javax.sound.midi.Soundbank;

class Person{
    private String firsName;
    private String lastName;
    private int age;

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
    public  int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        if (age >= 18)
        this.age= age;
        else
            System.out.println("Invalid Age");
    }



}

public class EncapsulationInJava {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Ayline");
        System.out.println(person.getFirstName());
        person.setLastName("Tabish");
        System.out.println(person.getLastName());
        person.setAge(33);
        System.out.println(person.getAge());


    }
}
