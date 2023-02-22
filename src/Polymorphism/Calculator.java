package Polymorphism;

public class Calculator {

    public void add(int a, int b){ //add(int,int)
        System.out.println(a+b);
        System.out.println("Integer+Integer addition.");
    }

    public void add(int a, double b){ //add(int, double)
        System.out.println(a+b);
        System.out.println("Integer+double addition.");
    }

    public void add(double a, int b){//add(double, int)
        System.out.println(a+b);
        System.out.println("double+Integer addition.");
    }

    public void add(double a, double b){//add(double, double)
        System.out.println(a+b);
        System.out.println("double+double addition.");
    }
}

