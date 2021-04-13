package Java_Interface;

public class Pig implements Animal, Pet {
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void petSound() {
        System.out.println("The cat says: wee wee");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();      //create a pig object
        myPig.animalSound();
        myPig.petSound();
        myPig.sleep();
    }
}
