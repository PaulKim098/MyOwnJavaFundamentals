package classes_and_objects_in_java.abstraction.event.adjustments;

public class PasswordChangeEvent extends AbstractEvent {

    public PasswordChangeEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " changed their password. " +
                "Sending a confirmation email to the customer.");
    }
}
