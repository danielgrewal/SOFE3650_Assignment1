import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductFactoryTest {

    float laptopPrice;
    float desktopPrice;
    
    @Test
    public void ShouldSetPriceOnDesktop() {

        DesktopFactory factory = new DesktopFactory();
        Computer computer = factory.createComputer(1000f);
        assertEquals(computer.getPrice(),1000f,0);
    }

    @Test
    public void ShouldSetPriceOnLaptop() {

        LaptopFactory factory = new LaptopFactory();
        Computer computer = factory.createComputer(700f);
        assertEquals(computer.getPrice(),700f,0);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("./prices.csv"));

        // THIS IS WHY WE WERE GETTING THE STATIC ERRORS...
        // We need an instance of the ProductFactoryTest object.... now it works
        ProductFactoryTest factorytest = new ProductFactoryTest();

        //scanner.useDelimiter(",");
        while(scanner.hasNext()){

            String line = scanner.next();
            String[] lineParts = line.split(",");
            
            //System.out.println(lineParts[0]);
            //System.out.println(lineParts[1]);

            //System.out.println(Float.parseFloat(lineParts[1]));

            if(lineParts[0].contains("desktop")){
                System.out.println("YAY");

                factorytest.desktopPrice = Float.parseFloat(lineParts[1]);
                
                System.out.println(factorytest.desktopPrice);
            }

            
            
            //System.out.print(scanner.next()+"|");
        }
        scanner.close();
    }

}