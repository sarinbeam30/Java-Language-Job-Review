package Java_Abstraction;


abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Rectangle draw");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle draw");
    }
}

public class TestAbstraction1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();
        r1.draw();
        c1.draw();

        //abstract class can call every class which inherit or extend from its.
        Shape s1 = new Circle();
        s1.draw();

        Shape s2 = new Rectangle();
        s2.draw();
    }
}
