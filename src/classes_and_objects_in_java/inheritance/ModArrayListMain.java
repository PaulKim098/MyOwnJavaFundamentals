package classes_and_objects_in_java.inheritance;

public class ModArrayListMain {
    public static void main(String[] args) {
        ModArrayList list = new ModArrayList();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.getUsingMod(1));
        System.out.println(list.getUsingMod(-2));
        System.out.println(list.getUsingMod(40));

    }
}
