public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("invalid_number");
        } catch (NumberFormatException e) {
            // Handle the exception
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
