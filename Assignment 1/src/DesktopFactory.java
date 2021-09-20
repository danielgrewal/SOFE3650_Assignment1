
public class DesktopFactory implements ProductFactory {

    public Computer createComputer(float price) {
        return new Desktop(price);
    }
}
