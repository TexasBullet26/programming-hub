import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

/**
 * This creates an empty file at the specified path.
 */

public class MyClass {
    public static void main(String[] args) {
        try {
            Formatter f = new Formatter("C:\\Users\\Trey\\GitHub\\prog-hub\\java\\TestTwo.md");
            f.format("%s %s %s", "1","Trey", "Lanzer \r\n");
            f.format("%s %s %s", "2","Tanner", "Lanzer");
            f.close();

            File x = new File("C:\\Users\\Trey\\GitHub\\prog-hub\\java\\TestTwo.md");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (Exception e) {
        System.out.println("Error");
        }
    }
}
