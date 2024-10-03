package factory_method;

// Step 1: Define a common interface
interface Transport {
    void move();
}

// Step 2: Implement Concrete Classes
class Car implements Transport {
    public void move() {
        System.out.println("Driving a car");
    }
}

class Motorcycle implements Transport {
    public void move() {
        System.out.println("Riding a motorcycle");
    }
}

class Bicycle implements Transport {
    public void move() {
        System.out.println("Pedaling a bicycle");
    }
}

// Step 3: Create Factory Class
class TransportFactory {
    public Transport createTransport(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return switch (type.toLowerCase()) {
            case "car" -> new Car();
            case "motorcycle" -> new Motorcycle();
            case "bicycle" -> new Bicycle();
            default -> throw new IllegalArgumentException("Unknown transport type " + type);
        };
    }
}

// Step 4: Use Factory in Client Code
public class FactoryMethod {
    public static void main(String[] args) {
        TransportFactory factory = new TransportFactory();
        String transportType = "car";

        Transport transport = factory.createTransport(transportType);
        if (transport != null) {
            transport.move();
        } else {
            System.out.println("Invalid transport type");
        }
    }
}
