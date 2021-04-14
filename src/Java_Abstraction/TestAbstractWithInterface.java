package Java_Abstraction;

interface A {
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A {
    public void b() {
        System.out.println("I am B.");
    }
}

class M extends B {
    @Override
    public void a() {
        System.out.println("I am A.");
    }

    @Override
    public void c() {
        System.out.println("I am C.");
    }

    @Override
    public void d() {
        System.out.println("I am D.");
    }
}

public class TestAbstractWithInterface extends M{
    public static void main(String[] args) {
        A m1 = new M();
        M m2 = new M();
        m1.a();
        m1.b();
        m1.c();
        m1.d();
    }
}
