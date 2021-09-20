
public class DesktopFactory implements ProductFactory {

    Computer computer;

    @Override
    public Computer createComputer() {
        return new Desktop();
    }

    @Override
    public void setPrice(float price) {
        this.computer.setPrice(price);
    }
}
