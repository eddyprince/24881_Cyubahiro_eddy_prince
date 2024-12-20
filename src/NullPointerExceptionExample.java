public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
