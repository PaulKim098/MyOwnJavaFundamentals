package classes_and_objects_in_java.polymorphism.challenge;

public class PhoneNumber {
    private int countryCode;
    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 10) {
            this.countryCode = Integer.parseInt(phoneNumber
                    .substring(0, phoneNumber.length() - 10));
            this.phoneNumber = phoneNumber
                    .substring(phoneNumber.length() - 10);
        } else {
            this.countryCode = 1;
            this.phoneNumber = phoneNumber;
        }
    }

    public PhoneNumber(int countryCode, String phoneNumber) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() { // //runtime polymorphism override the default object toString functionality
        return "PhoneNumber{" +
                "countryCode=" + countryCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
