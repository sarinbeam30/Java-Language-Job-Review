// Abstract class can have data member, abstract method, method body (non-abstarct method), constructor, and main() method

package Java_Abstraction;

// Bike abstract class which have constructor, abstract, and non-abstract method
abstract class Bike {
    Bike() {
        System.out.println("Bike is created");
    }

    abstract void run();
    void changeGear() {
        System.out.println("gear changed");
    }
}

// Creating a Child class which inherit from abstract class
class Honda extends Bike {
    @Override
    void run() {
        System.out.println("Honda is running");
    }

    @Override
    void changeGear() {
        System.out.println("Change gear to 6");
    }
}

public class TestAbstraction2 {
    public static void main(String[] args) {
        Bike honda = new Honda();
        honda.run();
        honda.changeGear();
    }
}
