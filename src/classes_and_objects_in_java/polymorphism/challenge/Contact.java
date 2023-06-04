package classes_and_objects_in_java.polymorphism.challenge;

public class Contact {
    private String name;
    private PhoneNumber phoneNumber;
    private String emailAddress;

    public Contact(String name, PhoneNumber phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Contact(String name, PhoneNumber phoneNumber) { // example of compile-time polymorphism
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() { //runtime polymorphism override the default object toString functionality
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
