public class Car {
    String carName;

    public Car(String name){
        // This constructor has one parameter, name;
        this.carName = name;
        System.out.println("Car name is " + this.carName);
    }

    public void setCarName(String name){
        carName = name;
    }

    public String getCarName(){
        return carName;
    }

    public static void main(String[] args) {
        Car car = new Car("Honda");
        car.setCarName("TOYOTA");
        System.out.println(car.getCarName());

        Car car1 = new Car("Porchse");

    }
}
