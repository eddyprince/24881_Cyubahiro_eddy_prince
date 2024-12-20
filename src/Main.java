import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an exception to trigger (or type 'exit' to quit):");
            System.out.println("1. IOException");
            System.out.println("2. FileNotFoundException");
            System.out.println("3. EOFException");
            System.out.println("4. SQLException");
            System.out.println("5. ClassNotFoundException");
            System.out.println("6. ArithmeticException");
            System.out.println("7. NullPointerException");
            System.out.println("8. ArrayIndexOutOfBoundsException");
            System.out.println("9. ClassCastException");
            System.out.println("10. IllegalArgumentException");
            System.out.println("11. NumberFormatException");

            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("exit")) {
                break;
            }

            switch (choice) {
                case "1":
                    triggerIOException();
                    break;
                case "2":
                    triggerFileNotFoundException();
                    break;
                case "3":
                    triggerEOFException();
                    break;
                case "4":
                    triggerSQLException();
                    break;
                case "5":
                    triggerClassNotFoundException();
                    break;
                case "6":
                    triggerArithmeticException();
                    break;
                case "7":
                    triggerNullPointerException();
                    break;
                case "8":
                    triggerArrayIndexOutOfBoundsException();
                    break;
                case "9":
                    triggerClassCastException();
                    break;
                case "10":
                    triggerIllegalArgumentException();
                    break;
                case "11":
                    triggerNumberFormatException();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 11.");
            }
        }
        scanner.close();
    }

    public static void triggerIOException() {
        try {
            FileReader file = new FileReader("non_existent_file.txt");
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }
    }

    public static void triggerFileNotFoundException() {
        try {
            FileInputStream file = new FileInputStream("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        }
    }

    public static void triggerEOFException() {
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

    public static void triggerSQLException() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/non_existent_db", "user", "password");
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }

    public static void triggerClassNotFoundException() {
        try {
            Class.forName("com.unknown.ClassName");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }
    }

    public static void triggerArithmeticException() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }

    public static void triggerNullPointerException() {
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }

    public static void triggerArrayIndexOutOfBoundsException() {
        try {
            int[] arr = new int[3];
            int value = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void triggerClassCastException() {
        try {
            Object i = Integer.valueOf(42);
            String s = (String) i;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
    }

    public static void triggerIllegalArgumentException() {
        try {
            Thread.sleep(-1);
        } catch (IllegalArgumentException | InterruptedException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void triggerNumberFormatException() {
        try {
            int number = Integer.parseInt("invalid_number");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
