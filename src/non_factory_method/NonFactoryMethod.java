package non_factory_method;

class Car {
    void drive() {
        System.out.println("Driving a car");
    }
}

class Motorcycle {
    void ride() {
        System.out.println("Riding a motorcycle");
    }
}

class Bicycle {
    void pedal() {
        System.out.println("Pedaling a bicycle");
    }
}

public class NonFactoryMethod {
    public static void main(String[] args) {
        String transportType = "car";

        if (transportType.equals("car")) {
            Car car = new Car();
            car.drive();
        } else if (transportType.equals("motorcycle")) {
            Motorcycle motorcycle = new Motorcycle();
            motorcycle.ride();
        } else if (transportType.equals("bicycle")) {
            Bicycle bicycle = new Bicycle();
            bicycle.pedal();
        }
    }
}
