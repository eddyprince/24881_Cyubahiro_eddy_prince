public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            Object i = Integer.valueOf(42);
            String s = (String) i;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
    }
}
