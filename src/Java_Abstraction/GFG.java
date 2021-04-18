package Java_Abstraction;

// abstract class
abstract class ShapeGFG {
    // declare variable
    String objectName = "";
    ShapeGFG(String name) {
        this.objectName = name;
    }

    // declare non-abstract method
    public void moveTo(int x, int y)
    {
        System.out.println(this.objectName + " " + "has been moved to" + " x= " + x + " and y = " + y);
    }

    // abstract method which will be implement by subclass
    abstract public double area();
    abstract public void draw();
}

class RectangleGFG extends ShapeGFG {
    int length, width;

    //Constructor
    RectangleGFG(int length, int width, String name)
    {
        // super() is added in each class constructor automatically by compiler if there is no super().
        // super(name) ---> reusing parent constructor
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return (length * width);
    }

    public void draw(){
        System.out.println("Rectangle has been draw.");
    }
}

class CircleGFG extends ShapeGFG {
    int radius;
    double pi = 3.14;

    //Constructor
    CircleGFG(int radius, String name){
        // super(name) --> reusing parent constructor
        super(name);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle has been draw");
    }

    @Override
    public double area() {
        return ( (pi * Math.pow(pi, 2)) / 2);
    }
}


public class GFG {
    public static void main(String[] args) {
        ShapeGFG rect = new RectangleGFG(2, 3, "Rectangle");
        System.out.println("Area of rectangle : " + rect.area());
        rect.moveTo(1,2);

        System.out.println(" ");

        ShapeGFG circle = new CircleGFG(2, "Circle");
        System.out.println("Area of circle : " + circle.area());
        circle.moveTo(3,4);
    }

}
