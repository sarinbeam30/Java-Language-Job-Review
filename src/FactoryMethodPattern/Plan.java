package FactoryMethodPattern;

// Abstraction show the essential things to the user.
// Abstraction show only the functionality to the user.
// Abstraction let you focus on what the object does instead of how object work
// final method will force the subclass not to change anything.


abstract class Plan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
