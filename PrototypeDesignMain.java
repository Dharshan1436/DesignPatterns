package designPattrens;

interface Prototype {
    Prototype clone();
}
class Engine {
    String type;

    public Engine(String type) {
        this.type = type;
    }
}

class Car implements Prototype {
    private String model;
    Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    @Override
    public Prototype clone() {
        
        return new Car(this.model, this.engine);
    }

    @Override
    public String toString() {
        return "Car [Model: " + model + ", Engine: " + engine.type + "]";
    }
}

public class PrototypeDesignMain {
    public static void main(String[] args) {
        
        Engine engine = new Engine("V8");
        Car car1 = new Car("SUV", engine);
        System.out.println("Original Car: " + car1);

        
        Car car2 = (Car) car1.clone();
        System.out.println("Shallow Cloned Car: " + car2);

        
        car2.engine.type = "V12";
        System.out.println("Modified Cloned Car: " + car2);
        System.out.println("Original Car after modification: " + car1);
    }
}
