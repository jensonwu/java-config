import java.io.*;
import java.util.Scanner;

public class TestScan {

    public static void main(String[] args) throws IOException {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new FileReader("sample.txt"));

            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

}
