package classes_and_objects_in_java.polymorphism.adjustments;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isDivisibleByThree = n -> Math.abs(n) % 3 == 0;
        ConditionArrayList1 divisibleByThreeListy =
                new ConditionArrayList1(isDivisibleByThree);

        ConditionArrayList1 divisibleByThreeListy2 =
                new ConditionArrayList1(isDivisibleByThree,
                        1, 2, 3, 4, 5, 6, 9);

        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(1);
        numsList.add(4);
        numsList.add(3);
        numsList.add(6);
        numsList.add(13);

        ConditionArrayList1 divisibleByThreeListy3 =
                new ConditionArrayList1(isDivisibleByThree,
                        numsList);

        Predicate<Integer> isDivisbleBySix = n -> Math.abs(n) % 6 == 0;
        ConditionArrayList1 divisibleBySixListy = new ConditionArrayList1(
                isDivisbleBySix, divisibleByThreeListy);
    }

}
