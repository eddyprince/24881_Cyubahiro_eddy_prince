public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            Thread.sleep(-1);
        } catch (IllegalArgumentException | InterruptedException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
