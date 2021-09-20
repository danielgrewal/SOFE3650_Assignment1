
public class LaptopFactory implements ProductFactory {

    float price;

    @Override
    public Computer createComputer() {
        return new Laptop();
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }
}
