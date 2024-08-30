
class Vehicle{
    void drive() {
        System.out.println("Driving a vehicle..");

    }

}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a Car.");

    }
    void speedUp(){
        System.out.println("Speeding up a Car");

    }

}


public class UpCastingDownCastingInJava {
    public static void main(String[] args) {

        /* here in the main method, istantiating a Vehicle class, but
       initializing the Car class. it's a Downcasting */

        Vehicle vehicle = new Car();
        

    }
}
