package Baitap;

public class PhoneNumberTest {
    public static void main(String[] args) {
        PhoneNumber validator = new PhoneNumber();

        String[] validPhoneNumbers = {
                "(84)-(0978489648)",
                "(12)-(0123456789)"
        };

        String[] invalidPhoneNumbers = {
                "(a8)-(22222222)",
                "(84)-(22b22222)",
                "(84)-(9978489648)"
        };

        System.out.println("Valid phone numbers:");
        for (String phoneNumber : validPhoneNumbers) {
            boolean isValid = validator.validate(phoneNumber);
            System.out.println("Phone number: " + phoneNumber + " is valid: " + isValid);
        }

        System.out.println("\nInvalid phone numbers:");
        for (String phoneNumber : invalidPhoneNumbers) {
            boolean isValid = validator.validate(phoneNumber);
            System.out.println("Phone number: " + phoneNumber + " is valid: " + isValid);
        }
    }
}