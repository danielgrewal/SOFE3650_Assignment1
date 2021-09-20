import java.util.Scanner;
import java.io.*;  
import org.junit.Test;


public class ProductFactoryTest {

    @Test
    public void ShouldReadCSVFile() {
        String filePath = new File("..\\prices.csv").getAbsolutePath();
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            System.out.print(scanner.next());
        }
        scanner.close();
    }
}