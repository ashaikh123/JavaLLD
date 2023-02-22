package staticDemo;

public class Client {
    public static void main(String[] args) {
        // instance attributes and methods -> they need object instances for usage
        Animal a = new Animal();
        a.id = 10;
        a.name = "Tiger";
        Animal.noOfLegs = 4;
        Animal.eats();
        a.sayHello();
        System.out.println(a.id);
        System.out.println(a.name);
        System.out.println(a.noOfLegs);
    }
}
