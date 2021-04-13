package Java_Abstraction;

abstract class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    @Override
    int getRateOfInterest() {
        return 2;
    }
}

class PNB extends Bank {
    @Override
    int getRateOfInterest() {
        return 3;
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of Interest is : " + b.getRateOfInterest() + " %");
        b = new PNB();
        System.out.println("Rate of Interest is : " + b.getRateOfInterest() + " %");
    }
}
