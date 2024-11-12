import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try (
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt");
        ) {        
            byte buffer[] = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            String text = new String(buffer, StandardCharsets.UTF_8);
            int numberOne;
            int numberTwo;
            Char[] numbers = "0123456789";
            for (String chr : text) {
                for (char num : numbers) {

                }
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}