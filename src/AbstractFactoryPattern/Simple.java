package AbstractFactoryPattern;

class A {
    protected void msg() {
        System.out.println("Hello Java");
    }
}

public class Simple extends A {
    @Override
    protected void msg() {
        System.out.println("Hello Simple");
    }

    public static void main(String[] args) {
        Simple a = new Simple();
        a.msg();
    }
}
