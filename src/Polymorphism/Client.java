package Polymorphism;

public class Client {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        //Overloading
        c.add(10,12);
        c.add(10, 12.12);
        c.add(10.12, 12.12);
        c.add(10.12, 5);



        Vehicle v = new Vehicle();
        ICEVehicle iceVehicle = new ICEVehicle();
        Vehicle ev = new ElectricVehicle();
        //Overriding
        v.startEngine();
        iceVehicle.startEngine();
        ev.startEngine();

    }
}
