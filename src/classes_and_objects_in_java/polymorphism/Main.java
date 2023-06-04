package classes_and_objects_in_java.polymorphism;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void addRandomNumber(ArrayList<Integer> list){
        int originalSize = list.size();
        Random random = new Random();
        int n = random.nextInt(1000);

        if (list instanceof ConditionArrayList){
            ConditionArrayList conditionList = (ConditionArrayList) list;
            while (!conditionList.isEligible(n)) {
                n = random.nextInt(1000);
            }
        }
        list.add(n);
    }

    public static void main(String[] args) {

        ConditionArrayList oddList = new ConditionArrayList(
                n -> Math.abs(n) % 2 == 1);
        oddList.add(1);
        oddList.add(2);
        addRandomNumber(oddList);
        System.out.println(oddList);

        ConditionArrayList evenList = new ConditionArrayList(
                n -> Math.abs(n) % 2 == 0);
        evenList.add(1);
        evenList.add(2);
        addRandomNumber(evenList);
        System.out.println(evenList);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        addRandomNumber(list);
        System.out.println(list);


//        ConditionArrayList1 oddList = new ConditionArrayList1(1, 2, 3, 4, 7, 9, -13);
//
//        System.out.println(oddList);
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(7);
//        list.add(9);
//        list.add(-13);
//
//        System.out.println(list);


    }
}
