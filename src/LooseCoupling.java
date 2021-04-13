import java.io.IOException;

public class LooseCoupling {
    public static void main(String[] args) throws IOException{
        // Invoke the new instance or constructor
        Show b = new B();
        Show c = new C();

        A a = new A(b);
        //a.display() will print A and B
        a.display();

        A av = new A(c);
        //av.display() will print A and C
        av.display();
    }
}

interface Show {
    void display();
}

class A {

    //Declare local variable with Datatype and name
    Show s;

    //Declare pulic constructor with arguments or parameter (We can call Parameterized constructor)
    public A(Show s){
        //s is loosely coupled to A
        this.s = s;
    }

    //Declare public display method
    public void display() {
        System.out.println("A");
        System.out.println("S is : " + s);
        s.display();
    }
}

class B implements Show {
    public B(){}

    @Override
    public void display() {
        System.out.println("B");
    }
}

class C implements Show{
    public C(){}

    @Override
    public void display() {
        System.out.println("C");
    }
}