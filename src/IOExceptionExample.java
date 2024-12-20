import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("non_existent_file.txt");
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }
    }
}
