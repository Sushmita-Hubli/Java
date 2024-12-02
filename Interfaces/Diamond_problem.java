package Interfaces;

interface A {
    default void display() {
        System.out.println("A's display");
    }
}

interface B {
    default void display() {
        System.out.println("B's display");
    }
}

class C implements A, B {
    @Override
    public void display() {
        // You must specify which interface's method you want to call
        A.super.display(); // Calling A's display method
        // or B.super.display(); for B's version
        System.out.println("C's own display");
    }
}

public class Diamond_problem {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();  // Resolves the ambiguity



        //Java allows multiple inheritance through interfaces. If a class implements multiple interfaces that have the same default method, Java provides a way to resolve the ambiguity.
        //If a class inherits the same default method from multiple interfaces, it must override the method and provide its own implementation.
    }
}

