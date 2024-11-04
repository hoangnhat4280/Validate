public class ClassNameTest {
    private static ClassName className;

    public static final String[] validClassName = new String[] {"C0223G", "A0323K", "P1234H", "C1234I"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P0323A", "C123G", "A12345K", "A0323@K"};

    public static void main(String[] args) {
        className = new ClassName();

        for (String validName : validClassName) {
            boolean isValid = className.validate(validName);
            System.out.println("Class name: " + validName + " is valid: " + isValid);
        }

        for (String invalidName : invalidClassName) {
            boolean isValid = className.validate(invalidName);
            System.out.println("Class name: " + invalidName + " is valid: " + isValid);
        }
    }
}
