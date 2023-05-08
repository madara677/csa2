package CSA2;

public class test2 {

        public static void main(String[] args) {
            Vehicle vehicle = new Vehicle(4, 500);
            vehicle.display();

            Car car = new Car();
            car.display();

            Truck truck = new Truck();
            truck.display();
            truck.load(4000);
            truck.display();
            truck.load(2000);
            truck.display();
        }

}

class Vehicle {
    private int wheels;
    private double weight;

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void display() {
        System.out.println("Wheels: " + wheels);
        System.out.println("Weight: " + weight);
    }
}

class Car extends Vehicle {
    private int loader;

    public Car() {
        super(4, 1000);
        this.loader = 5;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Loader: " + loader);
    }
}

class Truck extends Vehicle {
    private int loader;
    private double payload;

    public Truck() {
        super(6, 5000);
        this.loader = 3;
        this.payload = 0;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Loader: " + loader);
        System.out.println("Payload: " + payload);
    }

    public void load(double weight) {
        if (payload + weight > 5000) {
            System.out.println("Overload!");
        } else {
            payload += weight;
        }
    }
}


