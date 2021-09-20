package test;
import main.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.assertEquals;

public class ProductFactoryTest {

    float laptopPrice;
    float desktopPrice;
    
    @ParameterizedTest
    @CsvFileSource(resources = "./data/prices.csv")
    public void ShouldSetPriceOnDesktopAndLaptop(String type, float price) {
        
        if (type == "laptop") {
            this.laptopPrice = price;
        } 
        else if (type == "desktop") {
            this.desktopPrice = price;
        }
        // Test Laptop price was set
        DesktopFactory desktopFactory = new DesktopFactory();
        Computer computerDesktop = desktopFactory.createComputer(desktopPrice);
        assertEquals(computerDesktop.getPrice(),desktopPrice,0);

        // Test Desktop price was set
        LaptopFactory laptopFactory = new LaptopFactory();
        Computer computerLaptop = laptopFactory.createComputer(desktopPrice);
        assertEquals(computerLaptop.getPrice(),desktopPrice,0);
    }
}