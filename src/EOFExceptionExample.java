import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                System.out.println(ois.readObject());
            }
        } catch (EOFException e) {
            System.out.println("EOFException: Reached the end of file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
