public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.unknown.ClassName");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }
    }
}
