package main;

public class LaptopFactory implements ProductFactory {

    public Computer createComputer(float price) {
        return new Laptop(price);
    }


}
