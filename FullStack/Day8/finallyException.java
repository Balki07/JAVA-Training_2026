public class finallyException {
    public static void main(String[] args) {
        //int a = 10 / 0;
        try {
           int a = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}
